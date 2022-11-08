/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosExtra;

/**
 *
 * @author galin
 */
import java.util.Scanner;

public class Ejercicio2C {

    public static void main(String[] args) {
        int orden, i, j, sumaDiagonal;
        i = 0;
        j = 0;
        sumaDiagonal = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese orden de la matriz ");
        orden = sc.nextInt();
        int Matriz[][] = new int[orden][orden];
        CargarMatriz(Matriz, orden, i, j);
        System.out.println(SumarDiagonal(Matriz, orden, i, j, sumaDiagonal));

    }

    public static int SumarDiagonal(int Matriz[][], int orden, int fila, int colum, int sumaDiagonal) {

        if (fila != orden - 1 || colum != orden - 1) {
            if (colum < orden) {
                if (fila == colum) {
                    sumaDiagonal = Matriz[fila][colum] + SumarDiagonal(Matriz, orden, fila, colum + 1, sumaDiagonal);
                } else {
                    sumaDiagonal =SumarDiagonal(Matriz, orden, fila, colum + 1, sumaDiagonal);
                }
            } else {
                sumaDiagonal =SumarDiagonal(Matriz, orden, fila + 1, 0, sumaDiagonal);
            }
        }else{
            sumaDiagonal =sumaDiagonal+ Matriz[fila][colum];
        }
        return sumaDiagonal;
    }

    public static void CargarMatriz(int Matriz[][], int orden, int i, int j) {
        int num;

        Scanner sc = new Scanner(System.in);
        if (i != orden - 1 || j != orden - 1) {
            if (j < orden) {
                System.out.println("Ingrese numero");
                num = sc.nextInt();
                Matriz[i][j] = num;
                CargarMatriz(Matriz, orden, i, j + 1);
            } else {
                CargarMatriz(Matriz, orden, i + 1, 0);
            }
        } else {
            System.out.println("Ingrese numero");
            num = sc.nextInt();
            Matriz[i][j] = num;
        }
    }
}

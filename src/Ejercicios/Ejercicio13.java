/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author galin
 */
import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
        int fila, colum, i, j,Numayor,mayor;
        i = 0;
        j = 0;
        mayor=0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese cantidad Filas");
        fila = sc.nextInt();
        System.out.println("Ingrese cantidad Filas");
        colum = sc.nextInt();
        int[][] Numeros = new int[fila][colum];
        CargarMatriz(Numeros, i, j);
        mayor=MayorNumero(Numeros,i,j,mayor);
        System.out.println(mayor);

    }

    public static void CargarMatriz(int[][] Matriz, int i, int j) {
        int num;
        Scanner sc = new Scanner(System.in);
        if (i != Matriz.length - 1 || j != Matriz[0].length - 1) {
            if (j < Matriz[0].length) {
                System.out.println("Ingrese numero");
                num = sc.nextInt();
                Matriz[i][j] = num;
                CargarMatriz(Matriz, i, j + 1);
            } else {
                CargarMatriz(Matriz, i + 1, 0);
            }
        } else {
            System.out.println("Ingrese numero");
            num = sc.nextInt();
            Matriz[i][j] = num;
        }
    }

    public static int MayorNumero(int[][] Matriz, int i, int j,int mayor) {//metemos a mayor por parametros porque sino hay problemas a la hora del caso base 
                                                                           //mayor =0; en el caso base;
        
        if (i != Matriz.length - 1 || j != Matriz[0].length - 1) {
            if (j < Matriz[0].length) {
                if (mayor < Matriz[i][j]) {
                    mayor = Matriz[i][j];
                }
                mayor=MayorNumero(Matriz, i, j + 1,mayor);
            } else {
                mayor=MayorNumero(Matriz, i + 1, 0,mayor);
            }
        } else {//caso base lenght-1
            if (mayor < Matriz[i][j]) {
                mayor = Matriz[i][j];
            }
        }
        return mayor;
    }

}

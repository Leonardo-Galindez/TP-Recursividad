/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaParcial;

/**
 *
 * @author galin
 */
public class sumaMatriz {

    public static void main(String[] args) {
        int Matriz[][] = {{1, 2, 3},
                          {4, 5, 6},
                          {7, 8, 9}};
        int i, j;
        i = 0;
        j = 0;
        System.out.println(sumaDiagonal(Matriz, i));
    }

    public static int suma(int Matriz[][], int i, int j) {
        int suma = 0;

        if (i != Matriz.length - 1 || j != Matriz[0].length - 1) {
            if (j < Matriz[0].length) {
                suma = Matriz[i][j] + suma(Matriz, i, j + 1);
            } else {
                suma = suma(Matriz, i + 1, 0);
            }
        } else {
            suma = Matriz[i][j];
        }

        return suma;
    }

    public static int sumaDiagonal(int Matriz[][], int i) {
        int suma = 0;
        if (i < Matriz.length - 1) {
            suma = Matriz[i][i] + sumaDiagonal(Matriz, i + 1);
        }else{
            suma=Matriz[i][i];
        }
        return suma;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author galin
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        int suma, fila, colum;
        fila = 0;
        colum = 0;
        int[][] Numeros = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println(SumaFila(fila, colum, Numeros));
    }

    //Algoritmo iterativo
    public static int Suma(int[][] Matriz) {
        int suma;
        suma = 0;
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz.length; j++) {
                suma = suma + Matriz[i][j];
            }
        }
        return suma;
    }

    //Algoritmo recursivo
    public static int  SumaFila(int fila, int colum, int[][] Matriz) {
        int suma=0;
        System.out.print(Matriz[fila][colum] + " ");
        
        if (fila != Matriz.length - 1 || colum != Matriz[0].length - 1) {

            if (colum < Matriz[0].length - 1) {
                suma=Matriz[fila][colum]+SumaFila(fila, colum + 1, Matriz);
            } else {
                colum = 0;
                System.out.println("");
                suma=Matriz[fila][colum]+SumaFila(fila + 1, colum, Matriz);

            }

        }
        return suma;

    }

}

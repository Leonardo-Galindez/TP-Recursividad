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

public class Ejercicio14 {

    public static void main(String[] args) {
        int i, j, fila, colum;
        i = 0;
        j = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese cantidad Filas");
        fila = sc.nextInt();
        System.out.println("Ingrese cantidad Filas");
        colum = sc.nextInt();
        int[][] Numeros = new int[fila][colum];
        Ejercicio13.CargarMatriz(Numeros, i, j);//llamada al modulo de carga de matr
        int[] Columna = new int[fila];
        CrearArregloColum(Numeros, Columna, i, j);
    }

    public static int SumaArreglo(int[] Array, int i) {
        int suma = 0;
        if (i >= 0) {
            suma = Array[i] + SumaArreglo(Array, i - 1);
        }
        return suma;
    } /*1 2 3
        4,5,6
        7,8,9*/

    public static void CrearArregloColum(int[][] Matriz, int[] Array, int i, int j) {

        if (i != Matriz.length - 1 || j != Matriz[0].length - 1) {
            if (i < Matriz.length) {
                Array[i] = Matriz[i][j];
                CrearArregloColum(Matriz, Array, i + 1, j);
            } else {
                System.out.println("Suma Columna:" + SumaArreglo(Array, i-1));
                CrearArregloColum(Matriz, Array, 0, j + 1);
            }
        } else {
            Array[i] = Matriz[i][j];
            System.out.println("Suma Columna:" + SumaArreglo(Array, i));
        }
    }
}

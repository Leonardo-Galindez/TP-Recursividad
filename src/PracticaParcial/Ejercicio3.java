/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaParcial;

/**
 *
 * @author galin
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        int Matriz[][] = {{1, 0, 0},
        {0, 1, 0},
        {0, 0, 1}};
        int fila = 0, colum = 0;
        boolean valor = false;
        System.out.println(matrizIndentidad(Matriz, fila, colum));

    }

    //consulta sobre si la variable boolean la meto por parametros o no ????????
    public static boolean matrizIndentidad(int Matriz[][], int fila, int colum) {
        boolean identidad = true;
        if (fila != Matriz.length - 1 || colum != Matriz.length - 1) {//---------------------
            if (colum < Matriz[0].length) {//-------------------------------------
                if (fila == colum) {
                    if (Matriz[fila][colum] != 1) {
                        identidad = false;
                    } else {
                        identidad = matrizIndentidad(Matriz, fila, colum + 1);
                    }
                } else {
                    if (Matriz[fila][colum] != 0) {
                        identidad = false;
                    } else {
                        identidad = matrizIndentidad(Matriz, fila, colum + 1);
                    }
                }
            }else{
                identidad = matrizIndentidad(Matriz, fila + 1, 0);
            }
        } else {
            if (Matriz[fila][colum] != 1) {
                identidad = false;
            }
        }
        return identidad;
    }
}

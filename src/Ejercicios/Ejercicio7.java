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
        System.out.println("");
        System.out.println(SumaMatriz(fila, colum, Numeros));
    }

    public static int SumaFila(int c,int [] Array){
        int suma;
        suma=0;
        if(c<Array.length){
            System.out.println(Array[c]);
            suma=SumaFila(c+1,Array);
            //suma=Array[c]+SumaFila(c+1,Array);
        }
        return suma;
    }
//otro modulo suma de columas
    //Algoritmo recursivo
    public static int SumaMatriz(int fila, int colum, int[][] Matriz) {
        int sumaM = 0,sumaF=0;
        int []Fila= new int [Matriz[0].length];
        //System.out.print(Matriz[fila][colum] + " ");
        
        if (fila != Matriz.length - 1 || colum != Matriz[0].length - 1) {
            //2
            if (colum <= Matriz[0].length - 1) {
                System.out.print(Matriz[fila][colum]+" ");
                Fila[colum]=Matriz[fila][colum];
                sumaM = Matriz[fila][colum] + SumaMatriz(fila, colum + 1, Matriz);

            } else {
                System.out.println(SumaFila(colum-1,Fila));
                System.out.println("");
                colum = 0;
                fila++;
                sumaM = SumaMatriz(fila, colum, Matriz);

            }

        } else {
            System.out.print(Matriz[fila][colum]+" ");
            sumaM = Matriz[fila][colum];//caso base
            System.out.println("");
        }

        return sumaM;

    }

}

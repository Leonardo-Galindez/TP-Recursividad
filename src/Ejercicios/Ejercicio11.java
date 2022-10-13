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

public class Ejercicio11 {

    public static void main(String[] args) {
        int pos, sumaPar, sumaImpar, i;
        i = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese posiciones del arreglo");
        pos = sc.nextInt();

        int[] Numeros = new int[pos];
        CargarArray(Numeros, i);
        sumaPar = SumaPar(Numeros, i);
        sumaImpar = SumaImpar(Numeros, i);
        System.out.println("Suma Par:" + sumaPar);
        System.out.println("Suma Impar:" + sumaImpar);

    }

    public static void CargarArray(int[] Array, int i) {
        Scanner sc = new Scanner(System.in);
        int num;
        if (i < Array.length) {
            System.out.println("Ingrese numero");
            num = sc.nextInt();
            Array[i] = num;
            CargarArray(Array, i + 1);
        }

    }

    public static int SumaPar(int[] Array, int i) {
        int suma;
        suma = 0;

        if (i < Array.length) {
            if (i % 2 == 0) {
                suma = Array[i] + SumaPar(Array, i + 1);
            } else {
                suma = SumaPar(Array, i + 1);
            }
        }

        return suma;
    }

    public static int SumaImpar(int[] Array, int i) {
        int suma;
        suma = 0;

        if (i < Array.length) {
            if (i % 2 != 0) {
                suma = Array[i] + SumaImpar(Array, i + 1);
            } else {
                suma = SumaImpar(Array, i + 1);
            }
        }

        return suma;
    }
}

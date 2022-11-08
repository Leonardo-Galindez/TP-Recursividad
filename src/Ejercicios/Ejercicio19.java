/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author galin
 */
public class Ejercicio19 {

    public static void main(String[] args) {

        int medio, altura, i;
        int espacios;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese altura de la piramide");
        altura = sc.nextInt();
        espacios = altura;
        medio = 1;
        i = 1;
     
        System.out.println("");
        Piramide(altura, medio, espacios, i);

    }

    public static void Piramide(int altura, int medio, int espacios, int i) {

        if (altura >= medio) {

            if (i < espacios) {
                System.out.print(" ");
                Piramide(altura, medio, espacios, i + 1);
            } else {
                IzquierdaDerecha(medio, 1);
                System.out.println("");
                Piramide(altura, medio + 1, espacios - 1, 1);
            }
        }
    }
    

    public static void IzquierdaDerecha(int medio, int i) {
        if (i < medio) {
            System.out.print(i);
            IzquierdaDerecha(medio, i + 1);
        } else {
            DerechaIzquierda(medio);
        }
    }

    public static void DerechaIzquierda(int medio) {
        if (medio > 0) {
            System.out.print(medio);
            DerechaIzquierda(medio - 1);
        }
    }

    ////////////////
    /*public static void MostrarPiramide(int i, int j) {
        if (i <= j) {
            System.out.print(i);
            MostrarPiramide(i, j);

        }
    }

    public static void MediaPiramide(int renglones, int i) {

        if (i < renglones) {

            MostrarPiramide(i);

            System.out.println("");
            MediaPiramide(renglones, i + 1);
        }
    }

    public static void MostrarPiramide(int i) {

        if (i > 0) {
            System.out.print(i);
            MostrarPiramide(i - 1);
        }
    }

    /*public static void PiramideInvert(int i, int j, int renglones, int aux) {

        if (i < renglones) {
            if (j < aux) {
                System.out.println(" ");
                PiramideInvert(i, j + 1, renglones, aux);
            } else {
                aux--;
                System.out.println(i);
                PiramideInvert(i + 1, 1, renglones, aux);
            }
        } else {
            System.out.println(i);
        }

    }

    public static void MostrarPiramide(int i, int renglones) {

        if (i < renglones) {
            System.out.print(i);
            MostrarPiramide(i + 1, renglones);
        }
    }*/
}

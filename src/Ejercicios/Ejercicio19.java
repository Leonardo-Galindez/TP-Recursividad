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

        int i, j, renglones;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese renglones");
        renglones = sc.nextInt();
        i = 1;
        j = 1;
        MediaPiramide(renglones, i);
    }

    public static void MediaPiramide(int renglones, int i) {

        if (i <= renglones) {

            MostrarPiramide(i);
            PiramideInvert(i,renglones);
            System.out.println("");
            MediaPiramide(renglones, i + 1);
        }
    }
    public static void PiramideInvert(int i,int renglones){
        System.out.println("");
        if(i<renglones){
            System.out.println(i);
            PiramideInvert(i+1,renglones);
        }
    }

    public static void MostrarPiramide(int i) {

        if (i > 0) {
            System.out.print(i);
            MostrarPiramide(i - 1);
        }
    }

}

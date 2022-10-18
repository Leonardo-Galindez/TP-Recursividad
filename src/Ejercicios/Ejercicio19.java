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

        int i, j, altura;
        int aux;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese altura de la piramide");
        altura = sc.nextInt();
        aux = altura;
        i=1;
    
        MediaPiramide(altura, i);
        //PiramideInvert(i,j,renglones,aux);
   
}

public static void Piramide(int altura, int j, int i,int aux) {

        
        
        
        if(i<=altura){
            if(j<aux){
                System.out.print(" ");
                Piramide(altura,j+1,i,aux);
            }else{
                System.out.println(i);
                Piramide(altura,1,i+1,aux-1);
            }
        }
        /*if (i<altura) {
            if (i <= j) {
                System.out.print(i);
                Piramide(altura, j, i + 1);
            } else {
                System.out.println("");
                Piramide(altura,j+1,1);

            }
        }*/
    }

    public static void MediaPiramide(int renglones, int i) {

        if (i <= renglones) {

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
    
    

    public static void PiramideInvert(int i, int j, int renglones, int aux) {

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
    }

     
}

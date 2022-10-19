/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosExtra;

/**
 *
 * @author galin
 */
import java.util.Scanner;

public class Piramide4a {

    public static void main(String[] args) {
        int filas, asteriscos, alto, espacio;
        char caracter;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese numero");
        filas = sc.nextInt();
        alto = 1;
        espacio = 1;
        asteriscos = 1;
        Piramide(filas, alto, espacio, asteriscos);
        MediaPiramide(filas, asteriscos);
    }

    public static void Piramide(int filas, int alto, int espacio, int asteriscos) {

    }

    //Imprimi Lateral derecho
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

}

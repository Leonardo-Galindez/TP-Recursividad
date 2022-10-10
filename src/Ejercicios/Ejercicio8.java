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

public class Ejercicio8 {

    public static void main(String[] args) {
        String frase;
        int lon, i;
        i = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese Frase");
        frase = sc.nextLine();
        lon = frase.length();

        System.out.println(esPalindromo(frase, i, lon));

    }
    //funciona solo con una palabra
    //posible solucion para una frase sacar los espacios de la frase y unir todas las palabres
    public static boolean esPalindromo(String frase, int i, int j) {
        boolean valorFrase;
        valorFrase = false;
        String auxFrase;
        auxFrase = frase.substring(i, j);
        if (auxFrase.length() != 1) {
            if (frase.charAt(i) == frase.charAt(j - 1)) {
                valorFrase = true;
            } else {
                valorFrase = false;
            }
            esPalindromo(frase, i + 1, j - 1);
        }

        return valorFrase;
    }
}

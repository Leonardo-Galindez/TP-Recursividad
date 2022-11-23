/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaParcial;

/**
 *
 * @author galin
 */
import java.util.Scanner;

public class palindromo {

    public static void main(String[] args) {
        String cadena;
        int i, j;
        i = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese cadena ");
        cadena = sc.nextLine();
        j = cadena.length() - 1;

        System.out.println(palindromo(cadena, i, j));

    }

    public static boolean palindromo(String cadena, int i, int j) {
        boolean valor = true;
        if (i <= cadena.length()/2) {
            if (cadena.charAt(i) == cadena.charAt(j)) {
                valor = palindromo(cadena, i + 1, j - 1);
            } else {
                valor = false;
            }
        }

        return valor;
    }
}

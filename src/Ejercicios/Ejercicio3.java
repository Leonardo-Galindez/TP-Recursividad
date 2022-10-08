/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author galin
 */
public class Ejercicio3 {


    public static void main(String[] args) { //averiguar que hace mistery
        String numero;
        numero = "123456789";
        int j;
        j = numero.length() - 1;
        mistery(j, numero);
    }

    public static void mistery(int p, String a) {
        if (p > 0) {
            System.out.println(a.charAt(p));
            mistery(p - 1, a);
        }

   

 
    }
}

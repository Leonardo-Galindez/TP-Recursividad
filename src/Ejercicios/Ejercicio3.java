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

<<<<<<< HEAD
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
=======
    public static void main(String[] args) {

>>>>>>> bb34147e5b51c16d1fc6c557b5fc795364cf1b58
    }

    public static int algo(int n) { //precondicion: n es un entero positivo
        int aux;
        if (n == 1) {
            aux = 1;
        } else {
            aux = algo(n - 1) + 1;
        }
        return aux;
    }

}

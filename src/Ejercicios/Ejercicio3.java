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

    public static void main(String[] args) {

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

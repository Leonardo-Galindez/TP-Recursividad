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

public class Ejercicio18 {

    public static void main(String[] args) {
        int n, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese numero");
        n = sc.nextInt();
        System.out.println("Ingrese numero bomba");
        b = sc.nextInt();
        Explota(n, b);

    }

    public static void Explota(int num, int numBomba) {

        if (num > numBomba) {

            System.out.println(num);

            Explota(num - (num / numBomba), numBomba);
        } else {
            System.out.println(num);
        }

    }
}

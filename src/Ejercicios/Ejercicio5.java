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

public class Ejercicio5 {

    public static void main(String[] args) {
        int cont;
        cont=ContarMult3();
        System.out.println(cont);

    }

    public static int ContarMult3() {
        Scanner sc = new Scanner(System.in);
        int num;
        int cont = 0;
        System.out.println("Ingrese numero");
        num = sc.nextInt();
        if (num != 0) {
            if (num % 3 == 0) {
                cont = 1 + ContarMult3();
            }

        }
        return cont;
    }

}

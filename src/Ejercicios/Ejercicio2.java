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
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        
        int num,numero;
        System.out.println("ingrese numero");
        num=sc.nextInt();
        numero=algo(num);
        System.out.println(numero);
        
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

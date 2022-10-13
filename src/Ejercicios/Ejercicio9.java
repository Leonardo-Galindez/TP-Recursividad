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

public class Ejercicio9 {

    public static void main(String[] args) {
        int divisor, dividendo, cociente, resto;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Ingrese Divisor");
            divisor = sc.nextInt();
            System.out.println("Ingrese Dividendo");
            dividendo = sc.nextInt();

            cociente = dividendo / divisor;
            resto = dividendo % divisor;
            DivisionResta(dividendo, divisor,cociente,resto);
        } while (dividendo != 0);
    }

    public static int DivisionResta(int num1, int num2,int cos, int rest) {
        
        if (num1!=rest) {
            System.out.println(DivisionResta(num1-cos,num2,cos,rest));
        }
        
        return num1;
    }
}

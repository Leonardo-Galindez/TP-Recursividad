/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaParcial;

/**
 *
 * @author galin
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        int numero =2214, digito = 2, cont = 0;

        System.out.println(contarDigitos(numero, digito));
    }

    public static int contarDigitos(int num, int digito) {
        int cont = 0, resto;
        resto = num % 10;
        if (num > 9) {
            if (resto == digito) {
                cont += 1 + contarDigitos(num / 10, digito);
            } else {
                cont = contarDigitos(num / 10, digito);
            }
        } else {
            if (resto == digito) {
                cont += 1;
            }
        }
        return cont;
    }
}

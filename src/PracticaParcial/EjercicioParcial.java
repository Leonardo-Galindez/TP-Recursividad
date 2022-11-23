/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaParcial;

/**
 *
 * @author galin
 */
public class EjercicioParcial {

    public static void main(String[] args) {

        piramide(4,4,1,1);

    }

    public static int sumaDigitos(int num) {
        int suma = 0;

        if (num > 9) {
            suma = suma + num % 10 + sumaDigitos(num / 10);
        } else {
            suma = suma + num;
        }
        return suma;
    }

    public static void piramide(int altura, int espacios, int posF, int posC) {
        if (posF <= altura) {
            if (posC < espacios) {
                System.out.print(" ");
                piramide(altura, espacios, posF, posC+1);
            } else {
                ladoIzquierdo(posF, 1);
                System.out.println("");
                piramide(altura,espacios-1,posF+1,1);
            }
        }

    }

    public static void ladoIzquierdo(int cant, int i) {
        if (cant > i) {
            System.out.print("*");
            ladoIzquierdo(cant, i+1);
        }else{
            ladoDerecho(cant);
        }
    }
    
    public static void ladoDerecho(int tope){
        if(tope>0){
            System.out.print("*");
            ladoDerecho(tope-1);
        }
    }
}

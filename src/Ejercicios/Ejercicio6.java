/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author galin
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        int i,mayor,posMayor;
        mayor=0;
        posMayor=0;
        i=0;
        int Numeros[] = {1, 2, 3, 5, 7};
        System.out.println(Numeros[NumeroMayor(Numeros,i,mayor,posMayor)]);

    }

    public static int NumeroMayor(int[] Array,int i,int mayor,int posMayor) {//siempre entra todo por parametrod??
        
        if (i < Array.length) {
            if (mayor < Array[i]) {
                mayor = Array[i];
                posMayor = i;
            }
            posMayor=NumeroMayor(Array,i+1,mayor,posMayor);//i+1
        }
        return posMayor;
    }
}

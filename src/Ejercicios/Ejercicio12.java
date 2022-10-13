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
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int i,pos;
        i=0;
        char carac;
        
        boolean valor;
        System.out.println("Ingrese posiciones");
        pos=sc.nextInt();
        char []Caracteres= new char [pos];
        CargarArray(Caracteres,i);
        System.out.println("Ingrese caracter");
        carac=sc.next().charAt(0);
        
        valor=CaracInArray(Caracteres,i,carac);
        System.out.println(valor);
        
    }
    
    public static void CargarArray(char []Array,int i){
         Scanner sc = new Scanner(System.in);
        char caracter;
        if (i < Array.length) {
            System.out.println("Ingrese numero");
            caracter = sc.next().charAt(0);
            Array[i] = caracter;
            CargarArray(Array, i + 1);
        }

    }
    
    public static boolean CaracInArray(char []Array,int i,char carac){
        boolean valorCarac;
        valorCarac=false;
        
        if(i<Array.length && !valorCarac){
            if(carac==Array[i]){
                valorCarac=true;
            }else{
                valorCarac=CaracInArray(Array,i+1,carac);
            }
        }
        
        return valorCarac;
    }
}

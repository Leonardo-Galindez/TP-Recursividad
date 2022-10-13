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
public class Ejercicio10 {
    public static void main(String[] args) {
        String cadena;
        cadena="";
        cadena=FormarCadena(cadena);
        System.out.println(cadena);
        
    }
    public static String FormarCadena(String cad){
        Scanner sc= new Scanner(System.in);
        String cadena;
        
        char caracter;
        cadena="";
        System.out.println("Ingrese caracter");
        caracter=sc.next().charAt(0);
        if(caracter!='.'){
            cadena=caracter+FormarCadena(cadena);
        }
        
        return cadena;
    }
}

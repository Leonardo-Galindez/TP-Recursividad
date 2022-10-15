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
public class Ejercicio15 {
    public static void main(String[] args) {
        String cadena;
        int longitud,i,cont;
        i=0;
        cont=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese cadena");
        cadena=sc.nextLine();
        longitud=cadena.length();
        cont=ContarVocales(cadena,longitud,i);
        System.out.println(cont);
    }
    
    public static int ContarVocales(String texto,int lon,int i){
        int cont;
        cont=0;
        if(i<lon){
            if(texto.charAt(i)=='a' ||texto.charAt(i)=='e' ||texto.charAt(i)=='i' ||texto.charAt(i)=='o' ||texto.charAt(i)=='u'){
                cont=1+ContarVocales(texto,lon,i+1);
            }else{
                cont=ContarVocales(texto,lon,i+1);
            }
        }
        return cont;
    }
}

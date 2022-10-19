/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosExtra;

/**
 *
 * @author galin
 */
import java.util.Scanner;

public class Piramide4a {
    public static void main(String[] args) {
        int filas,asteriscos,alto,espacio;
        char caracter;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese numero");
        filas=sc.nextInt();
        alto=1;
        espacio=1;
        asteriscos=1;
        Piramide(filas,alto,espacio,asteriscos);
    }
    
    public static void Piramide(int filas, int alto, int espacio,int asteriscos) {
        
        if(alto<=filas){
            if(espacio<=filas){//Imprimir espacios
                System.out.println(" ");
                Piramide(filas,alto,espacio+1,asteriscos);
            }else{
                Piramide(filas-alto,alto+1,1,asteriscos);
            }
            if(asteriscos<=alto*2-1){
                System.out.println("*");
                Piramide(filas,alto,espacio,asteriscos+1);
            }else{
                System.out.println(" ");
            }
            Piramide(filas,alto+1,espacio,asteriscos);
        }
    }
    
    
    
}

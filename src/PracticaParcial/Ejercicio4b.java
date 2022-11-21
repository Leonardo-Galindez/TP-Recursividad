/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaParcial;

/**
 *
 * @author galin
 */
public class Ejercicio4b {
    public static void main(String[] args) {
        piramide(4,1,1,4);
    }
    public static void piramide(int filas,int posC,int posF,int espacios){
        
        if(posF<=filas){
            if(posC<espacios){
                System.out.print(" ");
                piramide(filas,posC+1,posF,espacios);
            }else{
                puntos(posF,1);
                System.out.println("");
                piramide(filas,1,posF+1,espacios-1);
            }
        }
        
    }
    
    public static void puntos(int filas,int pos){
        if(filas>=pos){
            System.out.print(pos);
            puntos(filas,pos+1);
        }
    }
   
}

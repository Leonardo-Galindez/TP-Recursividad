/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaParcial;

/**
 *
 * @author galin
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        piramide(4,1,1);
    }
    public static void piramide(int filas,int posC,int posF){
        
        if(posF<=filas){
            if(posC<=posF){
                System.out.print(posC);
                piramide(filas,posC+1,posF);
            }else{
                System.out.println("");
                piramide(filas,1,posF+1);
            }
        }
    }
}

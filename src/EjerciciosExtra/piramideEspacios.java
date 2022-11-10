/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosExtra;

/**
 *
 * @author galin
 */
public class piramideEspacios {
    public static void main(String[] args) {
        int i=1;
        int j=1;
        int altura=4;
        int espacios=altura;
        PiramideEsp(altura,espacios,i,j);
    }
    
    public static void PiramideEsp(int altura,int espacios,int i,int j){
        
        if(i<=altura){
            if(j<espacios){
                System.out.print(" ");
                PiramideEsp(altura,espacios,i,j+1);
            }else{
                LadoIzquierdo(i,1);
                System.out.println("");
                PiramideEsp(altura,espacios-1,i+1,1);
            }
        }
    }
    public static void LadoIzquierdo(int fila,int i){
        if(fila>=i){
            System.out.print("*");
            LadoIzquierdo(fila,i+1);
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaParcial;

/**
 *
 * @author galin
 */
public class ejercicioP {
    public static void main(String []args){
        int posF,posC,espacios,altura;
        posF=1;
        posC=1;
        altura=4;
        espacios=altura;
        piramide(altura,espacios,posF,posC);
    }
    public static void piramide(int alt,int space,int i,int j){
        
        if(i<=alt){
            if(j<space){
                System.out.print(" ");//sin salto
                piramide(alt,space,i,j+1);
            }else{
                caracter(i,1);//coloca los caracteres
                System.out.println("");//salto
                piramide(alt,space-1,i+1,1);
            }
        }
    }
    
    public static void caracter(int cantCarac,int i){
        if(cantCarac>=i){
            System.out.print("*");
            caracter(cantCarac,i+1);
        }
    }
}

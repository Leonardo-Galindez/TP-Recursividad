/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosExtra;

/**
 *
 * @author galin
 */
public class Piramide {

    public static void main(String[] args) {
        int altura, fila, espacios, colum;
        altura = 4;//altura de la piramide
        espacios = altura;//espacios de la mitad de la piramide
        colum = 1;//iteran las columnas de la piramide

        fila = 1;//itera las filas de la piramide
        Piramide(altura, espacios, colum, fila);//llamada al modulo de la piramide
    }

    public static void Piramide(int altura, int espacios, int colum, int fila) {
        if(altura>=fila){
            if(colum<espacios){
                System.out.print(" ");
                Piramide(altura,espacios,colum+1,fila);
            }else{
                LadoIzquierdo(fila,1);
                System.out.println("");
                Piramide(altura,espacios-1,1,fila+1);
            }
        }
    }
    
    public static void LadoIzquierdo(int fila,int i){
        if(fila>i){
            System.out.print(i);
            LadoIzquierdo(fila,i+1);
        }else{
            LadoDerecho(fila);
        }
    }
    
    public static void LadoDerecho(int fila){
        if(fila>0){
            System.out.print(fila);
            LadoDerecho(fila-1);
        }
    }
}

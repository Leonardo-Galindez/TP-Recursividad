/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author galin
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        
        int [][]Numeros ={{1,2,3},
                         {4,5,6},
                         {7,8,9}};
        
    }
    
    public static int SumaFilas(int fila,int colum,int [][]Matriz){
        int suma;
        suma=0;
        
        if(fila<Matriz.length){
            if(colum<Matriz[0].length){
                suma=Matriz[fila][colum]+SumaFilas(fila,colum+1,Matriz);
            }
            
        }
        return suma;
    }
}

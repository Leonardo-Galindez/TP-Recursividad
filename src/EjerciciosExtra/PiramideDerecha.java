/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosExtra;

/**
 *
 * @author galin
 */
public class PiramideDerecha {
    public static void main(String[] args) {
        int posF=1,posC=1,filas=4;
        PiramideDerecha(filas,posF,posC);
    }
    public static void PiramideDerecha(int filas,int posF,int posC){
        if(posF<=filas){
            if(posC<=posF){
                System.out.print("*");
                PiramideDerecha(filas,posF,posC+1);
            }else{
                System.out.println("");
                PiramideDerecha(filas,posF+1,1);
            }
        }
    }
}

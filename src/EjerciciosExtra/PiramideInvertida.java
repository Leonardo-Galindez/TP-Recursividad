/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosExtra;

/**
 *
 * @author galin
 */
public class PiramideInvertida {
    public static void main(String[] args) {
        int posF=1,posC=4,filas=4;
        PiramideInvertida(filas,posF,posC);
    }
    public static void PiramideInvertida(int filas,int posF,int posC){
        if(posF<=filas){
            if(posC>=posF){
                System.out.print("*");
                PiramideInvertida(filas,posF,posC-1);
            }else{
                System.out.println("");
                PiramideInvertida(filas,posF+1,filas);
            }
        }
    }
}

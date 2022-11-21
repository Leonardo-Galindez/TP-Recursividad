/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaParcial;

/**
 *
 * @author galin
 */
public class EjercicioParcial {
    public static void main(String[] args) {
        
        System.out.println(sumaDigitos(3862));
        
    }
    public static int sumaDigitos(int num){
        int suma=0;
        
        if(num>9){
            suma = suma + num%10+sumaDigitos(num/10);
        }else{
            suma=suma+num;
        }
        return suma;
    }
}

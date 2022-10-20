/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosExtra;

/**
 *
 * @author galin
 */
public class Ejercicio1C {
    public static void main(String[] args) {
        
    }
    public static String teoria (int num){
        //modulo que dado un numero ,si dicho numero es par se le realiza numero/2 y si 
       //el     numero es imparse le realiza numero*3+1
        //tomando como caso base al numero 1 
        String codigo="";
        if(num==1){
            codigo+=1;
        }else{
            if(num%2==0){
                codigo+=num+","+(teoria(num/2));
            }else{
                codigo+=num+","+(teoria((num*3)+1));
            }
        }
        return codigo;
    }
//suma de cartas
    public static int cantMensajes(int num){
        int cantMensajes=0;
        if(num==1){
            cantMensajes=1;
        }else{
            if(num%2==0){
                cantMensajes+=num+(cantMensajes(num/2));
            }else{
                cantMensajes+=num+(cantMensajes((num*3)+1));
            }
        }
        return cantMensajes;
    }

}

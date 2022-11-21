/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaParcial;

/**
 *
 * @author galin
 */
public class Ejecicio1 {
    public static void main(String[] args) {
        
        int num1=9313,num2=1204,num3=1340;
        System.out.println(DigitosConsecutivos(num1));
    }
    //consulta sobre este ejercicio parametro consecutivo estaria bien asi 
    public static boolean DigitosConsecutivos(int num){
        boolean consecutivo=false;
        int resto;
        resto = num%10;
        if(num>9){
            if(resto == (num/10)%10+1){
                consecutivo=true;
            }else{
                if(resto==0 &&  (num/10)%10==9 ){
                    consecutivo=true;
                }
                consecutivo=DigitosConsecutivos(num/10);
            }
        }
        return consecutivo;
    }
           
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author galin
 */


public class Ejercicio4 {

    public static void main(String[] args) {
        int num = 1111111, resto;
        resto = num % 10;
        boolean valorNum = true;
        valorNum = VerificarNum(resto, num, valorNum);
        System.out.println(valorNum);

    }

    public static boolean VerificarNum(int resto, int num, boolean valorNum) {

        int res;
        res = num % 10;
        if(valorNum && num>0){
            if (res == resto) {
                valorNum = true;
            } else {
                valorNum = false;
            }
            valorNum = VerificarNum(resto, num / 10, valorNum);
        }
        

        return valorNum;
    }
}

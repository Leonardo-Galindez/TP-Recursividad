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

    //metemos valorNum por parametro, tengo errores para trabajarlo en metodo
    //resto lo meto por parametros para trabajar a partir de ese numero
    public static boolean VerificarNum(int resto, int num, boolean valorNum) {

        int res;
        res = num % 10;//nuevo resto a comparar con el resto que entra por parametros
        if (valorNum && num > 0) {//condicion de corte que el numero sea igual al resto que entro por parametros y que num /10 sea mayor a 0 
            if (res == resto) {
                valorNum = true;
            } else {
                valorNum = false;
            }
            valorNum = VerificarNum(resto, num / 10, valorNum);//varia num cada ves que se llama al metodo se divide por 10
        }

        return valorNum;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosExtra;

/**
 *
 * @author galin
 */
import java.util.Scanner;

public class Ejercicio3C {

    public static void main(String[] args) {
        String cadena, onda;
        int pos;
        onda = "";
        pos = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese cadena");
        cadena = sc.next();

        System.out.println(ondaDigital(cadena, pos, onda));

    }

    public static String ondaDigital(String cadena, int pos, String onda) {

        if (pos < cadena.length()) {
            if (cadena.charAt(pos) == 'H' || cadena.charAt(pos) == 'h') {
                onda = '-' + ondaDigital(cadena, pos + 1, onda);
                
            } else {

                if (cadena.charAt(pos) == 'L' || cadena.charAt(pos) == 'l' ) {

                    onda = '_' + ondaDigital(cadena, pos + 1, onda);
                    
                }
            }
        }
        return onda;
    }
}

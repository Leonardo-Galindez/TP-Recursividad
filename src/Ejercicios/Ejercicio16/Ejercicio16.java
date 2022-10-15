/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios.Ejercicio16;

/**
 *
 * @author galin
 */
import java.util.Scanner;

public class Ejercicio16 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Producto[] MisProductos = new Producto[5];
        CargarProducto(MisProductos);
    }

    public static void CargarProducto(Producto[] Array) {
        int cod, stock;
        String desc;
        double precio;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < Array.length; i++) {
            System.out.println("Ingrese codigo");
            cod = sc.nextInt();
            sc.next();
            System.out.println("Ingrese descripcion");
            desc = sc.nextLine();
            sc.next();
            System.out.println("Ingrese precio por kilo");
            precio = sc.nextDouble();
            System.out.println("Ingrese stock");
            stock = sc.nextInt();
            
            Producto miProducto= new Producto(cod,desc,precio,stock);
            Array[i]=miProducto;
           
        }
    }
    //cantidad de productos con precio dado
    public static void ContProducto(){
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author galin
 */
import Ejercicios.POO.Producto;
import java.util.Scanner;

public class Ejercicio16 {

    public static void main(String[] args) {
        double precioBusca;
        int i=0;
        Scanner sc = new Scanner(System.in);
        Producto[] MisProductos = new Producto[5];
        CargarProducto(MisProductos);
        System.out.println("Ingrese precio a buscar");
        precioBusca=sc.nextDouble();
        System.out.println(ContProducto(MisProductos,precioBusca,i));
    }

    public static void CargarProducto(Producto[] Array) {
        int cod, stock;
        String desc;
        double precio;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < Array.length; i++) {
            System.out.println("Ingrese codigo");
            cod = sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese descripcion");
            desc = sc.nextLine();
            System.out.println("Ingrese precio por kilo");
            precio = sc.nextDouble();
            System.out.println("Ingrese stock");
            stock = sc.nextInt();
            
            Producto miProducto= new Producto(cod,desc,precio,stock);
            Array[i]=miProducto;
        }
        
    }
    //cantidad de productos con precio dado
    public static int ContProducto(Producto []Productos,double precioBusca,int i){
        int cont;
        cont=0;
        if(i<Productos.length){
            if(Productos[i].getPrecioKg() == precioBusca){
                cont=1+ContProducto(Productos,precioBusca,i+1);
            }else{
                cont=ContProducto(Productos,precioBusca,i+1);
            }
        }
        return cont;
    }
}

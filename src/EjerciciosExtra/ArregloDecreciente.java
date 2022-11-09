/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosExtra;

/**
 *
 * @author galin
 */
public class ArregloDecreciente {
    public static void main(String[] args) {
        int arr[]={3,2,5};
        int pos=0;
        System.out.println(ArregloDecreciente(arr,pos));
    }
    public static boolean ArregloDecreciente(int arr[],int pos){
        boolean ordenado=true;
        
        if(pos!=arr.length-1 && ordenado){
            if(arr[pos]<arr[pos+1]){
                ordenado=false;
            }else{
                ordenado=ArregloDecreciente(arr,pos+1);
            }
        }
        return ordenado;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosExtra;

/**
 *
 * @author galin
 */
public class contarCero {
    public static void main(String[] args) {
        int array[]={1,0,3,0};
        System.out.println(contarCero(array,0));
    }
    
    public static int contarCero(int array[],int pos){
        int contCero=0;
        if(pos<array.length){
            if(array[pos]==0){
                contCero=1+contarCero(array,pos+1);
            }else{
                contCero=contCero+contarCero(array,pos+1);
            }
        }
        return contCero;
    }
}

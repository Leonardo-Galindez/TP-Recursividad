/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosExtra;

/**
 *
 * @author galin
 */
public class invertirArreglo {

    public static void main(String[] args) {
        int Array[] = {1, 2, 3, 4, 5};
        int pos;
        pos = 0;
        mostrar(Array);
        invertir(Array, pos);
        System.out.println("");
        mostrar(Array);
    }

    public static void mostrar(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    public static void invertir(int arr[], int pos) {
        int aux;
        if (pos < arr.length/2) {

            aux = arr[arr.length - 1 - pos];
            arr[arr.length - 1 - pos] = arr[pos];
            arr[pos] = aux;
            invertir(arr, pos + 1);

        }

    }
}

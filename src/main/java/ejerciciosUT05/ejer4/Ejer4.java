/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosUT05.ejer4;

import java.util.Arrays;

/**
 *
 * @author ERICK
 */
public class Ejer4 {
   // private int tamanio;
    
    public static void main(String[] args) {
        int tamanio = 4;
        int[] array = crearArray( tamanio);
        
        array[0] = 8;
        array[1] = 4;
        array[2] = 5;
        array[3] = 9;
        
        System.out.println(buscarNumero(5, array, tamanio));
        
        System.out.println(Arrays.binarySearch(array, 5));
        
        
        // Ejercicio 10
        // Array ordenado
        ordenarQuick(array);
        
    }
    
    
    public static int[] crearArray(int tamanio){
        int[] array = new int[tamanio];
        
        return array;
    }
    
    // Método para realizar una busqueda
    public static int buscarNumero(int num, int[] array, int tamanio){
        
        int resultado = 0;
        
        int[] arrayCopy = Arrays.copyOf(array, tamanio);
        
        for (int i = 0; i < arrayCopy.length; i++) {
            if(arrayCopy[i] == num){
                resultado = i;
                
                break;
            }
        }
        return resultado;
    }    
    
    public static void ordenarQuick(int[] array){
        Arrays.sort(array);
        
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        
    }
    
}

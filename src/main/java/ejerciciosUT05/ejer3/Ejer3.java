/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosUT05.ejer3;

import java.util.Arrays;

/**
 *
 * @author ERICK
 */
public class Ejer3 {
    public static void main(String[] args) {
        double[] array = new double[20];
     
        // Rellena el array con el valor 7.5 en todas sus posiciones.
        System.out.println("Array");
        for (int i = 0; i < array.length; i++) {
            array[i] = 7.5;
            System.out.println(array[i]);
        }
        
        
        // Realiza una copia del array anterior en un nuevo array.
        double[] array2 = Arrays.copyOf(array, 20);            
        
        System.out.println("Array2");
        for (int i = 0; i < array2.length; i++) {
            
            System.out.println(array2[i]);
        }
        
        // Compara ambos arrays, mostrando si son iguales.
        boolean comparar = Arrays.equals(array, array2);
        System.out.println("True o False:");
        System.out.println(comparar);
        
        
        // Introduce el valor 6.3 en una posición aleatoria válida de uno de los arrays. No se usa clase Arrays
        System.out.println("Datos cambiados");
        
        array[8] = 6.3;
        boolean comparar2 = Arrays.equals(array, array2);
        System.out.println(comparar2);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
 
}

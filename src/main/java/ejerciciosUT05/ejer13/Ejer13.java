/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosUT05.ejer13;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ERICK
 */
public class Ejer13 {
    
    public static Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int numero = 0;
        
        ArrayList<Integer> array = new ArrayList<Integer>();
        
        do{
            System.out.println("Introduce un número entre 1 y 20");
            
            numero = teclado.nextInt();
            
            array.add(numero);
            
        }while(numero != 0);
        
        int num1 = devolverHistograma(array, 1);
        
        mostrarHistograma(num1, 1);
        
        
        
    }
    
    public static int devolverHistograma(ArrayList<Integer> array, int num){
        
        int contador = 0;
        
        for(int i = 0; i < array.size(); i++){
            if(array.get(i) == 1){
                contador++;            
            }   
        }
        
        return contador;
    }
    
    public static void mostrarHistograma(int contador, int num){
        
        System.out.print(num + ": ");
        
        for (int i = 0; i < contador; i++) {
            System.out.print("*");
        }
    }
    
    
    
    
    
    
    
    
    
}

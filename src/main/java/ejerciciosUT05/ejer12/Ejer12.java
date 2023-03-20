/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosUT05.ejer12;

/**
 *
 * @author ERICK
 */
public class Ejer12 {
    
    
    public static void main(String[] args) {
        int[][] matriz = {{2, 8},{6, 8},{5, 9}};
        
        
        mostrarMatriz(matriz);
        
    }
    
    
    public static void mostrarMatriz(int[][] matriz){
        for(int[] fila: matriz){
            System.out.println();
            for(int f : fila){
                System.out.print(f + " ");
            }
        }
    }
}

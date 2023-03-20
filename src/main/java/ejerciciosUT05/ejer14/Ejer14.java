/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosUT05.ejer14;

import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author ERICK
 */
public class Ejer14 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        
        rellenarMatriz(matriz);
        
        int media = calcularMedia(matriz);
        
        System.out.println();
        System.out.println("Media: " + media);
    }
    
    public static void rellenarMatriz(int[][] matriz){
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                int numero = (int)(Math.random()*100+1);
                
                //String numero = RandomStringUtils.randomNumeric(1, 101);
                
                matriz[i][j] = numero;
            }
            System.out.println();
        } 
        
        for(int[] fila : matriz){
            System.out.println();
            for(int f : fila){
                System.out.print(f + " ");                
            }
        }
        
    }
    
    public static int calcularMedia(int[][] matriz){
        
        int sumar = 0;
        int media = 0;
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                sumar = sumar + matriz[i][j];
            }
        }
        
        media = sumar / 9;
        
        return media;
    }
    
    public static int calcularMin(int[][] matriz){
        
        int sumar = 0;
        int media = 0;
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                sumar = sumar + matriz[i][j];
            }
        }
        
        //media = Math.min(media, media)
        
        return media;
    }
}

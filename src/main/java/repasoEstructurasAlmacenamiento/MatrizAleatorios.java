/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repasoEstructurasAlmacenamiento;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author ERICK
 */
public class MatrizAleatorios {
    /*
    Implementa un programa que genere matrices de NxN, rellenando la matriz en cada posición 
    de forma aleatoria, con números que no se pueden repetir, entre 1 y N^2 .
    */
    public Random generador = new Random();
    public Scanner teclado = new Scanner(System.in);
    public int numero = 8;
    
    private ArrayList<Integer> array = new ArrayList<>();
    
    public static void main(String[] args) {
        
        
        
        int numero  = 8;
        
        // Creamos la matriz
        int[][] matriz =  new int [numero][numero];
        
        // Recorremos la matriz y rellenamos con ceros
        for(int[] fila : matriz){
            System.out.println();
            for(int z : fila){
                //matriz[fila][z] = generarNumeros(); // No se puede porque int[] no se puede convertir en int ???????????!
                System.out.print(generarNumeros(numero) + " "); // Técnicamente no estamos añadiendo los datos en la matriz, solo lo estamos imprimiendo en esa posición
            }
        }
    }   
    
//    public void comprobarArray(){
//        for (int i = 0; i < array.size(); i++) {
//            
//        }
//    }
    
    public int solicitarNumero(){
        System.out.println("Introduce un número");
        
        int numero = teclado.nextInt();
        
        return numero;
    }

    // Método para crear números aleatorios
    public static int generarNumeros(int numero){
        int num = (int)(Math.random()* Math.pow(numero, 2) + 1);
        
        //array.add(num);
        
        //System.out.println("Numero random " + num);
        return num;
    }
    
    
    
    
    


    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repasoEstructurasAlmacenamiento;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author ERICK
 */
public class MatrizAleatoriosSet {
    /*
    Implementa un programa que genere matrices de NxN, rellenando la matriz en cada posición 
    de forma aleatoria, con números que no se pueden repetir, entre 1 y N^2 .
    */
    public Random generador = new Random();
    public Scanner teclado = new Scanner(System.in);
    
    
    private static int numero = 8; // Al ser static se puede usar dentro del main
    
    Set<Matriz> setMatriz;
    
    public static void main(String[] args) {
        
        // Creamos la instancia del nuevo set
        MatrizAleatoriosSet ma1 = new MatrizAleatoriosSet();
        
        // Creamos la instancia que contendra el número
        
        
//        for(int i = numero; i <= numero; i++){
//            int num = generarNumeros(numero);
//            Matriz m1 = new Matriz(num);
//            ma1.newNumero(m1);
//        }
        
        int numero = 4;
        // Creamos la matriz
        Integer[][] matriz =  new Integer [numero][numero];
        
        // Recorremos la matriz y rellenamos con ceros
        for(Integer[] fila : matriz){
            System.out.println();
            for(Integer columna : fila){
                
                System.out.print("-_-" + generarNumeros(numero) + " "); // Técnicamente no estamos añadiendo los datos en la matriz, solo lo estamos imprimiendo en esa posición
                
                int num = generarNumeros(numero);
                Matriz m1 = new Matriz(num);
                ma1.newNumero(m1);
                
                //matriz[fila][columna] = ma1.
            }
        }
    }   
    
    // Método para crear el número
    public MatrizAleatoriosSet(){
        this.setMatriz = new HashSet();
    }
    
    

    // Método para crear números aleatorios
//    public static int generarNumeros(int numero){
//        int num = (int)(Math.random()* Math.pow(numero, 2) + 1);
//        
//        return num;
//    }
    
  
    public static int generarNumeros(int numero){
        
        
        int num = (int)(Math.random()* Math.pow(numero, 2) + 1);
        

        
        //set.add(num);
        
        //System.out.println("Numero random " + num);
        return num;
    }
    
    public void newNumero(Matriz m){
        this.setMatriz.add(m);
    }
    
    
    
    
    


    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}

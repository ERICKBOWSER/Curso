/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosUT05.ejer2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ERICK
 */
public class Ejer2 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        double altura;
        int personas = 0;
        
        do{
            try{
                System.out.println("Escribe un número de personas: ");

                personas = Math.abs(teclado.nextInt());
                
                

            }catch(InputMismatchException ime){
                System.out.println("El dato introducido no es el del tipo esperado.");
                teclado.nextLine();
            }
        }while(personas <= 0);

        for(int i = 0; i < personas; i++){
            
            double[] array = new double[personas];
            
            System.out.println("Introduce la altura de la primera persona:");
            
            altura = Math.abs(teclado.nextDouble());
            
            array[i] = altura;           
            
        }
        

        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursividad;

/**
 *
 * @author guerig
 */
public class ImprimirNumero {
    public static void main(String[] args) {
        //imprimirNumeroRecursivo(5);
        
        factorial(4);
    }
    
    public static void imprimirNumeroRecursivo(int numero){
        if(numero > 0){
            imprimirNumeroRecursivo(numero - 1);
        }
                
        System.out.println(numero);
    }
    
    
    public static void factorial(int num){
        for(int i = 0; i < num; i++){
            num * (num - 1);
        }
    }
    
    
}

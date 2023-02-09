/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursividad;

/**
 *
 * @author guerig
 */
public class Fibonacci {
    
    public static void main(String[] args) {
        int res = calcularFibonacci(5);
        System.out.println(res);
        
        int resIt = fiboIterativo(5);
        System.out.println(resIt);
        
        
        System.out.println(fiboRecursivo(5));
    }   
    
    public static int fiboIterativo(int n){
        int numero = Math.abs(n);
        
        int resultado = 0;
        int n1 = 0;
        int n2 = 1;
        
        for(int i = 0; i < numero; i++){
            resultado = n1 + n2;
            n2 = n1;
            n1 = resultado;
                
        }
        return resultado;
    }
    
    public static int fiboRecursivo(int n){ //  Suponemos n positivo o cero
        if(n < 2 ){
            return n;
        }else{
            return fiboRecursivo(n - 1) + fiboRecursivo(n - 2);
        }
    }
    
    
    // Mal
    public static int calcularFibonacci(int max){
        int resA = 0, resB = 1;
        int resultado = 0, resAnterior = 0;
        for(int i = 0; i <= max; i++){
            resAnterior = resultado;
            resA = resAnterior;
            System.out.println("Resultado A: " + resA);
            
                        
            resultado = resA + resB;
            resB = resultado;
            System.out.println("Resultado B: " + resB);
            
            System.out.println("Resultado final: " + resultado);
            System.out.println("---------------");
            
        }
        return resultado;
    }    
    
    
    
}

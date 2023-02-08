/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursividad;

/**
 *
 * @author guerig
 */
public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorialIterativo(5));
        System.out.println(factorialRecursivo(5));
    }

    
public static int factorialIterativo(int n){
    
    int resultado = 1;
    n = Math.abs(n);
    
    for(int i = 1; i<= n; i++){
        resultado *=i;
    }
    return resultado;
}


public static int factorialRecursivo(int n){
    n = Math.abs(n);
    
    if(n == 0 || n == 1){
        return 1;
    }else{
        return n * factorialRecursivo(n - 1);
    }
    
}




}
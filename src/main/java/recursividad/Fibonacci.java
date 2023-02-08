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
        int res = calcularFibonacci(4);
        
        System.out.println(res);
    }   
    
    
    private int numA = 0;
    private int numB = 1;

    public Fibonacci(int numA, int numB) {
        this.numA = numA;
        this.numB = numB;
    }

    public int getNumA() {
        return numA;
    }

    public void setNumA(int numA) {
        this.numA = numA;
    }

    public int getNumB() {
        return numB;
    }

    public void setNumB(int numB) {
        this.numB = numB;
    }

    @Override
    public String toString() {
        return "Fibonacci{" + "numA=" + numA + ", numB=" + numB + '}';
    }
    
    public static int calcularFibonacci(int max){
        int resA = 0, resB = 1;
        int resultado = 0;
        for(int i = 0; i <= max; i++){
            resA = Math.abs(resA - 1);
            System.out.println("Resultado A: " + resA);
            resB = Math.abs(resB - 2);
            System.out.println("Resultado B: " + resB);
                        
            resultado = resA + resB;
            System.out.println("Resultado final: " + resultado);
            System.out.println("---------------");
            
        }
        return resultado;
    }    
    
    
    
}

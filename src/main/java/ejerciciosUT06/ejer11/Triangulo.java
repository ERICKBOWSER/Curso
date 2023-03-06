/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosUT06.ejer11;

/**
 *
 * @author guerig
 */
public class Triangulo extends Figura{

    public Triangulo(double base, double altura) {
        super(base, altura);
    }
    
    public double calcularArea(){
        double resultado = 0;
        
        resultado = (2 * Math.pow(base, 2)) / altura;
        
        return resultado;        
    }
    
}

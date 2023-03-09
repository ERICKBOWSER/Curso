/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosUT06.ejer11;

/**
 *
 * @author guerig
 */
public class Romboide extends Figura{

    public Romboide(double base, double altura) {
        super(base, altura);
    }
    
    public double calcularArea(){        
        return getBase() * getAltura();        
    }
}

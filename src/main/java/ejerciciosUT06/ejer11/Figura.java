/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosUT06.ejer11;

/**
 *
 * @author guerig
 */
public abstract class Figura {
    private double base;
    private double altura;

    public Figura(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public abstract double calcularArea();

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}

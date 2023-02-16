/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosUT06.ejer3_1;

/**
 *
 * @author ERICK
 */
public class Empleado extends Persona{
    private double salario;

    public Empleado(double salario, String nombre, String nif, int edad) {
        super(nombre, nif, edad);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return super.toString() + ", Salario: " + this.salario;
    }
    
    public double aumentarSalario(double aumento){
        return this.salario = this.salario + aumento;
    }
    
    
}

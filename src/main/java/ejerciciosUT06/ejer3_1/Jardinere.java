/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosUT06.ejer3_1;

import java.util.Map;

/**
 *
 * @author ERICK
 */
public class Jardinere extends Empleado {
    private Integer antiguedad;
    Map<Integer, Jardinere> jardinere; 

    public Jardinere(int antiguedad, double salario, String nombre, String nif, int edad) {
        super(salario, nombre, nif, edad);
        this.antiguedad = antiguedad;
    }

    public Integer getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(Integer antiguedad) {
        this.antiguedad = antiguedad;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + this.antiguedad;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Jardinere other = (Jardinere) obj;
        return this.antiguedad == other.antiguedad;
    }
    
    @Override
    public int compareTo(Persona o){
        return Integer.compare(this.antiguedad, ((Jardinere) o).antiguedad); // Se hace un casting de datos ya que Persona no tiene el parametro antiguedad del jardinere
    }
        // Se puede hacer todo desde la clase persona, pero si se quiere un dato especifico hay que acceder a esas clases y puede dar fallo si se hace un casting
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosUT06.ejerClase;

import java.util.Objects;

/**
 *
 * @author guerig
 */
public class Silla implements Comparable<Silla>{
    private double peso;
    private String nombre;

    public Silla(double peso, String nombre) {
        this.peso = peso;
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    // EQUALS --> HASHCODE (Saber si dos objetos son iguales), si no se coloca coge el de Object
    
    // COMPARAR OBJETOS PARA ORDENARLOS SEGÚN ORDEN NATURAL -- Comparable
    
    // Cuando se usa collection sort
    
    // Lo logico es que todo vaya en consonancia, es decir, que todos tengan el mismo valor a comparar,
    // pero no pasa nada si no lo estan
    
    // collections.sort, lo ordena por el orden natural
    
    // collections.     lo ordena por el orden que se especifique.
    
    /*
    expresion lambda 
    */
   
    // CUANDO 1 CLASE IMPLEMENTA UNA INTERFACE, AÚTOMATICAMENTE LA CLASE SE VUELVE UN OBJETO DE LA INTERFACE
    
    
    // Código boilerplate -- BUSCAR EN CASA

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.nombre);
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
        final Silla other = (Silla) obj;
        return Objects.equals(this.nombre, other.nombre);
    }

    @Override
    public int compareTo(Silla o) {
        return this.nombre.compareToIgnoreCase(o.nombre);
    }
    
    
}

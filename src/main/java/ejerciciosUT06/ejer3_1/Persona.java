/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosUT06.ejer3_1;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author ERICK
 */
// Puede haber clases abstractas y no recibir metodos abstractos

public abstract class Persona implements Comparable<Persona>{ // Clases abstractas: no se pueden instanciar, solo instancian las clases hijas
    private String nombre;
    private String nif;
    private int edad;
    
    // Crear map
    Map<String, Persona> persona;

    public Persona(String nombre, String nif, int edad) {
        this.nombre = nombre;
        this.nif = nif;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", nif=" + nif + ", edad=" + edad + '}';
    }

    @Override
    public int compareTo(Persona o) {
        return this.nif.compareToIgnoreCase(o.nif);
    }
    
    
    
    public Persona(){
        this.persona = new TreeMap(); // Clase ordenada
    }
    
    public void newPersona(Persona p){
        this.persona.put(p.nif, p);
        System.out.println("persona añadida");
    }
    
    public void deletePersona(String nif){
        this.persona.remove(nif);
        System.out.println("persona eliminada");
    }
    
    public Persona getPersona(String nif){
        return this.persona.get(nif);
    }
    
}

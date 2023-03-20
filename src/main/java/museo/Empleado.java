/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo;

import java.util.Objects;
import java.util.Random;

/**
 *
 * @author ERICK
 */
public abstract class Empleado implements Comparable<Empleado>{
    
    private final String NIF;
    private String nombre;

    public Empleado(String nombre, String nif) {
        this.NIF = nif;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.NIF);
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
        final Empleado other = (Empleado) obj;
        return Objects.equals(this.NIF, other.NIF);
    }
    
       
//    private String calcularNif(){
//        
//        Random generar = new Random();
//        int nums = generar.nextInt(8);
//        
//        int divNum = (int)nums % 23;
//        
//        String[] letras = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
//        
//        String res = letras[divNum];
//        
//        return res;
//    }

    @Override
    public int compareTo(Empleado o) {
        return this.NIF.compareToIgnoreCase(o.NIF);
    }
    
    public abstract void sueldo();
    
}

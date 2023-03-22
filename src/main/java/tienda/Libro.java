/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda;

import java.util.Objects;

/**
 *
 * @author guerig
 */
public abstract class Libro extends Producto implements Comparable<Libro>{
    private final Integer ISBN;

    public Libro(Integer ISBN, int codigo, double precio, String descripcion) {
        super(codigo, precio, descripcion);
        this.ISBN = ISBN;
    }

    public Integer getISBN() {
        return ISBN;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Libro{");
        sb.append("ISBN=").append(ISBN);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public final int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.ISBN);
        return hash;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Libro other = (Libro) obj;
        return Objects.equals(this.ISBN, other.ISBN);
    }


    
    

    @Override
    public int compareTo(Libro l) {
        return this.ISBN.compareTo(l.getISBN());
    }
    
    
    
}

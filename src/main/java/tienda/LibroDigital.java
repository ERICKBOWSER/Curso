/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda;

/**
 *
 * @author guerig
 */
public final class LibroDigital extends Libro{
    private double numKBytes;

    public LibroDigital(double numKBytes, Integer ISBN, int codigo, double precio, String descripcion) {
        super(ISBN, codigo, precio, descripcion);
        this.numKBytes = numKBytes;
    }

    public double getNumKBytes() {
        return numKBytes;
    }

    public void setNumKBytes(double numKBytes) {
        this.numKBytes = numKBytes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LibroDigital{");
        sb.append("numKBytes=").append(numKBytes);
        sb.append('}');
        return sb.toString();
    }

    public void descargar(){
        System.out.println("http://guerig.daw/" + super.hashCode());
    }
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo;

/**
 *
 * @author ERICK
 */
public abstract class Sala {
    private int codIndentificador;
    private int numSalas;
    private String nombre;    

    public Sala(int codIndentificador, int numSalas, String nombre) {
        this.codIndentificador = codIndentificador;
        this.numSalas = numSalas;
        this.nombre = nombre;
    }

    public int getCodIndentificador() {
        return codIndentificador;
    }

    public void setCodIndentificador(int codIndentificador) {
        this.codIndentificador = codIndentificador;
    }

    public int getNumSalas() {
        return numSalas;
    }

    public void setNumSalas(int numSalas) {
        this.numSalas = numSalas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}

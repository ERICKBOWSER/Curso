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
    private String nombre;
    private TipoSala tipo;
    private Obra obra;

    public Sala(int codIndentificador, String nombre, TipoSala tipo, Obra obra) {
        this.codIndentificador = codIndentificador;
        this.nombre = nombre;
        this.tipo = tipo;
        this.obra = obra;
    }

    public int getCodIndentificador() {
        return codIndentificador;
    }

    public void setCodIndentificador(int codIndentificador) {
        this.codIndentificador = codIndentificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoSala getTipo() {
        return tipo;
    }

    public void setTipo(TipoSala tipo) {
        this.tipo = tipo;
    }
        
    @Override
    public final int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.codIndentificador;
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
        final Sala other = (Sala) obj;
        return this.codIndentificador == other.codIndentificador;
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo;

/**
 *
 * @author ERICK
 */
public class Obra {
    private int id;
    private String nombre;
    private TipoObras tipo;

    public Obra(int id, String nombre, TipoObras tipo) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoObras getTipo() {
        return tipo;
    }

    public void setTipo(TipoObras tipo) {
        this.tipo = tipo;
    }
    
    
    
    
}

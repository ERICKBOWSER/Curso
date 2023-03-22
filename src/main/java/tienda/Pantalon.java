/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda;

import java.util.List;

/**
 *
 * @author guerig
 */
public final class Pantalon extends Ropa {
    private Talla talla;

    public Pantalon(Talla talla, String marca, int codigo, double precio, String descripcion) {
        super(marca, codigo, precio, descripcion);
        this.talla = talla;
    }


    
    public Talla getTalla() {
        return talla;
    }

    public void setTalla(Talla talla) {
        this.talla = talla;
    }

    
    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pantalon{");
        sb.append("talla=").append(talla);
        sb.append('}');
        return sb.toString();
    }

    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda;

/**
 *
 * @author guerig
 */
public final class Musica extends Producto {
    private String grupo;

    public Musica(String grupo, int codigo, double precio, String descripcion) {
        super(codigo, precio, descripcion);
        this.grupo = grupo;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Musica{");
        sb.append("grupo=").append(grupo);
        sb.append(", Código=").append(this.getCodigo());
        sb.append(", Precio=").append(this.getPrecio());
        sb.append(", Descripción=").append(this.getDescripcion());        
        sb.append('}');
        return sb.toString();
    }


    
    
}

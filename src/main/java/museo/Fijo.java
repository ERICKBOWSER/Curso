/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo;

/**
 *
 * @author ERICK
 */
final class Fijo extends Sala{
    private String estado;

    public Fijo(String estado, int codIndentificador, String nombre, TipoSala tipo, Obra obra) {
        super(codIndentificador, nombre, tipo, obra);
        this.estado = estado;
    }



    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}

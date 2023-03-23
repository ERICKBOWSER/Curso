/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda;

/**
 *
 * @author guerig
 */
public abstract class Ropa extends Producto implements SeEnvia{
    private String marca;

    public Ropa(String marca, int codigo, double precio, String descripcion) {
        super(codigo, precio, descripcion);
        this.marca = marca;
    }



    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ropa{");
        sb.append("marca=").append(marca);
        sb.append('}');
        return sb.toString();
    }
    
    public void enviar(String direccion){
        System.out.println("La ropa de la marca " + this.marca + " se enviará a la siguiente dirección: " + direccion);
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda;

/**
 *
 * @author guerig
 */
public final class LibroPapel extends Libro implements SeEnvia{
    private int numPáginas;

    public LibroPapel(int numPáginas, Integer ISBN, int codigo, double precio, String descripcion) {
        super(ISBN, codigo, precio, descripcion);
        this.numPáginas = numPáginas;
    }

    

    public int getNumPáginas() {
        return numPáginas;
    }

    public void setNumPáginas(int numPáginas) {
        this.numPáginas = numPáginas;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LibroPapel{");
        sb.append("numP\u00e1ginas=").append(numPáginas);
        sb.append( ", ISBN=").append(this.getISBN());
        sb.append(", Código=").append(this.getCodigo());
        sb.append(", Precio=").append(this.getPrecio());
        sb.append(", Descripción=").append(this.getDescripcion());
        sb.append('}');
        return sb.toString();
    }


    
    public void enviar(String direccion){
        System.out.println("EL libro de papel se enviará a la siguiente dirección: " + direccion + " y tiene un total de " + numPáginas + " páginas");
    }
    
    public void getPagActual(){
        System.out.println("No dispone de esta función");
    }
    
}

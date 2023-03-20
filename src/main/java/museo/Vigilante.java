/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo;

/**
 *
 * @author ERICK
 */
final class Vigilante extends Empleado{
    private String puesto;

    public Vigilante(String puesto, String nombre, String nif) {
        super(nombre, nif);
        this.puesto = puesto;
    }
    
    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

        
        
}

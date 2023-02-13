/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosUT06.ejer1;

/**
 *
 * @author ERICK
 */
public class Casa {
    private int tamanio;
    private String disenio;
    private String garage;

    public Casa(int tamanio, String disenio, String garage) {
        this.tamanio = tamanio;
        this.disenio = disenio;
        this.garage = garage;
    }

    public int getTamanio() {
        return tamanio;
    }

    public String getDisenio() {
        return disenio;
    }

    public String getGarage() {
        return garage;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public void setDisenio(String disenio) {
        this.disenio = disenio;
    }

    public void setGarage(String garage) {
        this.garage = garage;
    }

    @Override
    public String toString() {
        return "Casa{" + "tamanio=" + tamanio + ", disenio=" + disenio + ", garage=" + garage + '}';
    }
    
    
}

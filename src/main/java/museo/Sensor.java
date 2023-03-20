/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo;

/**
 *
 * @author ERICK
 */
public abstract class Sensor {
    private int id;
    private double medicion;

    public Sensor(int id) {
        this.id = id;
    } 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getMedicion() {
        return medicion;
    }

    public void setMedicion(double medicion) {
        this.medicion = medicion;
    }
    
    public abstract void alarma(double medicion);
}

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

    public Sensor(int id) {
        this.id = id;
    } 
    
    public abstract String alarma();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

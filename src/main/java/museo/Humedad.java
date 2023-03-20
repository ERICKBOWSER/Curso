/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo;

/**
 *
 * @author guerig
 */
public final class Humedad  extends Sensor{
    private final double MAX_HUM = 50;
    private final double MIN_HUM = 15;

    public Humedad(int id) {
        super(id);
    }
    
    public void alarma(double medicion){
        if(medicion > MAX_HUM){
            System.out.println("¡¡¡ALERTA!!! Los limites de humedad han sido superados!!");
        }
    }
    
}

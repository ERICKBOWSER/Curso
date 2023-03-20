/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo;

/**
 *
 * @author guerig
 */
public final class Temperatura extends Sensor{
    private final double MAX_TMP = 50;
    private final double MIN_TMP = 15;

    public Temperatura(int id) {
        super(id);
    }
    
    public void alarma(double medicion){
        if(medicion > MAX_TMP){
            System.out.println("¡¡¡ALERTA!!! Los niveles de temperatura han sido superados");
        }
    }
    
}

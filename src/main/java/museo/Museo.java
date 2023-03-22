/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ERICK
 */
public class Museo {

    private String nombre;
    private String direccion;
    private List<Empleado> empleado;
    private List<Sala> sala;

    public Museo(String nombre, String direccion, List<Empleado> empleado, List<Sala> sala) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.empleado = empleado;
        this.sala = sala;
    }       

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Empleado> getEmpleado() {
        return empleado;
    }

    public void setEmpleado(List<Empleado> empleado) {
        this.empleado = empleado;
    }

    public List<Sala> getSala() {
        return sala;
    }

    public void setSala(List<Sala> sala) {
        this.sala = sala;
    }
    
    public List<Empleado> contratar(Empleado e){
        List<Empleado> empleado = new ArrayList();
        
        empleado.add(e);
        
        return empleado;
    }
    
    public List<Empleado> despedir(String nif){
        List<Empleado> empleado = new ArrayList();
        
        empleado.remove(empleado.contains(nif));
        
        return empleado;
    }
    
    public List<Sala> añadirSala(Sala s){
        List<Sala> addSalas = new ArrayList();
        
        addSalas.add(s);
        
        return addSalas;
    }
    
    public List<Sala> quitarSala(int id){
        List<Sala> removeSalas = new ArrayList();
        
        sala.remove(sala.contains(id));
        
        return removeSalas;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}

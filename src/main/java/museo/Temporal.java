/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo;

import java.time.LocalDate;

/**
 *
 * @author ERICK
 */final class Temporal extends Sala{
    private LocalDate fechaIni;
    private LocalDate fechaFin;

    public Temporal(LocalDate fechaIni, LocalDate fechaFin, int codIndentificador, String nombre, TipoSala tipo, Obra obra) {
        super(codIndentificador, nombre, tipo, obra);
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
    }
    
    public LocalDate getFechaIni() {
        return fechaIni;
    }

    public void setFechaIni(LocalDate fechaIni) {
        this.fechaIni = fechaIni;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }
    
    
    
}

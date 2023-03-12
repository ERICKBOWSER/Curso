/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosUT06.ejer12;

import ejerciciosUT06.ejer12.Cliente;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author ERICK
 */
public abstract class Cuenta {
    private String numeroCuenta;
    private double saldo;
    private Cliente cliente;

    public Cuenta(Cliente cliente) {
        this.numeroCuenta = generarNumCuenta();
        this.saldo = 0;
        this.cliente = cliente;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    private String generarNumCuenta(){
        String numero = RandomStringUtils.randomNumeric(20);
        
        return numero;
    }
    
    public abstract void actualizarSaldo();
    
    public abstract void retirar(double retirar);

    @Override
    public String toString() {
        return "Cuenta{" + "numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + ", cliente=" + cliente + '}';
    }
    
}

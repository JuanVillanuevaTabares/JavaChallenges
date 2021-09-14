/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto4;

/**
 *
 * @author villa
 */

public class Inmueble {
    
    private String nCasa, IDArrendador;
    private double costoMensual;
    private int cantidadMesesArrendado;
    
    Inmueble(String nCasa, String IDArrendador, double costoMensual, int cantidadMesesArrendado) {
        this.nCasa = nCasa;
        this.IDArrendador = IDArrendador;
        this.costoMensual = costoMensual;
        this.cantidadMesesArrendado = cantidadMesesArrendado;
    }
    
    Inmueble(String nCasa, String IDArrendador, double costoMensual) {
        this.nCasa = nCasa;
        this.IDArrendador = IDArrendador;
        this.costoMensual = costoMensual;
    }    
    
    public String getnCasa() {
        return this.nCasa;
    }
    
    public void setnCasa(String nCasa) {
        this.nCasa = nCasa;
    }

    public String getIDArrendador() {
        return IDArrendador;
    }

    public void setIDArrendador(String IDArrendador) {
        this.IDArrendador = IDArrendador;
    }

    public double getCostoMensual() {
        return costoMensual;
    }

    public void setCostoMensual(double costoMensual) {
        this.costoMensual = costoMensual;
    }

    public int getCantidadMesesArrendado() {
        return cantidadMesesArrendado;
    }

    public void setCantidadMesesArrendado(int cantidadMesesArrendado) {
        this.cantidadMesesArrendado = cantidadMesesArrendado;
    }
}

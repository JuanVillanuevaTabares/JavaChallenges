/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto2;

/**
 *
 * @author villa
 */

public class Taxi extends Vehiculo {
    private double distanciaRecorrida = 0;
    private boolean segurosActivados = false;
    
    public Taxi(String nombreConductor, int nMaximoPasajeros) {
        super(nombreConductor,nMaximoPasajeros);
    }
    
    public Taxi(String nombreConductor) {
        super(nombreConductor);
        super.setnMaximoPasajeros(1);
    }
    
    public void reiniciarTaximetro() {
        this.distanciaRecorrida = 0;
    }
    
    public void presionarBotonPanico() {
        super.setEnMarcha(false);
        this.segurosActivados = false;
        super.setnPasajeros(super.getnPasajeros() - 1);
        super.setCantidadDinero(0);
    }
    
    @Override
    public void dejarPasajero() {
        if(super.getnPasajeros() >= 1 && !this.segurosActivados) {
            super.setnPasajeros(super.getnPasajeros() - 1);
            super.setCantidadDinero(super.getCantidadDinero() + this.calcularPasaje());
            reiniciarTaximetro();
        }
    }
    
    public void recogerPasajero() {
        if(super.getnPasajeros() < super.getnMaximoPasajeros() && !this.segurosActivados) {
            super.setnPasajeros(super.getnPasajeros() + 1);
            super.setCantidadDinero(super.getCantidadDinero());
        }
    }
    

    public void gestionarMarcha() {
        if(!super.isEnMarcha() && this.segurosActivados) {
            super.setEnMarcha(true);
        } else {
            super.setEnMarcha(false);
        }
    }
    
    @Override
    public void moverDerecha(double d) {
        if(super.isEnMarcha()) {
            super.setLocalizacionX(super.getLocalizacionX() + d);
            if(super.getnPasajeros() > 0) {
                this.distanciaRecorrida += d;
            }
        }
        
    }
    
    @Override
    public void moverIzquierda(double d) {
        if(super.isEnMarcha()) {
            super.setLocalizacionX(super.getLocalizacionX() - d);
            if(super.getnPasajeros() > 0) {
                this.distanciaRecorrida += d;
            }
        }
    }
        
    @Override
    public void moverArriba(double d) {
        if(super.isEnMarcha()) {
            super.setLocalizacionY(super.getLocalizacionY() + d);
            if(super.getnPasajeros() > 0) {
                this.distanciaRecorrida += d;
            }
        }
    }

    @Override
    public void moverAbajo(double d) {
        if(super.isEnMarcha()) {
            super.setLocalizacionY(super.getLocalizacionY() - d);
            if(super.getnPasajeros() > 0) {
                this.distanciaRecorrida += d;
            }
        }
    }
    
    public double calcularPasaje() {
        return 3000 + 2300 * this.distanciaRecorrida;
    }
    
    public void gestionarSeguros() {
        this.segurosActivados = !(!super.isEnMarcha() && this.segurosActivados);
    }
    
    public double getDistanciaRecorrida() {
        return this.distanciaRecorrida;
    }

    public void setDistanciaRecorrida(double distanciaRecorrida) {
        this.distanciaRecorrida = distanciaRecorrida;
    }
            
            

    public boolean isSegurosActivados() {
        return segurosActivados;
    }

    public void setSegurosActivados(boolean segurosActivados) {
        this.segurosActivados = segurosActivados;
    }
}
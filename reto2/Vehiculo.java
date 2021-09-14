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
public abstract class Vehiculo {
    private String nombreConductor;
    private int nPasajeros = 0;
    private double cantidadDinero = 0;
    private int nMaximoPasajeros;
    private double localizacionX = 0;
    private double localizacionY = 0;
    private boolean aireAcondicionadoActivado = false;
    private boolean motorEncendido = false;
    private boolean wifiEncendido = false;
    private boolean enMarcha = false;

    public Vehiculo(String nombreConductor, int nMaximoPasajeros) {
        this.nombreConductor = nombreConductor;
        this.nMaximoPasajeros = nMaximoPasajeros;
    }
    
    public Vehiculo(String nombreConductor) {
        this.nombreConductor = nombreConductor;
        this.nMaximoPasajeros = 1;
    }
        
    public void dejarPasajero(){
        if(nPasajeros >= 1) {
            if(!this.enMarcha){
                this.nPasajeros--;
            }
        }
    }

    public double calcularDistanciaAcopio(){
        return Math.sqrt(Math.pow(localizacionX, 2) + Math.pow(localizacionY, 2));
    }    
    
    public void gestionarAireAcondicionado(){
        if(!this.motorEncendido){
            this.aireAcondicionadoActivado = false;
        }else{
            if(!this.aireAcondicionadoActivado){
                this.aireAcondicionadoActivado = true;
            }else if (this.aireAcondicionadoActivado){
                this.aireAcondicionadoActivado = false;
            }
        }
    }
    
    public void gestionarMotor(){
        if(this.motorEncendido == false){
            this.motorEncendido = true;
        }else{
            this.motorEncendido = false;
            this.aireAcondicionadoActivado = false;
            this.wifiEncendido = false;
            this.enMarcha = false;
        }
    }
    
    public void gestionarWifi(){
        if(!this.motorEncendido){
            this.wifiEncendido = false;
        }else{
            if(wifiEncendido == false){
                this.wifiEncendido = true;
            }
        }
    }
    
//    public void gestionarMarcha(){
//        if(this.motorEncendido){
//           if(!this.enMarcha){
//               this.enMarcha = true;
//            }else if (enMarcha){
//                this.enMarcha = false;
//            } 
//        }
//        if(!this.motorEncendido){
//           this.enMarcha = false;
//        }
//    }
    
    public void moverDerecha(double d){
        if(this.enMarcha){
            this.localizacionX += d;
        }
    }
    
    public void moverIzquierda(double d){
        if(this.enMarcha){
            this.localizacionX -= d;
        }
    }
    
    public void moverArriba(double d){
        if(this.enMarcha){
            this.localizacionY += d;
        }
    }
    
    public void moverAbajo(double d){
        if(this.enMarcha){
            this.localizacionY -= d;
        }
    }
    
    public String getNombreConductor() {
        return nombreConductor;
    }

    public void setNombreConductor(String nombreConductor) {
        this.nombreConductor = nombreConductor;
    }

    public int getnPasajeros() {
        return nPasajeros;
    }

    public void setnPasajeros(int nPasajeros) {
        this.nPasajeros = nPasajeros;
    }

    public double getCantidadDinero() {
        return cantidadDinero;
    }

    public void setCantidadDinero(double cantidadDinero) {
        this.cantidadDinero = cantidadDinero;
    }

    public int getnMaximoPasajeros() {
        return nMaximoPasajeros;
    }

    public void setnMaximoPasajeros(int nMaximoPasajeros) {
        this.nMaximoPasajeros = nMaximoPasajeros;
    }

    public double getLocalizacionX() {
        return localizacionX;
    }

    public void setLocalizacionX(double localizacionX) {
        this.localizacionX = localizacionX;
    }

    public double getLocalizacionY() {
        return localizacionY;
    }

    public void setLocalizacionY(double localizacionY) {
        this.localizacionY = localizacionY;
    }

    public boolean isAireAcondicionadoActivado() {
        return aireAcondicionadoActivado;
    }

    public void setAireAcondicionadoActivado(boolean aireAcondicionadoActivado) {
        this.aireAcondicionadoActivado = aireAcondicionadoActivado;
    }

    public boolean isMotorEncendido() {
        return motorEncendido;
    }

    public void setMotorEncendido(boolean motorEncendido) {
        this.motorEncendido = motorEncendido;
    }

    public boolean isWifiEncendido() {
        return wifiEncendido;
    }

    public void setWifiEncendido(boolean wifiEncendido) {
        this.wifiEncendido = wifiEncendido;
    }

    public boolean isEnMarcha() {
        return enMarcha;
    }

    public void setEnMarcha(boolean enMarcha) {
        this.enMarcha = enMarcha;
    }
}

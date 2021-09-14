/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto1;

/**
 *
 * @author villa
 */
public class Main {
    public static void main(String[] args) {
        
        Autobus camion1 = new Autobus("Giorgia", 3, false);

// Primer test. El que sale en la guía.
        
//        camion1.moverDerecha(5);
//        
//        camion1.gestionarWifi();
//        camion1.gestionarAireAcondicionado();
//        camion1.gestionarMarcha();
//        
//        camion1.gestionarMotor();
//        camion1.gestionarMarcha();
//        camion1.moverDerecha(5);
//        
//        camion1.recogerPasajero(2);
//        camion1.gestionarPuerta();
//        camion1.moverArriba(10);
//        
//        camion1.gestionarMarcha();
//        camion1.gestionarPuerta();
//        camion1.recogerPasajero(1);
//        camion1.recogerPasajero(4);
//        camion1.recogerPasajero(6);
//        
//        camion1.gestionarWifi();
//        camion1.gestionarAireAcondicionado();
//        camion1.gestionarMarcha();
//        camion1.moverIzquierda(2);
//        
//        camion1.dejarPasajero();
//        camion1.gestionarMotor();
//        camion1.calcularDistanciaAcopio();

// ..........................................................

// Segundo test.

//        camion1.gestionarPuerta();
//        camion1.recogerPasajero(1);
//        camion1.gestionarMarcha();
//        camion1.moverArriba(10);
//        camion1.gestionarPuerta();
//        camion1.gestionarMarcha();
//        camion1.moverIzquierda(10);
//        camion1.moverArriba(3);   

        System.out.println("nombreConductor: " + camion1.getNombreConductor());
        System.out.println("nPasajeros: " + camion1.getnPasajeros());
        System.out.println("cantidadDinero: " + camion1.getCantidadDinero());
        System.out.println("nMaximoPasajeros: " + camion1.getnMaximoPasajeros());
        System.out.println("localizacionX: " + camion1.getLocalizacionX());
        System.out.println("localizacionY: " + camion1.getLocalizacionY());
        System.out.println("puertaAbierta: " + camion1.isPuertaAbierta());
        System.out.println("aireAcondicionadoActivado: " + camion1.isAireAcondicionadoActivado());
        System.out.println("motorEncendido: " + camion1.isMotorEncendido());
        System.out.println("wifiEncendido: " + camion1.isWifiEncendido());
        System.out.println("enMarcha: " + camion1.isEnMarcha());
    }
}

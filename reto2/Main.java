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
public class Main {
    public static void main(String[] args) {
        
////      Prueba del Autobus en el pdf.
//
//        Autobus a = new Autobus("Pepe", 30);
//        
//        //
//        a.recogerPasajero(2);
//        //
//        a.gestionarPuerta();
//        a.gestionarMarcha();
//        //
//        a.recogerPasajero(2);
//        //
//        a.gestionarMarcha();
//        a.gestionarPuerta();
//        //
//        a.moverArriba(2);
//        a.moverDerecha(5);
//        a.gestionarWifi();
//        a.gestionarAireAcondicionado();
//        //
//        a.gestionarMotor();
//        a.moverIzquierda(2);

//        // Prueba del calificador para la clase Autobus.
//        
//        Autobus a = new Autobus("Filomeno", 2);
//        
//        a.gestionarPuerta();
//        a.recogerPasajero(1);
//        a.recogerPasajero(3);
//        a.recogerPasajero(6);
//        a.gestionarMarcha(); 
//        a.gestionarPuerta(); 
//        a.gestionarMarcha(); 
//        a.gestionarMotor(); 
//        a.gestionarMarcha(); 
//        a.moverArriba(1);
//        a.moverIzquierda(2);
//        a.moverAbajo(3);
//        a.recogerPasajero(6);
//        a.gestionarMarcha();
//        a.gestionarPuerta(); 
//        a.recogerPasajero(4);
//
//        System.out.println("nombreConductor: " + a.getNombreConductor());
//        System.out.println("nPasajeros: " + a.getnPasajeros());
//        System.out.println("cantidadDinero: " + a.getCantidadDinero());
//        System.out.println("nMaximoPasajeros: " + a.getnMaximoPasajeros());
//        System.out.println("localizacionX: " + a.getLocalizacionX());
//        System.out.println("localizacionY: " + a.getLocalizacionY());
//        System.out.println("puertaAbierta: " + a.isPuertaAbierta());
//        System.out.println("aireAcondicionadoActivado: " + a.isAireAcondicionadoActivado());
//        System.out.println("motorEncendido: " + a.isMotorEncendido());
//        System.out.println("wifiEncendido: " + a.isWifiEncendido());
//        System.out.println("enMarcha: " + a.isEnMarcha());

////      Prueba del Taxi en el pdf.
        
//        Taxi b = new Taxi("Pepito");
//        
//        //
//        b.gestionarMotor();
//        b.gestionarMarcha();
//        b.recogerPasajero();
//        //
//        b.gestionarMarcha();
//        b.recogerPasajero();
//        b.moverArriba(10);
//        b.moverDerecha(12);
//        b.gestionarSeguros();
//        b.moverAbajo(10);
//        b.moverIzquierda(13);
//        //
//        b.gestionarAireAcondicionado();
//        b.gestionarWifi();
//        b.gestionarMotor();
//        b.presionarBotonPanico();
//        //

////      Prueba del calificador para la clase Taxi.
        
//        Taxi b = new Taxi("Pepe");
//        
//        b.gestionarMotor();
//        b.gestionarMarcha();
//        b.recogerPasajero();
//        b.gestionarMarcha();
//        b.recogerPasajero();
//        b.moverArriba(10);
//        b.moverDerecha(12);
//        b.gestionarSeguros();
//        b.moverAbajo(10);
//        b.moverIzquierda(13);
//        b.gestionarAireAcondicionado();
//        b.gestionarWifi();
//        b.gestionarMotor();
//        b.presionarBotonPanico();
//        b.dejarPasajero();
        
////      Prueba 2 del calificador para la clase Taxi.

        Taxi b = new Taxi("Filomeno");

        b.gestionarMotor();
        b.recogerPasajero();
        b.gestionarSeguros();
        b.gestionarMarcha(); 
        b.moverAbajo(5);
        b.moverDerecha(6);
        b.moverIzquierda(2);
        b.gestionarSeguros();
        b.gestionarMarcha();
        b.dejarPasajero();
        b.dejarPasajero();
        b.gestionarSeguros();
        b.dejarPasajero();
        b.recogerPasajero();
        b.gestionarSeguros();
        b.moverArriba(1);
        b.gestionarMarcha();
        b.gestionarSeguros();
        b.dejarPasajero();
                
        System.out.println("nombreConductor: " + b.getNombreConductor());
        System.out.println("nPasajeros: " + b.getnPasajeros());
        System.out.println("cantidadDinero: " + b.getCantidadDinero());
        System.out.println("nMaximoPasajeros: " + b.getnMaximoPasajeros());
        System.out.println("localizacionX: " + b.getLocalizacionX());
        System.out.println("localizacionY: " + b.getLocalizacionY());
        System.out.println("aireAcondicionadoActivado: " + b.isAireAcondicionadoActivado());
        System.out.println("motorEncendido: " + b.isMotorEncendido());
        System.out.println("wifiEncendido: " + b.isWifiEncendido());
        System.out.println("enMarcha: " + b.isEnMarcha());
        System.out.println("distanciaRecorrida: " + b.getDistanciaRecorrida());
        System.out.println("segurosActivados: " + b.isSegurosActivados());

    }
    
}

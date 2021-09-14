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
public class Autobus extends Vehiculo {
    private boolean puertaAbierta = false;
    
    public Autobus(String nombreConductor, int nMaximoPasajeros){
        super(nombreConductor, nMaximoPasajeros);
    }
         
    public void recogerPasajero(int estrato){
        if(!super.isEnMarcha() && super.getnPasajeros() < super.getnMaximoPasajeros() && this.puertaAbierta){            
            if(estrato >= 0 && estrato <= 2){
                super.setCantidadDinero(super.getCantidadDinero() + Autobus.calcularPasaje(estrato)); 
            }else if(estrato <= 4){
                super.setCantidadDinero(super.getCantidadDinero() + Autobus.calcularPasaje(estrato));
            }else if(estrato <= 6){
                super.setCantidadDinero(super.getCantidadDinero() + Autobus.calcularPasaje(estrato));
            }
            if(super.getnPasajeros() < super.getnMaximoPasajeros()) {
                super.setnPasajeros(super.getnPasajeros()+1);                
            }            
        }
    }
    
////    Actualización: Un pasajero no se puede bajar de un autobus si este tiene la puerta cerrada), 
////    la recomendación es sobreescribir el método dejarPasajero() en la clase Autobus y hacer que esta condición se cumpla)

    @Override
    public void dejarPasajero(){
        if(super.getnPasajeros() >= 1 && this.puertaAbierta) {
            if(!super.isEnMarcha()){
                super.setnPasajeros(super.getnPasajeros() - 1);
            }
        }
    }
    
    public void gestionarPuerta(){
        this.puertaAbierta = !this.puertaAbierta && !super.isEnMarcha();
    }    
    
/**
     *
     */

    public void gestionarMarcha(){
        if(!super.isEnMarcha() && !this.puertaAbierta && super.isMotorEncendido()){
            super.setEnMarcha(true);
        }else{
            super.setEnMarcha(false);
        }
    }    
    
    public static double calcularPasaje(int estrato){
        if(estrato >= 0 && estrato <= 2) {
            return 1500;
        } else if (estrato <= 4) {
            return 2600;
        } else if (estrato <= 6) {
            return 3000;
        }
        return calcularPasaje(estrato); 
    }
        
    public boolean isPuertaAbierta() {
        return puertaAbierta;
    }

    public void setPuertaAbierta(boolean puertaAbierta) {
        this.puertaAbierta = puertaAbierta;
    }
}

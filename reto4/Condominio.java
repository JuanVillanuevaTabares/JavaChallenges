/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto4;

import java.util.ArrayList;

/**
 *
 * @author villa
 */
public class Condominio {
    
    ArrayList<Inmueble> inmuebles;
    
    public Condominio() {
        this.inmuebles = new ArrayList<>();
    }
    
    public void agregarInmueble(Inmueble i) {
        if(!this.inmuebles.contains(i)) {
            this.inmuebles.add(i);
        }        
    }
    
    public void eliminarInmueble(String ID) {
        Inmueble aux;
        
        for(int i = 0; i < this.inmuebles.size(); i++) {
            aux = this.inmuebles.get(i);
            if(aux.getnCasa().equals(ID)) {
                this.inmuebles.remove(i);
                break;
            }
        }
    }
    
    public double calcularArriendoMensualCondominio() {
        double arriendoMensualCondominio = 0;
        for(Inmueble i: inmuebles) {
            arriendoMensualCondominio += i.getCostoMensual();
        }
        return arriendoMensualCondominio;
    }
    
    public double promedioCostoInmueble() {
        double costoInmuebles = 0;
        double nInmuebles = 0;
        for(Inmueble i: inmuebles) {
            costoInmuebles += i.getCostoMensual();
            nInmuebles++;
        }
        return costoInmuebles/nInmuebles;
    }
    
    public double desviacionEstandarCostoInmueble() {
        double sum = 0;
        double nInmuebles = 0;
        for(Inmueble i: inmuebles) {
            sum += Math.pow(i.getCostoMensual()- promedioCostoInmueble(), 2);
            nInmuebles++;
        }
        return Math.sqrt((1/nInmuebles)*sum);
    }

    public ArrayList<Inmueble> getInmuebles() {
        return inmuebles;
    }

    public void setInmuebles(ArrayList<Inmueble> inmuebles) {
        this.inmuebles = inmuebles;
    }
    
}

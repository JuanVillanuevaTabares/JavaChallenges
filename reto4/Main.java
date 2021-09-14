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
public class Main {
    public static void main(String[] args) {
        
        // Prueba del calificador
        Condominio condominio = new Condominio();
        
        Inmueble i1 = new Inmueble("A1","72023394", 700000.0);
        Inmueble i2 = new Inmueble("A12","1037681391", 670000.0);
        Inmueble i3 = new Inmueble("A13","33277591", 1000000.0);
        Inmueble i4 = new Inmueble("A21","1032678245", 1340000.0);
        
        condominio.agregarInmueble(i1);
        condominio.agregarInmueble(i2);
        condominio.agregarInmueble(i3);
        condominio.eliminarInmueble("123456789");
        condominio.agregarInmueble(i4);
        condominio.eliminarInmueble("A12");
        
        System.out.println("Arriendo mensual del condominio: " + condominio.calcularArriendoMensualCondominio());
        System.out.println("Promedio del costo de arriendo de los inmuebles del condominio:: " + condominio.promedioCostoInmueble());
        System.out.println("Desviación estándar del costo de arriendo de los inmuebles del condominio: " + condominio.desviacionEstandarCostoInmueble());
       
    }
}

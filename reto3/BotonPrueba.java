/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto3;

/**
 *
 * @author villa
 */
public class BotonPrueba extends Boton {
    
    // Constructor
    public BotonPrueba(double ancho, double alto, String colorFondo, String colorTexto, String texto) {
        super(ancho, alto, colorFondo, colorTexto, texto);
    }
    
    public void hacerClick() {
        super.setTexto("Hello World!");
    }
    
}

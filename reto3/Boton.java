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
public abstract class Boton {
    
    // atributos
    private double ancho, alto;
    private String colorFondo, colorTexto, texto;
    
    // constructor
    public Boton(double ancho, double alto, String colorFondo, String colorTexto, String texto) {
        this.ancho = ancho;
        this.alto = alto;
        this.colorFondo = colorFondo;
        this.colorTexto = colorTexto;
        this.texto = texto;
        
    }
    
    public abstract void hacerClick();

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public String getColorFondo() {
        return colorFondo;
    }

    public void setColorFondo(String colorFondo) {
        this.colorFondo = colorFondo;
    }

    public String getColorTexto() {
        return colorTexto;
    }

    public void setColorTexto(String colorTexto) {
        this.colorTexto = colorTexto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

}

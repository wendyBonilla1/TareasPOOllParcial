package com.mycompany.tareamodulo5;

public class Linea extends Formas {

    double largo;

    @Override
    void dibujar() {
        System.out.println("Dibujar una linea."); //To change body of generated methods, choose Tools | Templates.
    }

    void establecerLargo(double l) {
        this.largo = l;
    }
}

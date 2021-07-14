package com.mycompany.tareamodulo5;

public class Circulo extends Formas {

    double radio;

    @Override
    void dibujar() {
        System.out.println("Dibujar un circulo"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void establecerColor(String color) {
        this.color = color;//To change body of generated methods, choose Tools | Templates.
    }

    void calcularRadio(double c) {
        this.radio = c / (2 * Math.PI);
    }
}

package com.mycompany.tareamodulo5;

public class Triangulo extends Formas {

    double area;

    @Override
    void dibujar() {
        System.out.println("Dibujar una triangulo."); //To change body of generated methods, choose Tools | Templates.

    }

    void calcularArea(double b, double h) {
        this.area = (b * h) / 2;
    }

}

package com.mycompany.tareamodulo5;

public class Cuadrado extends Formas {

    double area;

    @Override
    void dibujar() {
        System.out.println("Dibujar una cuadrado."); //To change body of generated methods, choose Tools | Templates.

    }

    void calularaArea(double a) {
        this.area = a * a;
    }

}

package com.mycompany.tareamodulo5;

import com.mycompany.tareamodulo5.*;

public class Main {

    public static void main(String[] args) {
        // Linea
        Linea linea = new Linea();
        linea.establecerColor("Linea roja");
        linea.establecerLargo(10);
        linea.dibujar();
        System.out.println("Largo: " + linea.largo + " Color: " + linea.color);

        System.out.println("");

        //Cuadrado
        Cuadrado cuadrado = new Cuadrado();
        cuadrado.establecerColor("Cuadrado azul");
        cuadrado.calularaArea(10);
        cuadrado.dibujar();
        System.out.println("Area: " + cuadrado.area + " Color: " + cuadrado.color);

        System.out.println("");

        // Circulo
        Circulo circulo = new Circulo();
        circulo.establecerColor("Circulo amarillo");
        circulo.calcularRadio(10);
        circulo.dibujar();
        System.out.println("Radio: " + circulo.radio + " Color: " + circulo.color);

        System.out.println("");

        // Triangulo
        Triangulo triangulo = new Triangulo();
        triangulo.establecerColor("Triangulo morado");
        triangulo.calcularArea(10, 20);
        triangulo.dibujar();
        System.out.println("Area: " + triangulo.area + " Color: " + triangulo.color);
    }
}

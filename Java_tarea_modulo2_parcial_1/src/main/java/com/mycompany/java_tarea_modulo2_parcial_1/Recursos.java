package com.mycompany.java_tarea_modulo2_parcial_1;

public class Recursos {

    void primerMetodo() {
        System.out.println("primerMetodo");
        System.out.println("Programación Orientada a Objetos 2021");
    }

    void segundoMetodo(int x) {
        System.out.println("segundoMetodo");

        if (x >= 21) {
            System.out.println("Mayor de edad");

        } else {
            System.out.println("Menor de edad");

        }
    }

    void tercerMetodo(int num1, int num2) {
        System.out.println("tercerMetodo");

        System.out.println("" + num1 * num2);
    }

    void cuartometodo(int length) {
        System.out.println("cuartometodo");

        for (int i = 0; i < length; i++) {
            System.out.println("" + (i + 1));
        }
    }

}

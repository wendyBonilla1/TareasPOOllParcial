package com.mycompany.tareamodulo4;

public class Main {

    public static void main(String[] args) {
        // Part 1
        Futbolista futbolista = new Futbolista();
        futbolista.setEdad(34);
        futbolista.setNombre("Lionel Messi");
        futbolista.setEquipoActual("Barcelona");
        System.out.println("Part 1");
        System.out.println("\n" + futbolista.getEdad() + "\n" + futbolista.getNombre() + "\n" + futbolista.getEquipoActual());
        System.out.println("\n");
        System.out.println("Part 2");

        // Part 2
        Equipo barcelona = new Barcelona();
        barcelona.getCapitan();
        barcelona.getEquipo();
        System.out.println("\n");

        Equipo realMadrid = new RealMadrid();
        realMadrid.getCapitan();
        realMadrid.getEquipo();
        System.out.println("\n");

        Equipo liverpool = new Liverpool();
        liverpool.getCapitan();
        liverpool.getEquipo();

    }
}

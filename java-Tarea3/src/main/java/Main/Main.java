/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import com.mycompany.java.tarea3.Estudiante;

/**
 *
 * @author sirnada
 */
public class Main {
    public static void main(String[] args) {
        Estudiante estudiante=new Estudiante();
        estudiante.setCodigo("201910010230");
        estudiante.setNombre("Wendy Bonilla");
        estudiante.setSexo("Mujer");
        estudiante.setTelefono("88888888");
        estudiante.setCorreo("wendy@example.com");

        System.out.println(" "+estudiante.getCodigo()+" "+estudiante.getNombre()+" "+estudiante.getCorreo()+" "+estudiante.getSexo()+" "+estudiante.getTelefono());
    }
    
}

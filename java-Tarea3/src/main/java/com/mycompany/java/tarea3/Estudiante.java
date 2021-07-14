/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.java.tarea3;

/**
 *
 * @author sirnada
 */
public class Estudiante {

    private String codigo;
    private String nombre;
    private String sexo;
    private String correo;
    private String telefono;

    public Estudiante(String codigo, String nombre, String sexo,String correo,String telefono) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.sexo = sexo;        
        this.correo = correo;
        this.telefono = telefono;

    }

    public Estudiante() {

    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSexo() {
        return sexo;
    }
    
    
    public String getCorreo() {
        return correo;
    }
    public String getTelefono() {
        return telefono;
    }

}

package com.kryzcorp.listaspersonalizadas.Objetos;

/**
 * Created by Alexis on 14/12/2017.
 */

public class Persona {
    private String cedula;
    private String nombre;
    private String direcion;
    private String telefono;

    public Persona(String cedula, String nombre, String direcion, String telefono) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.direcion = direcion;
        this.telefono = telefono;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirecion() {
        return direcion;
    }

    public void setDirecion(String direcion) {
        this.direcion = direcion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return this.cedula+"\n"+this.nombre+"\n"+this.direcion+"\n"+this.telefono;
    }
}

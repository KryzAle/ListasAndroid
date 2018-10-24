package com.kryzcorp.listaspersonalizadas.Objetos;

/**
 * Created by KryzAle on 16/12/2017.
 */

public class Mascota {
    private String nombre;
    private String raza;
    private int edad;
    private String duenio;

    public Mascota(String nombre, String raza, int edad, String duenio) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.duenio = duenio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getEdad() {
        String value = String.valueOf(this.edad);
        return value;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDuenio() {
        return duenio;
    }

    public void setDuenio(String duenio) {
        this.duenio = duenio;
    }
    @Override
    public String toString() {
        return this.nombre+"\n"+this.raza+"\n"+this.edad+"\n"+this.duenio;
    }
}

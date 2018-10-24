package com.kryzcorp.listaspersonalizadas.Objetos;

/**
 * Created by KryzAle on 16/12/2017.
 */

public class Auto {
    private String marca;
    private String modelo;
    private String anio;
    private String dueño;

    public Auto(String marca, String modelo, String anio, String dueño) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.dueño = dueño;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }
    @Override
    public String toString() {
        return this.marca+"\n"+this.modelo+"\n"+this.anio+"\n"+this.dueño;
    }
}

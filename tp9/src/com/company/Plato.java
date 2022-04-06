package com.company;

public class Plato {
    private String nombre;
    private float precio;

    public Plato() {
        this.nombre = "Milanesa";
        this.precio = 10.50f;
    }

    public Plato(String nombre, float precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}

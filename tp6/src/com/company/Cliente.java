package com.company;

import java.util.ArrayList;

public class Cliente {
    private int id;
    private String nombre;
    private int edad;
    private ArrayList<Libro> arrayLibrosComprados = new ArrayList<>();

    public Cliente(int id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }
    /* ------------------- Getters ------------------- */

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public ArrayList<Libro> getArrayLibrosComprados() {
        return arrayLibrosComprados;
    }

    /* ------------------- Setters ------------------- */

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void añadirLibrosComprados(Libro unLibro) {
        this.arrayLibrosComprados.add(unLibro);
    }

}

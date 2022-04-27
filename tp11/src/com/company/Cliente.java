package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class Cliente {
    private int id;
    private String nombre;
    private int edad;
    private ArrayList<Libro> arrayLibrosComprados;
    private HashMap<Libro, Integer> unidadesPorLibro;

    public Cliente(int id, String nombre, int edad) {
        this.id = id;
        this.arrayLibrosComprados = new ArrayList<>();
        this.nombre = nombre;
        this.edad = edad;
        this.unidadesPorLibro = new HashMap<>();
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
    public void librosComprados(){
        int precioTotal = 0;
        for (Libro unLibro : unidadesPorLibro.keySet()) {
                precioTotal += unLibro.getPrecio()*unidadesPorLibro.get(unLibro);
                System.out.println(unLibro.getNombre()+" "+unidadesPorLibro.get(unLibro);
        
        }
        System.out.println("Precio total: "+precioTotal);
    }
}

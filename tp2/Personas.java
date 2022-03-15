package com.company;

public class Personas {

    private String nombre;
    private int dni;
    private int edad;

    public Personas(){
        this.nombre = "";
        this.edad = 0;
        this.dni = 0;

    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre1) {
        this.nombre = nombre1;
    }
    /*--------------------------------*/
    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad1) {
        this.edad = edad1;
    }

    /*--------------------------------*/
    public int getDni() {
        return this.dni;
    }

    public void setDni(int dni1) {
        this.dni = dni1;
    }



}

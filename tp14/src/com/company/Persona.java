package com.company;

public class Persona {

    public Persona() {
        this.dni = 123;
        this.edad = 18;
        this.nombre = "Thiago Esteban Chillemi";
    }

    private int dni;
    private String nombre;
    private int edad;

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}




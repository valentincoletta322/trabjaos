package com.company;

public class Persona   {
    private int dni;
    private String nombre;
    private int edad;
    private int telefono;
    private String direccion;

    public Persona() {
        this.dni = 1000000;
        this.nombre = "Martin Martinez";
        this.edad = 18;
        this.telefono = 150000;
        this.direccion = "Calle falsa 123";
    }

    public Persona(int dni, String nombre, int edad, int telefono, String direccion) {
        this.dni = 1000000;
        this.nombre = "Martin Martinez";
        this.edad = 18;
        this.telefono = 150000;
        this.direccion = "Calle falsa 123";
    }


    /* getters */
    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    /* setters */
    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

}

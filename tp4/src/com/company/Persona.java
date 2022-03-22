package com.company;

public class Persona {

    private String nombre;
    private int dni;
    private int edad;

    public Persona(String nombre, int edad, int dni){
        this.nombre=nombre;
        this.edad=edad;
        this.dni=dni;
    }

    public boolean sonIguales(int dni){

        if (this.dni == dni) return true;
        else return false;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
    }

    public int getEdad() {
        return edad;
    }
}

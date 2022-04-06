package com.company;

public class Alumno extends Persona{
    private String curso;
    private int nroLegajo;
    private String orientacion;

    public Alumno(String curso, int nroLegajo, String orientacion) {
        this.curso = curso;
        this.nroLegajo = nroLegajo;
        this.orientacion = orientacion;
    }

    public Alumno(int dni, String nombre, int edad, int telefono, String direccion, String curso, int nroLegajo, String orientacion) {
        super(dni, nombre, edad, telefono, direccion);
        this.curso = curso;
        this.nroLegajo = nroLegajo;
        this.orientacion = orientacion;
    }



}

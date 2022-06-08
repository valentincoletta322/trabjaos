package com.company;

public class Vivienda {

    private String direccion;
    private char tipoDeDomicilio; // p para particular, e para empresa
    private Dueño dueño;

    public Vivienda() {
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public char getTipoDeDomicilio() {
        return tipoDeDomicilio;
    }

    public void setTipoDeDomicilio(char tipoDeDomicilio) {
        this.tipoDeDomicilio = tipoDeDomicilio;
    }

    public Dueño getDueño() {
        return dueño;
    }

    public void setDueño(Dueño dueño) {
        this.dueño = dueño;
    }
}

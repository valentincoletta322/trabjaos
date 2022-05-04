package com.company;

public class Viaje {
    private float precio;
    private String fecha;
    private String hora;

    public Viaje(int precio, String fecha, String hora) {
        this.precio = precio;
        this.fecha = fecha;
        this.hora = hora;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
}

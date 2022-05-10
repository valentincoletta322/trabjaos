package com.company;

public class Pasajero {

    private int dni;
    private String nombre;
    private String apellido;
    private TarjetaEquis tarjeta;

    public Pasajero(String nombre, String apellido, int tarjeta) {
        this.nombre = nombre;
        this.dni = 123;
        this.apellido = apellido;
        this.tarjeta = new TarjetaEquis();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public TarjetaEquis  getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(TarjetaEquis tarjeta) {
        this.tarjeta = tarjeta;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
}

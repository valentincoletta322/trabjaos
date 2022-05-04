package com.company;

import java.util.ArrayList;

public class Sistema {
    private ArrayList<Pasajero> pasajerosPresentes;
    private ArrayList<Pasajero> historialDePasajeros;
    private String linea;

    public Sistema() {
        this.linea = "";
        this.pasajerosPresentes = new ArrayList<>();
        this.historialDePasajeros = new ArrayList<>();
    }

    public Sistema(String linea) {
        this.linea = linea;
        this.pasajerosPresentes = new ArrayList<>();
        this.historialDePasajeros = new ArrayList<>();
    }

    public void subePasajero(Pasajero pasajero, Float precio){
        TarjetaEquis tarjetaAux = pasajero.getTarjeta();
        if (tarjetaAux.getSaldo()-precio > tarjetaAux.getSaldoNegativoMaximo()){

        }

    }

}

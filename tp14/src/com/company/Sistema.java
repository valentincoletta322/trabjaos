package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

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
            float monto = tarjetaAux.getSaldo();
            tarjetaAux.setSaldo(monto-precio);
            pasajero.setTarjeta(tarjetaAux);
            System.out.println("Bienvenido");
            this.pasajerosPresentes.add(pasajero);
            this.historialDePasajeros.add(pasajero);
        }
        else System.out.println("Saldo insuficiente");
    }

    public void seBajaPasajero(Pasajero pasajero){
        for (int i = 0; i < this.pasajerosPresentes.size(); i++){
            Pasajero unPasajero = pasajerosPresentes.get(i);
            if (unPasajero.getDni() == pasajero.getDni()){
                pasajerosPresentes.remove(i);
                i = pasajerosPresentes.size();
            }
        }
    }

    public HashSet<Pasajero> pasajerosQueSeHanSubidoAlgunaVez(){
        HashSet<Pasajero> hashSetPasajeros = new HashSet<>();

        for (Pasajero unPasajero :
                historialDePasajeros) {
            hashSetPasajeros.add(unPasajero);
        }

        return hashSetPasajeros;

    }

   public HashMap<Integer, Float> pasajeroConUltimoMontoAbonado(){
        HashMap<Integer,Float> pasajerosConMonto = new HashMap<>();

        for (Pasajero unPasajero : this.historialDePasajeros){
            TarjetaEquis tarjeta = unPasajero.getTarjeta();
            int id = tarjeta.getNumeronId();
            float ultimoAbonado = tarjeta.ultimoMontoAbonado();
            pasajerosConMonto.put(id, ultimoAbonado);
        }

        return pasajerosConMonto;
   }

}

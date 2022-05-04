package com.company;

import java.util.ArrayList;

public class TarjetaEquis {
    private int saldo;
    private int saldoNegativoMaximo;
    private int numeronId;
    private ArrayList<Viaje> viajes;

    public TarjetaEquis() {
        this.saldo = 500;
        this.saldoNegativoMaximo = -500;
        this.numeronId = 1;
        this.viajes = new ArrayList<>();
    }

    public TarjetaEquis(int saldo, int saldoNegativoMaximo, int numeronId, ArrayList<Viaje> viajes) {
        this.saldo = saldo;
        this.saldoNegativoMaximo = saldoNegativoMaximo;
        this.numeronId = numeronId;
        this.viajes = new ArrayList<>();
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getSaldoNegativoMaximo() {
        return saldoNegativoMaximo;
    }

    public void setSaldoNegativoMaximo(int saldoNegativoMaximo) {
        this.saldoNegativoMaximo = saldoNegativoMaximo;
    }

    public int getNumeronId() {
        return numeronId;
    }

    public void setNumeronId(int numeronId) {
        this.numeronId = numeronId;
    }
    public void cargarSube(float monto){

    }
    public void realizarViaje(Viaje viaje){

    }
    public void ultimoMontoAbonado(){

    }

}

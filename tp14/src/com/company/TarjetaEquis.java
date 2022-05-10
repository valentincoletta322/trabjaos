package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class TarjetaEquis {
    private float saldo;
    private int saldoNegativoMaximo;
    private int numeronId;
    private ArrayList<Viaje> viajes;

    public TarjetaEquis() {
        this.saldo = 500;
        this.saldoNegativoMaximo = -500;
        this.numeronId = 1;
        this.viajes = new ArrayList<>();
    }

    public TarjetaEquis(float saldo, int saldoNegativoMaximo, int numeronId, ArrayList<Viaje> viajes) {
        this.saldo = saldo;
        this.saldoNegativoMaximo = saldoNegativoMaximo;
        this.numeronId = numeronId;
        this.viajes = new ArrayList<>();
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
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
    public void cargarSaldo(float monto){
        this.saldo += monto;
    }
    public boolean realizarViaje(Viaje viaje){
        if(this.saldo-viaje.getPrecio() < this.saldoNegativoMaximo) return false;
        else {
            this.saldo-=viaje.getPrecio();
            return true;
        }
    }
    public void ultimoMontoAbonado(){
        this.viajes.get(this.viajes.size()-1).getPrecio();

    }

}

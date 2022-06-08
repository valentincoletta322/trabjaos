package com.company;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;

public class Programa {

    private HashSet<Conductor> conductores;
    private int diaDeSemana;
    private int bloque;

    public Programa(int diaDeSemana, int bloque) {
        this.diaDeSemana = diaDeSemana;
        this.bloque = bloque;
        this.conductores = new HashSet<>();
    }

    public HashSet<Conductor> getConductores() {
        return conductores;
    }

    public void setConductores(HashSet<Conductor> conductores) {
        this.conductores = conductores;
    }

    public int getDiaDeSemana() {
        return diaDeSemana;
    }

    public void setDiaDeSemana(int diaDeSemana) {
        this.diaDeSemana = diaDeSemana;
    }

    public int getBloque() {
        return bloque;
    }

    public void setBloque(int bloque) {
        this.bloque = bloque;
    }
}

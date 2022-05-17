package com.company;

public class Cliente extends Persona{
    private int cbu;
    private Cliente(){
        super();
        this.cbu = 1;
    }

    public int getCbu() {
        return cbu;
    }

    public void setCbu(int cbu) {
        this.cbu = cbu;
    }
}


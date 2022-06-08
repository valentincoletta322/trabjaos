package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class SistemaViviendas {

    private HashSet<Vivienda> listaDeVivienda;
    private ArrayList<HashMap<HashMap<Vivienda, Integer>>> listaDeGastos;


    public int precioFinal (Vivienda unaVivienda, int consumoEnKW){
        if (unaVivienda.getTipoDeDomicilio() == 'e') return consumoEnKW*=3;
        else return consumoEnKW*=2;
    }

    public boolean aplicarDescuento(int consumoActual, int consumoViejo){

       if(consumoActual*100/consumoViejo <= 90) return true;
        return false;   
    }


}

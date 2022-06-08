package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Radio {

    HashMap<Integer, HashSet<Programa>> programas;

    public Radio(){

        for(int i = 0; i<7; i++){
            programas.put(i,new HashSet<>());
        }

    }

    public String añadirPrograma(Programa miPrograma, int dia){
        HashSet<Programa> listaDeBloques = this.programas.get(dia);

        for (Programa unPrograma :listaDeBloques) {
            if (unPrograma.getBloque()==miPrograma.getBloque()) return "Error: ya existe un programa en ese bloque";
            listaDeBloques.add(miPrograma);
            this.programas.put(dia, listaDeBloques);
        }

        return "Programa añadido con exito";
    }

    public String diaDeLaSemana(int dia){
        switch(dia){
            case 1: return "Martes";
            case 2: return "Miercoles";
            case 3: return "Jueves";
            case 4: return "Viernes";
            case 5: return "Sabado";
            case 6: return "Domingo";
            default: return "Lunes";
        }
    }

}

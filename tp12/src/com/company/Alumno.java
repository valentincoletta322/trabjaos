package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class Alumno extends Persona {
    private String curso;
    private HashMap<String,ArrayList<Float>> notasPorMateria;

    public void AgregarNota(String unaMateria, float unaNota){
        ArrayList<Float> notas = notasPorMateria.get(unaMateria);
        notas.add(unaNota);
        notasPorMateria.put(unaMateria, notas);

        /*

        for(String key : notasPorMateria.keyset()){

        }

         */
    }

    public void menorNota(){

        float notaMenor = 11;
        for (String key : notasPorMateria.keySet()) {
            for(int i = 0; i<notasPorMateria.get(key).size(); i++) {
                if (notaMenor > notasPorMateria.get(key).get(i)) {
                    notaMenor = notasPorMateria.get(key).get(i);
                }
            }
        }
        System.out.println(notaMenor);
    }

    public void mayorNota(){

        float notaMayor = 0;
        for (String key : notasPorMateria.keySet()) {
            for(int i = 0; i<notasPorMateria.get(key).size(); i++) {
                if (notaMayor < notasPorMateria.get(key).get(i)) {
                    notaMayor = notasPorMateria.get(key).get(i);
                }
            }
        }
        System.out.println(notaMayor);
    }

    public float sacarPromedio(){
        float notasPromedio = 0;
        ArrayList<Float> arrayAux = new ArrayList<>();
        for (String key : notasPorMateria.keySet()) {
            for(int i = 0; i < notasPorMateria.get(key).size();i++) {
                  arrayAux.add(notasPorMateria.get(key).get(i));
            }
        }

        for(int i = 0; i < arrayAux.size();i++) {
            notasPromedio+=arrayAux.get(i);
        }

        return notasPromedio/arrayAux.size();

    }

    public void agregarMateria(String nombreDeMateria){
        ArrayList<Float> notas = new ArrayList<>();
        this.notasPorMateria.put(nombreDeMateria, notas);
    }


}


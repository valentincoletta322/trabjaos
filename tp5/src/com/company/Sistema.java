package com.company;


import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {

    private ArrayList<com.company.Persona> listaDePersonas = new ArrayList<>();

    Sistema(){
    }

    public void añadirPersonasAlSistema(com.company.Persona p1){
        listaDePersonas.add(p1);
    }


    public void mostrarPersona(com.company.Persona p1){
        System.out.println("Nombre: " + p1.getNombre());
        System.out.println("Edad: " + p1.getEdad());
        System.out.println("Dni: " + p1.getDni());
        System.out.println("--------------------------");
    }


    public static void main(String[] args) {

        Sistema sistema = new Sistema();
        Persona persona1 = new Persona("George", 25, 2312321);
        Persona persona2 = new Persona("Patricio Rey", 95, 123312);
        sistema.añadirPersonasAlSistema(persona1);
        sistema.añadirPersonasAlSistema(persona2);

        for (Persona persona : sistema.listaDePersonas){
            sistema.mostrarPersona(persona);
        }

    }
}

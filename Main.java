package com.company;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Personas unaPersona = new Personas();

        System.out.println("Ingrese un nombre");
        Scanner ingreso1 = new Scanner(System.in);
        String inputNombre = ingreso1.nextLine();
        unaPersona.setNombre(inputNombre);
        System.out.println("Su nombre es: "+unaPersona.getNombre());


        System.out.println("Ingrese una edad");
        Scanner ingreso2 = new Scanner(System.in);
        int inputEdad = ingreso2.nextInt();
        unaPersona.setEdad(inputEdad);
        System.out.println("Su edad es: "+unaPersona.getEdad());

        System.out.println("Ingrese un dni");
        Scanner ingreso3 = new Scanner(System.in);
        int inputDni = ingreso3.nextInt();
        unaPersona.setDni(inputDni);
        System.out.println("Su dni es: "+unaPersona.getDni());


    }
}

/*
* 1) Crear una aplicación que pida al usuario ingresar los datos necesarios para crear un objeto de la clase Persona.
2) Crear la instancia de la clase Persona e imprimir cuáles fueron los datos ingresados utilizando "getters".
3) Ofrecerle al usuario la opción de cambiar uno de sus datos (el usuario deberá elegir), realizar el cambio utilizando
"setters" e imprimir nuevamente los datos del objeto creado.
*
*
public class IngresoDeDatos {

    public static void main(String[] args) {

        System.out.println("Ingrese un número");
        Scanner ingreso1 = new Scanner(System.in);
        int num = ingreso1.nextInt();
        System.out.println("El número ingresado es:" + num);


        System.out.println("Ingrese un nombre");
        Scanner ingreso2 = new Scanner(System.in);
        String nombre = ingreso2.nextLine();
        System.out.println("El nombre ingresado es:" + nombre);

        Persona p1 = new Persona();
        p1.setNombre(nombre);
    }
}
*
*
*
* */
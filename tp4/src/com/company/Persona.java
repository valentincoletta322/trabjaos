package com.company;

public class Persona {

    private String nombre;
    private int dni;
    private int edad;

    public Persona(String nombre, int edad, int dni){
        this.nombre=nombre;
        this.edad=edad;
        this.dni=dni;
    }

    public boolean sonIguales(int dni){

        if (this.dni == dni) return true;
        else return false;
    }

  /*  public static void main(String[] args){
        Persona unaPersona = new Persona("Juan");
        Persona otraPersona = new Persona("Juan");

        System.out.println("Son la misma: " +unaPersona.sonIguales(otraPersona));
    }*/

}

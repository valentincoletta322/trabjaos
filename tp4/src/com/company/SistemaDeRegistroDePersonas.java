package com.company;


import java.util.ArrayList;
import java.util.Scanner;

public class SistemaDeRegistroDePersonas {

    private ArrayList<Persona> listaDePersonas = new ArrayList<>();

    SistemaDeRegistroDePersonas(){
        System.out.println("Ingrese una opcion:");
    }

    public void añadirPersonasAlSistema(Persona p1){
        listaDePersonas.add(p1);
    }

    public Persona getListaDePersonas(int i){
        return listaDePersonas.get(i);
    }

    public void eliminarPersonasDelSistema(int dniEliminado){

        for(int i = 0; i<listaDePersonas.size(); i++){
            Persona recorridoDePersonas = listaDePersonas.get(i);
            if (recorridoDePersonas.sonIguales(dniEliminado)) listaDePersonas.remove(i);
            else if (i == listaDePersonas.size()-1) System.out.println("Error");
        }

    }

    public static void main(String[] args) {

        SistemaDeRegistroDePersonas sistema = new SistemaDeRegistroDePersonas();
        int opcionDeMenu = 0;

        while (opcionDeMenu!=6){

            Scanner ingreso1 = new Scanner(System.in);
            System.out.println("1: Registrar una persona");
            System.out.println("2: Eliminar una persona");
            System.out.println("3: Modificar una persona");
            System.out.println("4: Ver todos los mayores de edad");
            System.out.println("5: Ver todos");
            System.out.println("6: Salir");

            opcionDeMenu = ingreso1.nextInt();

            switch (opcionDeMenu){
                case 1:
                    System.out.println("Ingrese en orden: Nombre, edad y dni.");
                    Scanner ingreso2 = new Scanner(System.in);
                    Scanner ingreso3 = new Scanner(System.in);
                    Scanner ingreso4 = new Scanner(System.in);

                    String nuevoNombre = ingreso2.nextLine();
                    int nuevaEdad = ingreso3.nextInt();
                    int nuevoDni = ingreso4.nextInt();

                    Persona nuevaPersona = new Persona(nuevoNombre, nuevaEdad, nuevoDni);
                    sistema.añadirPersonasAlSistema(nuevaPersona);


                    break;

                case 2:
                    System.out.println("Ingrese dni de la persona a eliminar");
                    Scanner ingreso5 = new Scanner(System.in);
                    int dniEliminado = ingreso5.nextInt();
                    sistema.eliminarPersonasDelSistema(dniEliminado);
                    break;

                case 3:
                    break;

                case 4:
                    break;

                case 5:
                    break;

                case 6:
                    System.out.println("bye!");
                    break;


                default:
                    System.out.println("Opcion no valida");
                    break;
            }


        }

    }

}


/*

1 cout "hola"
2 cout "chau"

cin >> opcion

switch(opcion){

    case 1:
        cout "hola";
        break;

     case 2:
     cout chau
     break;



}





if (opcion == 1) cout "hola"
else if (opcion == 2) cout "chau"


 */
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


    public void modificarPersonasDelSistema(int dniIngresado){

        for(int i = 0; i<listaDePersonas.size(); i++){
            Persona recorridoDePersonas = listaDePersonas.get(i);
            if (recorridoDePersonas.sonIguales(dniIngresado)){
                mostrarPersona(recorridoDePersonas);
                System.out.println("Ingrese 1 para modificar nombre, 2 para dni, 3 para edad");
                Scanner ingresoModificacion = new Scanner(System.in);
                int opcion = ingresoModificacion.nextInt();
                switch (opcion){
                    case 1: listaDePersonas.set(i,modificarNombre(recorridoDePersonas));
                        break;
                    case 2: listaDePersonas.set(i,modificarDni(recorridoDePersonas));
                        break;
                    case 3: listaDePersonas.set(i,modificarEdad(recorridoDePersonas));
                        break;

                    default: System.out.println("Error");
                        break;
                }
            }
            else if (i == listaDePersonas.size()-1) System.out.println("Error");
        }

    }

    public Persona modificarNombre(Persona p1){
        System.out.println("Ingrese el nuevo valor");
        Scanner ingresoNombre = new Scanner(System.in);
        String nombreModificado = ingresoNombre.nextLine();
        p1.setNombre(nombreModificado);
        return p1;
    }

    public Persona modificarDni(Persona p1){
        System.out.println("Ingrese el nuevo valor");
        Scanner ingresoDni = new Scanner(System.in);
        int dniModificado = ingresoDni.nextInt();
        p1.setDni(dniModificado);
        return p1;
    }

    public Persona modificarEdad(Persona p1){
        System.out.println("Ingrese el nuevo valor");
        Scanner ingresoEdad = new Scanner(System.in);
        int edadModificada = ingresoEdad.nextInt();
        p1.setEdad(edadModificada);
        return p1;
    }

    public void mostrarPersona(Persona p1){
        System.out.println("Nombre: " + p1.getNombre());
        System.out.println("Edad: " + p1.getEdad());
        System.out.println("Dni: " + p1.getDni());
        System.out.println("--------------------------");
    }

    public void recorrerLista(){

        for(int i = 0; i<listaDePersonas.size(); i++){
            mostrarPersona(listaDePersonas.get(i));
        }

    }

    public void recorrerMayoresLista(){

        for(int i = 0; i<listaDePersonas.size(); i++){

            if (listaDePersonas.get(i).getEdad() > 17) mostrarPersona(listaDePersonas.get(i));
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

                case 3:System.out.println("Ingrese dni de la persona a modificar");
                    Scanner ingreso6 = new Scanner(System.in);
                    int dniInput = ingreso6.nextInt();
                    sistema.modificarPersonasDelSistema(dniInput);
                    break;

                case 4:
                    sistema.recorrerMayoresLista();
                    break;

                case 5:
                    sistema.recorrerLista();
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

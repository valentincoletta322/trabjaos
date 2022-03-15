package com.company;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Producto> listaDeProductos = new ArrayList<>();

        boolean finalizarApp = false;

        int importeAPagar = 0;

        while (finalizarApp == true){
            System.out.println("Ingrese 1 para añadir un producto");
            System.out.println("Ingrese 2 para ver el importe");
            System.out.println("Ingrese 3 para finalizar un producto");
            int opcionDeMenu = 0;
            switch (opcionDeMenu){

                case 1:
                    Producto nuevoProducto = new Producto();
                    System.out.println("Ingrese el nombre del Producto");

                    Scanner ingreso1 = new Scanner(System.in);
                    String nombreProductoNuevo = ingreso1.nextLine();

                    Scanner ingreso2 = new Scanner(System.in);
                    float precioProductoNuevo = ingreso2.nextFloat();

                    nuevoProducto.setNombre(nombreProductoNuevo);
                    nuevoProducto.setPrecio(precioProductoNuevo);

                    listaDeProductos.add(nuevoProducto);
                    break;

                case 2:
                    //Producto recorridoDeProducto = new Producto();
                    for(int i = 0; i<listaDeProductos.size(); i++){
                        Producto recorridoDeProducto = listaDeProductos[i];
                        importeAPagar+= recorridoDeProducto.getPrecio();
                    }
                    System.out.println(importeAPagar);
                    break;

                case 3:
                        finalizarApp = true;
                    break;

                default:
                    System.out.println("Error, ingrese un numero válido");
                    break;

            }

            System.out.println(importeAPagar);

        }





    }


}

/*
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		variables primitivas
int a = 1;
    float c = 1.54f;

    Clases envolventes
    Integer b = 1;
    Float d = 1.54f;


    ArrayList

    ArrayList<Integer> nums = new ArrayList<>();
		nums.add(1);
                nums.add(5);

                int a = nums.get(0);
                nums.remove(0);

                ArrayList<Persona> personas = new ArrayList<>();

        Persona p1 = new Persona();

        ArrayList<ArrayList<Integer>> matriz = new ArrayList<>();


         documentación:
         https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html


        }
        } */
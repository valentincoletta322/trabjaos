package com.company;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Producto> listaDeProductos = new ArrayList<>();

        boolean finalizarApp = false;

        int importeAPagar = 0;

        while (finalizarApp == false){
            System.out.println("Ingrese 1 para añadir un producto");
            System.out.println("Ingrese 2 para ver el importe");
            System.out.println("Ingrese 3 para finalizar un producto");
            Scanner ingreso0 = new Scanner(System.in);
            int opcionDeMenu = ingreso0.nextInt();

            switch (opcionDeMenu){

                case 1:
                    Producto nuevoProducto = new Producto();
                    System.out.println("Ingrese el nombre del producto");

                    Scanner ingreso1 = new Scanner(System.in);
                    String nombreProductoNuevo = ingreso1.nextLine();

                    System.out.println("Ingrese el precio del producto");

                    Scanner ingreso2 = new Scanner(System.in);
                    float precioProductoNuevo = ingreso2.nextFloat();

                    nuevoProducto.setNombre(nombreProductoNuevo);
                    nuevoProducto.setPrecio(precioProductoNuevo);

                    listaDeProductos.add(nuevoProducto);
                    break;

                case 2:
                    //Producto recorridoDeProducto = new Producto();
                    for(int i = 0; i<listaDeProductos.size(); i++){
                        Producto recorridoDeProducto = listaDeProductos.get(i);
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



        }





    }


}

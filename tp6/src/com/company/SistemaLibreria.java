package com.company;

import org.omg.CORBA.INTERNAL;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class SistemaLibreria {
    private ArrayList<Cliente> arrayClientes = new ArrayList<>();
    private ArrayList<Libro> arrayLibrosEnVenta = new ArrayList<>();
    private ArrayList<Integer> arrayLibrosEnOferta = new ArrayList<>();
    private ArrayList<Libro> arrayLibrosVendidos = new ArrayList<>();
    private String nombre;

    public SistemaLibreria(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }

    public ArrayList<Cliente> retornarClientesFrecuentes (){
        ArrayList<Cliente> arrayClientesFrecuentes = new ArrayList<>();
        for(Cliente cliente : arrayClientes){
            if (cliente.getArrayLibrosComprados().size()>9) arrayClientesFrecuentes.add(cliente);
        }

        return arrayClientesFrecuentes;
    }

    public ArrayList<Integer> retornarEdadesClientesFrecuentes (){
        ArrayList<Cliente> arrayClientesFrecuentes = new ArrayList<>();
        for(Cliente cliente : arrayClientes){
            if (cliente.getArrayLibrosComprados().size()>9) arrayClientesFrecuentes.add(cliente);
        }
            ArrayList<Integer> arrayEdadesClientesFrecuentes = new ArrayList<>();
            for(Cliente cliente : arrayClientesFrecuentes){
                arrayEdadesClientesFrecuentes.add(cliente.getEdad());
            }
        return arrayEdadesClientesFrecuentes;
    }



    public void recorrerArrayClientes(Cliente unCliente, Libro unLibro){
        for (int i = 0; i<arrayClientes.size(); i++){
            if (arrayClientes.get(i).getId() == unCliente.getId()) {
                arrayClientes.get(i).añadirLibrosComprados(unLibro);
            }
            else {
                arrayClientes.add(unCliente);
                unCliente.añadirLibrosComprados(unLibro);
            }
        }
    }

    public ArrayList<Libro> calcularLibrosMasCaros(){
        ArrayList<Libro> librosMasCaros = new ArrayList<>();
        for (Libro unLibro : arrayLibrosEnVenta){
            if (unLibro.getPrecio()>5500) librosMasCaros.add(unLibro);
        }
        return librosMasCaros;
    }

    public void venderLibro(Cliente unCliente, Libro unLibro){
        arrayLibrosVendidos.add(unLibro);
        recorrerArrayClientes(unCliente, unLibro);
    }

    public ArrayList<Libro> empiezaCon(String unaLetra){
        ArrayList<Libro> arrayEmpiezaConEstaLetra = new ArrayList<>();
        for (Libro unLibro : arrayLibrosEnVenta) {
            if(unLibro.getNombre().startsWith(unaLetra)){
                arrayEmpiezaConEstaLetra.add(unLibro);
            }
        }
        return arrayEmpiezaConEstaLetra;
    }

    public static void main(String[] args){






    }







}

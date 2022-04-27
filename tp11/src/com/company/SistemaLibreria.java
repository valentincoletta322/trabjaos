package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class SistemaLibreria {
    private ArrayList<Cliente> arrayClientes;

    private HashSet<Cliente> hsClientes;
    private ArrayList<Libro> arrayLibrosEnVenta;
    private ArrayList<Integer> arrayLibrosEnOferta;
    private ArrayList<Libro> arrayLibrosVendidos;
    private String nombre;
    private HashSet<String> editorialesConDescuento;
    private HashMap<Cliente, Float> compras;

    public SistemaLibreria(String nuevoNombre) {
        this.nombre = nuevoNombre;
        this.arrayClientes = new ArrayList<>();
        this.hsClientes = new HashSet<>();
        this.arrayLibrosEnVenta = new ArrayList<>();
        this.arrayLibrosEnOferta = new ArrayList<>();
        this.arrayLibrosVendidos = new ArrayList<>();
        this.editorialesConDescuento = new HashSet<>();
        this.compras = new HashMap<>();
    }

    public HashMap<Cliente, Float> getCompras() {
        return compras;
    }

    public void agregarEditorialesDescuento(String editorial){

        this.editorialesConDescuento.add(editorial);
    }
    public ArrayList<Cliente> retornarClientesFrecuentes (){
        ArrayList<Cliente> arrayClientesFrecuentes = new ArrayList<>();
        for(Cliente cliente : arrayClientes){
            if (cliente.getArrayLibrosComprados().size()>9) arrayClientesFrecuentes.add(cliente);
        }

        return arrayClientesFrecuentes;
    }

    public ArrayList<Integer> retornarEdadesClientesFrecuentes (){

        ArrayList<Integer> arrayEdadesClientesFrecuentes = new ArrayList<>();
        for(Cliente cliente : retornarClientesFrecuentes()){
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

    SistemaLibreria sistema = new SistemaLibreria("Libreria");
    Cliente unCliente = new Cliente( 1, "JUAN", 35);
    unCliente.librosComprados(sistema);



    }







}
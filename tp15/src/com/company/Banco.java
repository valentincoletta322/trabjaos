package com.company;

import java.util.ArrayList;
import java.util.HashSet;

public class Banco {

    private String nombre;
    ArrayList<Cliente> clientes;

    public Banco(){
        this.nombre = "banco";
        this.clientes = new ArrayList<>();
    }

    public HashSet<Integer> cbusDeClientesVisitantes(){
        HashSet<Integer> cbus = new HashSet<>();

        for(Cliente unCliente : this.clientes){
            cbus.add(unCliente.getCbu());
        }

        return cbus;
    }

    public void imprimirCbusDeClientesVisitantes(){
        HashSet<Integer> cbus = cbusDeClientesVisitantes();
        for (Integer num : cbus){
            System.out.println(num);
        }

    }

}

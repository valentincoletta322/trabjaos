package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;


public class Main {

    public static void main(String[] args){
        ArrayList<Integer> listaDeNumeros = new ArrayList<>();

        System.out.println("Ingresar la cantidad de numeros");

        Scanner ingreso1 = new Scanner(System.in);
        int cantNumeros = ingreso1.nextInt();

        for(int i = 0; i<cantNumeros; i++){
            Scanner ingreso2 = new Scanner(System.in);
            listaDeNumeros.add(ingreso2.nextInt());
        }

        HashSet<Integer> hashSetNumeros = new HashSet<>();

        for (int num:listaDeNumeros) {
            hashSetNumeros.add(num);
        }


    }



}

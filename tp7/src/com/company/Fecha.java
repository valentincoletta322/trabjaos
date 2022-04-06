package com.company;

import java.util.Scanner;
import java.util.ArrayList;

public class Fecha {
    private int dia;
    private int mes;
    private int año;

    public Fecha(int dia, int mes, int año) {
        this.dia = 1;
        this.mes = 1;
        this.año = 1;

    }

    public int dias(int mes){

        if (mes == 1||mes == 3||mes == 5||mes == 7||mes == 8|mes == 10||mes == 12){
            return 31;
        }

        else if (mes == 2) return 28;

        else return 30;

    }

    public Fecha normalizar(Fecha unaFecha){
        while (unaFecha.getDia()>dias(unaFecha.getMes())){
            int cantDias = dias(unaFecha.getMes());
            if (cantDias==30){
                unaFecha.setDia(unaFecha.getDia()-29);
                unaFecha.setMes(unaFecha.getMes()+1);
            }

            else if (cantDias==31){
                unaFecha.setDia(unaFecha.getDia()-30);
                unaFecha.setMes(unaFecha.getMes()+1);
            }

            else if (cantDias==28){
                unaFecha.setDia(unaFecha.getDia()-27);
                unaFecha.setMes(unaFecha.getMes()+1);
            }
        }

        while(unaFecha.getMes()>12){
            unaFecha.setMes(unaFecha.getMes()-12);
            unaFecha.setAño(unaFecha.getAño()+1);
        }

        return unaFecha;
    }



    public Fecha cambiarUnaFecha (Fecha unaFecha){
        System.out.println("1 para cambiar dia, 2 para mes y 3 para año");
        Scanner ingreso1 = new Scanner(System.in);
        int opcion = ingreso1.nextInt();

        switch (opcion){

            case 1:
                Scanner ingreso2 = new Scanner(System.in);
                int unDia = ingreso2.nextInt();
                unaFecha.setDia(unDia);
                break;

            case 2:
                Scanner ingreso3 = new Scanner(System.in);
                int unMes = ingreso3.nextInt();
                unaFecha.setMes(unMes);
                break;

            case 3:
                Scanner ingreso4 = new Scanner(System.in);
                int unAño = ingreso4.nextInt();
                unaFecha.setAño(unAño);
                break;

        }

        unaFecha = normalizar(unaFecha);
        return unaFecha;
    }




    /*---------*/


    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }
    /*-----------------------------------*/
    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }
    /*-----------------------------------*/
    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
}

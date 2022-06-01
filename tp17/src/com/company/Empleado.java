package com.company;

import javax.lang.model.type.ArrayType;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;

public class Empleado {

    private String nombre;
    private String apellido;

    private int telefono;
    private LocalDate fechaDeNacimiento;
    private ArrayList<String> diasLaborales;
    private LocalTime ingreso;
    private LocalTime egreso;
    private ArrayList<LocalDateTime> ingresos;

    public Empleado() {
        this.nombre="jorge";
        this.apellido="deigamer :v ";
        this.fechaDeNacimiento = LocalDate.of(1999, 1,2);
        this.diasLaborales = new ArrayList<>();
        this.ingreso = LocalTime.of(9,0);
        this.egreso = LocalTime.of(17,0);
        this.ingresos = new ArrayList<>();
        this.telefono = 1234567;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public ArrayList<String> getDiasLaborales() {
        return diasLaborales;
    }

    public void setDiasLaborales(ArrayList<String> diasLaborales) {
        this.diasLaborales = diasLaborales;
    }

    public LocalTime getIngreso() {
        return ingreso;
    }

    public void setIngreso(LocalTime ingreso) {
        this.ingreso = ingreso;
    }

    public LocalTime getEgreso() {
        return egreso;
    }

    public void setEgreso(LocalTime egreso) {
        this.egreso = egreso;
    }

    public ArrayList<LocalDateTime> getIngresos() {
        return ingresos;
    }

    public void setIngresos(ArrayList<LocalDateTime> ingresos) {
        this.ingresos = ingresos;
    }

    public int asistenciaEnUnMes(int mes){
        int contador = 0;
        int dias = CANTIDAD_DE_DIAS(mes);
        for(LocalDateTime unaFecha : this.ingresos ){
            if (unaFecha.getMonthValue() == mes){
                contador++;
            }
        }

        return (contador*100)/dias;
    }

    public void mostrarDatos(){
        System.out.println("Nombre: "+nombre+" Telefono: "+telefono);
    }

    public static int CANTIDAD_DE_DIAS(int mes){
        if (mes == 1|| mes == 3|| mes == 5|| mes == 7|| mes == 8|| mes == 10|| mes == 12){
            return 27;
        }

        return 26;
    }

    public int haLlegadoTarde(){
        int cantidad = 0;
        for (LocalDateTime unIngreso : ingresos){
            if (unIngreso.getHour() == ingreso.getHour() && unIngreso.getMinute() >= ingreso.getMinute()+5 ){
                cantidad++;
            }

            else if (unIngreso.getHour()>ingreso.getHour()){
                cantidad++;
            }
        }

        return cantidad;
    }

}


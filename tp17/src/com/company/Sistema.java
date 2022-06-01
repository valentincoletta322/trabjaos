package com.company;

import java.util.ArrayList;
import java.util.HashSet;

public class Sistema {

    private HashSet<Empleado> empleados;

    public Sistema(){
        this.empleados = new HashSet<>();
    }

    public int cantidadDeEmpleados(){
        return this.empleados.size();
    }


    public void empleadosConAsistenciaCompleta(int mes){
        for (Empleado unEmpleado : this.empleados){
            if (unEmpleado.asistenciaEnUnMes(mes)==100) unEmpleado.mostrarDatos();
        }
    }

    public void empleadosConMenosDeCincuenta(int mes){
        for (Empleado unEmpleado : this.empleados){
            if (unEmpleado.asistenciaEnUnMes(mes)<50) unEmpleado.mostrarDatos();
        }
    }

    public void empleadosQueLlegaronTarde(){
        for (Empleado unEmpleado : this.empleados){
            if (unEmpleado.haLlegadoTarde()>0) unEmpleado.mostrarDatos();
        }
    }

    public ArrayList<Integer> cantidadDeEmpleadosPorDia(){
        ArrayList<Integer> semana = new ArrayList<>();
        for(int i = 0; i<6; i++) semana.add(0);

        for (Empleado unEmpleado : this.empleados){
            ArrayList<String> diasLaborales = unEmpleado.getDiasLaborales();
            for (int i = 0; i<empleados.size(); i++) {
                switch (diasLaborales.get(i)){
                    case "Lunes":semana.set(0,semana.get(0)+1);
                        break;
                    case "Martes":semana.set(1,semana.get(1)+1);
                        break;
                    case "Miercoles":semana.set(2,semana.get(2)+1);
                        break;
                    case "Jueves":semana.set(3,semana.get(3)+1);
                        break;
                    case "Viernes":semana.set(4,semana.get(4)+1);
                        break;
                    case "Sabado":semana.set(5,semana.get(5)+1);
                        break;
                }

            }
        }
        return semana;
    }

    public void datosEnFormaDeTabla(){
        ArrayList<Integer> semana = cantidadDeEmpleadosPorDia();

        System.out.println("| Lunes | Martes | Miercoles | Jueves | Viernes | Sabado |");
        System.out.println(" |  "+ semana.get(0)+"  |  "+ semana.get(1)+ "  |  "+ semana.get(2)+ "  |  "+ semana.get(3)+ "  |  "+ semana.get(4)+ "  |  "+ semana.get(5)+" |" );
    }

}

package ControlAsistencias;

import java.util.HashSet;

public class Empresa {
    private HashSet<Empleado> empleados;

    public Empresa(){
        empleados=new HashSet<>();
    }

    public HashSet<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(HashSet<Empleado> empleados) {
        this.empleados = empleados;
    }

    public int cantidadMayoresA80(int mes){
        int contador=0;
        for(Empleado empleado:empleados){
            if(empleado.porcentajeAsistencias(mes)>80){
                contador++;
            }
        }
        return contador;
    }
}

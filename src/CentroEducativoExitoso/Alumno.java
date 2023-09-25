package CentroEducativoExitoso;

import Humanos.Persona;

import java.util.HashMap;
import java.util.HashSet;

public class Alumno extends Persona {
    private HashSet<Examen> examenesRealizados;

    public Alumno(String nombre, String apellido, int dni, HashSet<Examen> examenesRealizados) {
        super(nombre, apellido, dni);
        this.examenesRealizados = examenesRealizados;
    }

    public HashSet<Examen> getExamenesRealizados() {
        return examenesRealizados;
    }

    public void setExamenesRealizados(HashSet<Examen> examenesRealizados) {
        this.examenesRealizados = examenesRealizados;
    }
    private Boolean aprobacionAlumno(){
        for(Examen examen:examenesRealizados){
            if(!examen.calcularAprobacion()){
                System.out.println("El examen realizado el dia "+examen.getFechaRealzacion().getDayOfMonth()+" del "+examen.getFechaRealzacion().getMonthValue()+" está desaprobado, por lo tanto... REPETÍS!!!!");
                return false;
            }
        }
        System.out.println("GG, APROBASTE TODO!");
        return true;
    }

}

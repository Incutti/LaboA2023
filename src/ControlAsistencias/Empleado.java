package ControlAsistencias;

import Enums.DiasHabiles;
import Humanos.Persona;
import tiempo.Fecha;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Empleado extends Persona {
    private HashSet<DiasHabiles> diasQueTrabaja;
    private HashSet<LocalDateTime> registro;

    public Empleado() {
        super();
        diasQueTrabaja=new HashSet<>();
        registro=new HashSet<>();
    }

    public Empleado(String nombre, String apellido, int dni, int edad, Fecha fechaNacimiento, String direccion, HashSet<DiasHabiles> diasQueTrabaja, HashSet<LocalDateTime> registro) {
        super(nombre, apellido, dni, edad, fechaNacimiento, direccion);
        this.diasQueTrabaja = diasQueTrabaja;
        this.registro = registro;
    }

    public HashSet<DiasHabiles> getDiasQueTrabaja() {
        return diasQueTrabaja;
    }

    public void setDiasQueTrabaja(HashSet<DiasHabiles> diasQueTrabaja) {
        this.diasQueTrabaja = diasQueTrabaja;
    }

    public HashSet<LocalDateTime> getRegistro() {
        return registro;
    }

    public void setRegistro(HashSet<LocalDateTime> registro) {
        this.registro = registro;
    }

    public double porcentajeAsistencias(int mesIndicado){
        int contador=0;
        double porcentaje;
        for(LocalDateTime dia:registro){
            if(dia.getMonthValue()==mesIndicado){
                contador++;
            }
        }
        porcentaje=(contador*100)/(diasQueTrabaja.size()*4);
        return porcentaje;
    }


}

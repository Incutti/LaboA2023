package ControlAlturaPeso;

import Humanos.Persona;
import tiempo.Fecha;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Paciente extends Persona {

    HashMap<LocalDate,Double> registroAltura;
    HashMap<LocalDate,Double> registroPeso;

    public Paciente(){
        super();
        registroAltura=new HashMap<>();
        registroPeso=new HashMap<>();
    }

    public Paciente(String nombre, String apellido, int dni, int edad, Fecha fechaNacimiento, String direccion, HashMap<LocalDate, Double> registroAltura, HashMap<LocalDate, Double> registroPeso) {
        super(nombre, apellido, dni, edad, fechaNacimiento, direccion);
        this.registroAltura = registroAltura;
        this.registroPeso = registroPeso;
    }

    public HashMap<LocalDate, Double> getRegistroAltura() {
        return registroAltura;
    }

    public void setRegistroAltura(HashMap<LocalDate, Double> registroAltura) {
        this.registroAltura = registroAltura;
    }

    public HashMap<LocalDate, Double> getRegistroPeso() {
        return registroPeso;
    }

    public void setRegistroPeso(HashMap<LocalDate, Double> registroPeso) {
        this.registroPeso = registroPeso;
    }

    public void conocerPesoAltura(LocalDate fecha){
        System.out.println("El dia " + fecha + " pesaba " + registroPeso.get(fecha) + "kg y media " + registroAltura.get(fecha) + "cm");
    }
    public double promedioPeso(int anio){
        int contador=0;
        double sumatoriaPeso=0;
        for(Map.Entry<LocalDate, Double> peso:registroPeso.entrySet()){
            if(peso.getKey().getYear()==anio){
                contador++;
                sumatoriaPeso+=peso.getValue();
            }
        }
        return sumatoriaPeso/contador;
    }

    public double promedioAltura(int anio){
        int contador=0;
        double sumatoriaAltura=0;
        for(Map.Entry<LocalDate, Double> altura:registroAltura.entrySet()){
            if(altura.getKey().getYear()==anio){
                contador++;
                sumatoriaAltura+=altura.getValue();
            }
        }
        return sumatoriaAltura/contador;
    }

    public double diferenciaAltura(int anioMenor, int anioMayor){
        double diferencia;
        double alturaMenor=0, alturaMayor=0;
        LocalDate fechaMenor=null, fechaMayor=null; // cuando el profe venga le pregunto en que inicializarlo para que no de error
        for(Map.Entry<LocalDate, Double> altura:registroAltura.entrySet()){
            if(fechaMenor==null || (altura.getKey().getYear()==anioMenor) && (altura.getKey().compareTo(fechaMenor) == 1)){
                fechaMenor=altura.getKey();
                alturaMenor=altura.getValue();
            }
        }
        for(Map.Entry<LocalDate, Double> altura:registroAltura.entrySet()){
            if(fechaMayor==null || (altura.getKey().getYear()==anioMayor) && (altura.getKey().compareTo(fechaMayor) == 1)){
                fechaMayor=altura.getKey();
                alturaMayor=altura.getValue();
            }
        }
        return alturaMayor-alturaMenor;
    }
}

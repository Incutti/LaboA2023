package organizacionPartidoPolitico;

import Humanos.Persona;
import tiempo.Fecha;

import java.time.LocalDate;
import java.time.LocalTime;

public class Trabajador extends Persona implements Mensajeria{
    private int numeroCuil;
    private double sueldo;
    private String direccionResidencia;
    private LocalTime horaEntrada;
    private LocalTime horaSalida;


    public Trabajador(String nombre, String apellido, int dni, Fecha fechaNacimiento, int numeroCuil, double sueldo, String direccionResidencia, LocalTime horaEntrada, LocalTime horaSalida) {
        super(nombre, apellido, dni, fechaNacimiento);
        this.numeroCuil = numeroCuil;
        this.sueldo = sueldo;
        this.direccionResidencia = direccionResidencia;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
    }

    public int getNumeroCuil() {
        return numeroCuil;
    }

    public void setNumeroCuil(int numeroCuil) {
        this.numeroCuil = numeroCuil;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getDireccionResidencia() {
        return direccionResidencia;
    }

    public void setDireccionResidencia(String direccionResidencia) {
        this.direccionResidencia = direccionResidencia;
    }

    public LocalTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public LocalTime getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(LocalTime horaSalida) {
        this.horaSalida = horaSalida;
    }

    @Override
    public void mensajeApoyo(PartidoPolitico partido) {
        if(LocalTime.now().isAfter(horaEntrada) && LocalTime.now().isBefore(horaSalida) && LocalDate.now().getDayOfWeek().getValue()>=1 && LocalDate.now().getDayOfWeek().getValue()<=5){
            System.out.println("Yo, "+ super.getNombre()+" te invito a que votes a "+partido.getNombre());
        } else {
            System.out.println("No me toca laburar hoy flaquito");
        }
    }
}

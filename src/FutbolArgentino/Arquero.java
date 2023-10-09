package FutbolArgentino;

import PASO.Provincia;
import tiempo.Fecha;

import java.util.HashSet;

public class Arquero extends JugadorFutbol {
    private double porcentajeAtajadas;
    private int golesRecibidos;
    private int atajadas;
    private int tirosHistoricos;


    public Arquero(String nombre, Fecha fechaNacimiento, Provincia provinciaProcedencia, HashSet<Equipo> historialEquipos, int numCamiseta, int tirosHistoricos, Equipo equipoActual,int cantPartidos, int atajadas) {
        super(nombre, fechaNacimiento, provinciaProcedencia, historialEquipos, numCamiseta,equipoActual,cantPartidos);
        this.atajadas=atajadas;
        this.tirosHistoricos=tirosHistoricos;
        this.golesRecibidos = tirosHistoricos-atajadas;
        porcentajeAtajadas= (double) (tirosHistoricos * atajadas) /100;
    }

    public double getPorcentajeAtajadas() {
        return porcentajeAtajadas;
    }

    public void setPorcentajeAtajadas(double porcentajeAtajadas) {
        this.porcentajeAtajadas = porcentajeAtajadas;
    }

    public int getGolesRecibidos() {
        return golesRecibidos;
    }

    public void setGolesRecibidos(int golesRecibidos) {
        this.golesRecibidos = golesRecibidos;
    }

    public int getAtajadas() {
        return atajadas;
    }

    public void setAtajadas(int atajadas) {
        this.atajadas = atajadas;
    }

    public int getTirosHistoricos() {
        return tirosHistoricos;
    }

    public void setTirosHistoricos(int tirosHistoricos) {
        this.tirosHistoricos = tirosHistoricos;
    }

    @Override
    public void contratar(Equipo equipo) {
        try {
            verificarPasado(equipo);
            if(!verificarPosibilidadContratacion()) throw new ArqueroIneficienteException();
            ejecutarPase(equipo);
            System.out.println("fichaje por "+equipo.getNombre());
        } catch (YaJugoException | ArqueroIneficienteException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public boolean verificarPosibilidadContratacion() {
        return (porcentajeAtajadas>0.6 && golesRecibidos<10);
    }


}

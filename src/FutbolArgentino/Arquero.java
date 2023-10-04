package FutbolArgentino;

import PASO.Provincia;
import tiempo.Fecha;

import java.util.HashSet;

public class Arquero extends JugadorFutbol {
    private double porcentajeAtajadas;
    private int golesRecibidos;

    public Arquero(String nombre, Fecha fechaNacimiento, Provincia provinciaProcedencia, HashSet<Equipo> historialEquipos, int numCamiseta, double porcentajeAtajadas, int golesRecibidos, Equipo equipoActual) {
        super(nombre, fechaNacimiento, provinciaProcedencia, historialEquipos, numCamiseta,equipoActual);
        this.porcentajeAtajadas = porcentajeAtajadas;
        this.golesRecibidos = golesRecibidos;
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

    @Override
    public void contratar(Equipo equipo) {
        try {
            verificarPasado(equipo);
            if(!verificarPosibilidadContratacion()) throw new ArqueroIneficienteException();
            ejecutarPase(equipo);
        } catch (YaJugoException | ArqueroIneficienteException e) {
            e.getMessage();
        }
    }

    @Override
    public boolean verificarPosibilidadContratacion() {
        return (porcentajeAtajadas>60 && golesRecibidos<10);
    }


}

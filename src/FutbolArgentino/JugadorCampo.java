package FutbolArgentino;

import PASO.Provincia;
import tiempo.Fecha;

import java.util.HashSet;

public class JugadorCampo extends JugadorFutbol {
    private double porcentajeGolesConvertidos;
    private int cantGoles;
    private int cantAsistencias;

    public JugadorCampo(String nombre, Fecha fechaNacimiento, Provincia provinciaProcedencia, HashSet<Equipo> historialEquipos, int numCamiseta, double porcentajeGolesConvertidos, int cantAsistencias, Equipo equipoActual, int cantPartidos, int cantGoles) {
        super(nombre, fechaNacimiento, provinciaProcedencia, historialEquipos, numCamiseta,equipoActual,cantPartidos);
        this.porcentajeGolesConvertidos = porcentajeGolesConvertidos;
        this.cantAsistencias = cantAsistencias;
        this.cantGoles=cantGoles;
    }

    public double getPorcentajeGolesConvertidos() {
        return porcentajeGolesConvertidos;
    }

    public void setPorcentajeGolesConvertidos(double porcentajeGolesConvertidos) {
        this.porcentajeGolesConvertidos = porcentajeGolesConvertidos;
    }

    public int getCantAsistencias() {
        return cantAsistencias;
    }

    public void setCantAsistencias(int cantAsistencias) {
        this.cantAsistencias = cantAsistencias;
    }

    public int getCantGoles() {
        return cantGoles;
    }

    public void setCantGoles(int cantGoles) {
        this.cantGoles = cantGoles;
    }

    public void actualizarPorcentaje(){
        porcentajeGolesConvertidos=((double) (cantGoles * super.getCantPartidos()) /100);
    }

    @Override
    public void contratar(Equipo equipo) {
        try {
            verificarPasado(equipo);
            if(!verificarPosibilidadContratacion()) throw new JugadorCampoIneficienteException();
            ejecutarPase(equipo);
        } catch (YaJugoException | JugadorCampoIneficienteException e) {
            e.getMessage();
        }
    }

    @Override
    public boolean verificarPosibilidadContratacion() {
        return (porcentajeGolesConvertidos>30 && cantAsistencias>10);
    }
}

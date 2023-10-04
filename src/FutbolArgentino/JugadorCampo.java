package FutbolArgentino;

import PASO.Provincia;
import tiempo.Fecha;

import java.util.HashSet;

public class JugadorCampo extends JugadorFutbol {
    private double porcentajeGolesConvertidos;
    private int cantAsistencias;

    public JugadorCampo(String nombre, Fecha fechaNacimiento, Provincia provinciaProcedencia, HashSet<Equipo> historialEquipos, int numCamiseta, double porcentajeGolesConvertidos, int cantAsistencias, Equipo equipoActual) {
        super(nombre, fechaNacimiento, provinciaProcedencia, historialEquipos, numCamiseta,equipoActual);
        this.porcentajeGolesConvertidos = porcentajeGolesConvertidos;
        this.cantAsistencias = cantAsistencias;
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

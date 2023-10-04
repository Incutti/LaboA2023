package FutbolArgentino;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Partido {
    private Equipo equipoLocal;
    private Equipo equipoVisitante;
    private LocalDateTime fechaPartido;
    private ArrayList<Gol>golesEquipoLocal;
    private ArrayList<Gol>golesEquipoVisitante;
    private int cantTirosAPuerta;

    public Partido(Equipo equipoLocal, Equipo equipoVisitante, LocalDateTime fechaPartido, ArrayList<Gol> golesEquipoLocal, ArrayList<Gol> golesEquipoVisitante, int cantTirosAPuerta) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.fechaPartido = fechaPartido;
        this.golesEquipoLocal = golesEquipoLocal;
        this.golesEquipoVisitante = golesEquipoVisitante;
        this.cantTirosAPuerta = cantTirosAPuerta;
    }

    public Equipo getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(Equipo equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public Equipo getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(Equipo equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public LocalDateTime getFechaPartido() {
        return fechaPartido;
    }

    public void setFechaPartido(LocalDateTime fechaPartido) {
        this.fechaPartido = fechaPartido;
    }

    public ArrayList<Gol> getGolesEquipoLocal() {
        return golesEquipoLocal;
    }

    public void setGolesEquipoLocal(ArrayList<Gol> golesEquipoLocal) {
        this.golesEquipoLocal = golesEquipoLocal;
    }

    public ArrayList<Gol> getGolesEquipoVisitante() {
        return golesEquipoVisitante;
    }

    public void setGolesEquipoVisitante(ArrayList<Gol> golesEquipoVisitante) {
        this.golesEquipoVisitante = golesEquipoVisitante;
    }

    public int getCantTirosAPuerta() {
        return cantTirosAPuerta;
    }

    public void setCantTirosAPuerta(int cantTirosAPuerta) {
        this.cantTirosAPuerta = cantTirosAPuerta;
    }
}

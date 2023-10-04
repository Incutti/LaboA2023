package FutbolArgentino;

import Humanos.Persona;

import PASO.Provincia;
import tiempo.Fecha;

import java.util.HashSet;

public abstract class JugadorFutbol extends Persona implements Contrato{
    private Provincia provinciaProcedencia;
    private HashSet<Equipo> historialEquipos;
    private int numCamiseta;
    private Equipo equipoActual;

    public JugadorFutbol(){
        super();
        provinciaProcedencia=Provincia.CHACO;
        historialEquipos=new HashSet<>();
        numCamiseta=99;
        equipoActual=new Equipo();
    }

    public JugadorFutbol(String nombre, Fecha fechaNacimiento, Provincia provinciaProcedencia, HashSet<Equipo> historialEquipos, int numCamiseta, Equipo equipoActual) {
        super(nombre, fechaNacimiento);
        this.provinciaProcedencia = provinciaProcedencia;
        this.historialEquipos = historialEquipos;
        this.numCamiseta = numCamiseta;
        this.equipoActual=equipoActual;
    }

    public Provincia getProvinciaProcedencia() {
        return provinciaProcedencia;
    }

    public void setProvinciaProcedencia(Provincia provinciaProcedencia) {
        this.provinciaProcedencia = provinciaProcedencia;
    }

    public HashSet<Equipo> getHistorialEquipos() {
        return historialEquipos;
    }

    public void setHistorialEquipos(HashSet<Equipo> historialEquipos) {
        this.historialEquipos = historialEquipos;
    }

    public int getNumCamiseta() {
        return numCamiseta;
    }

    public void setNumCamiseta(int numCamiseta) {
        this.numCamiseta = numCamiseta;
    }

    public Equipo getEquipoActual() {
        return equipoActual;
    }

    public void setEquipoActual(Equipo equipoActual) {
        this.equipoActual = equipoActual;
    }

    public void verificarPasado(Equipo equipo) throws YaJugoException{
        if(historialEquipos.contains(equipo)) throw new YaJugoException();
    }
    public void ejecutarPase(Equipo equipo){
        historialEquipos.add(equipo);
        equipoActual=equipo;
        equipo.getJugadores().add(this);
    }

    @Override
    public void renovar() {
        try {
            verificarPosibilidadRenovacion();
            System.out.println("El " + toString() + " renovó con el club.");
        } catch (MuyViejoExeption e) {
            e.getMessage();
        }
    }

    @Override
    public void verificarPosibilidadRenovacion() throws MuyViejoExeption {
        if(super.getEdad()>35)throw new MuyViejoExeption();
    }

    @Override
    public String toString() {
        return "JugadorFutbol{" +
                "provinciaProcedencia=" + provinciaProcedencia +
                ", historialEquipos=" + historialEquipos +
                ", numCamiseta=" + numCamiseta +
                ", equipoActual=" + equipoActual.getNombre() +
                '}';
    }
}

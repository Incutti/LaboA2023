package P.A.S.O;

import Humanos.Persona;
import tiempo.Fecha;

import java.util.HashMap;
import java.util.HashSet;

public class Candidato extends Persona {
    private NombrePartido nombrePartido;
    private HashMap<String, HashSet<String>> listaPropuestas;
    private HashMap<String, Integer> votosPorProvincia;

    public Candidato() {
        super();
        nombrePartido=NombrePartido.EL_POLI_AVANZA;
        listaPropuestas=new HashMap<>();
        votosPorProvincia=new HashMap<>();
    }

    public Candidato(String nombre, String apellido, int dni, Fecha fechaNacimiento, NombrePartido nombrePartido, HashMap<String, HashSet<String>> listaPropuestas, HashMap<String, Integer> votosPorProvincia) {
        super(nombre, apellido, dni, fechaNacimiento);
        this.nombrePartido = nombrePartido;
        this.listaPropuestas = listaPropuestas;
        this.votosPorProvincia = votosPorProvincia;
    }

    public NombrePartido getNombrePartido() {
        return nombrePartido;
    }

    public void setNombrePartido(NombrePartido nombrePartido) {
        this.nombrePartido = nombrePartido;
    }

    public HashMap<String, HashSet<String>> getListaPropuestas() {
        return listaPropuestas;
    }

    public void setListaPropuestas(HashMap<String, HashSet<String>> listaPropuestas) {
        this.listaPropuestas = listaPropuestas;
    }

    public HashMap<String, Integer> getVotosPorProvincia() {
        return votosPorProvincia;
    }

    public void setVotosPorProvincia(HashMap<String, Integer> votosPorProvincia) {
        this.votosPorProvincia = votosPorProvincia;
    }
}

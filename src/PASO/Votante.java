package PASO;

import Humanos.Persona;
import tiempo.Fecha;

import static PASO.Provincia.CABA;

public class Votante extends Persona {
    private boolean yaVoto;
    private static String nacionalidad="argentino";
    private Provincia provinciaOrigen;

    public Votante() {
        super();
        yaVoto=false;
        provinciaOrigen=CABA;
    }

    public Votante(String nombre, String apellido, int dni, Fecha fechaNacimiento, boolean yaVoto, Provincia provinciaOrigen) {
        super(nombre, apellido, dni, fechaNacimiento);
        this.yaVoto = yaVoto;
        this.provinciaOrigen = provinciaOrigen;
    }
    public Votante(Provincia provincia){
        super();
        yaVoto=false;
        this.provinciaOrigen=provincia;
    }

    public boolean isYaVoto() {
        return yaVoto;
    }

    public void setYaVoto(boolean yaVoto) {
        this.yaVoto = yaVoto;
    }

    public static String getNacionalidad() {
        return nacionalidad;
    }

    public static void setNacionalidad(String nacionalidad) {
        Votante.nacionalidad = nacionalidad;
    }

    public Provincia getProvinciaOrigen() {
        return provinciaOrigen;
    }

    public void setProvinciaOrigen(Provincia provinciaOrigen) {
        this.provinciaOrigen = provinciaOrigen;
    }
    public void votar (Candidato candidato){
        if(!(isYaVoto())){
            setYaVoto(true);
            candidato.votar(provinciaOrigen);
        }
    }
}

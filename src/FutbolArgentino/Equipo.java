package FutbolArgentino;

import java.util.HashSet;

public class Equipo {

    private String nombre;
    private HashSet<JugadorFutbol> jugadores;

    public Equipo() {
        nombre = "Burrones";
        jugadores = new HashSet<>();
    }
    public Equipo(String nombre, HashSet<JugadorFutbol> jugadores) {
        this.nombre = nombre;
        this.jugadores = jugadores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashSet<JugadorFutbol> getJugadores() {
        return jugadores;
    }

    public void setJugadores(HashSet<JugadorFutbol> jugadores) {
        this.jugadores = jugadores;
    }
}

package Biblioteca;

import Humanos.Persona;
import tiempo.Fecha;

import java.util.HashSet;

public class Autor extends Persona {
    private HashSet<Libro> bibliografia;

    public Autor(){
        super();
        bibliografia=new HashSet<>();
    }

    public Autor(String nombre, String apellido, int dni, Fecha fechaNacimiento, HashSet<Libro> bibliografia) {
        super(nombre, apellido, dni, fechaNacimiento);
        this.bibliografia = bibliografia;
    }

    public HashSet<Libro> getBibliografia() {
        return bibliografia;
    }

    public void setBibliografia(HashSet<Libro> bibliografia) {
        this.bibliografia = bibliografia;
    }
}

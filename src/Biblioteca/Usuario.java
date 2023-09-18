package Biblioteca;

import Humanos.Persona;
import tiempo.Fecha;

import java.util.HashSet;

public class Usuario extends Persona {
    private String mail;
    private HashSet<Libro> librosPrestados;
    private Membresia tipoMiembro;



    public Usuario(String nombre, String apellido, int dni, Fecha fechaNacimiento, String mail, HashSet<Libro> librosPrestados, Membresia tipoMiembro) {
        super(nombre, apellido, dni, fechaNacimiento);
        this.mail = mail;
        this.librosPrestados = librosPrestados;
        this.tipoMiembro = tipoMiembro;
    }

    public Usuario(){
        super();
        mail="panchoFdez@gmail.com";
        librosPrestados=new HashSet<>();
        tipoMiembro=Membresia.BRONCE;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public HashSet<Libro> getLibrosPrestados() {
        return librosPrestados;
    }

    public void setLibrosPrestados(HashSet<Libro> librosPrestados) {
        this.librosPrestados = librosPrestados;
    }

    public Membresia getTipoMiembro() {
        return tipoMiembro;
    }

    public void setTipoMiembro(Membresia tipoMiembro) {
        this.tipoMiembro = tipoMiembro;
    }
}

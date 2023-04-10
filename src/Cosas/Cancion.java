package Cosas;

import Humanos.Persona;

public class Cancion {
    private String titulo;
    private Persona autor;
    private float duracion;
    private String genero;

    public Cancion(String titulo, Persona autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public Cancion() {
        titulo = "";
        autor = new Persona("");
        duracion = 123;
        genero = "country";
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Persona getAutor() {
        return autor;
    }

    public void setAutor(Persona autor) {
        this.autor = autor;
    }

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}

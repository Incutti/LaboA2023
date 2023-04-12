package Cosas;

import Humanos.Persona;
import tiempo.*;

public class Libro {
    private String titulo;
    private Persona autor;
    private int isbn;
    private int cantPaginas;
    private String editorial;
    private Fecha fechaPublicacion;

    public Libro() {
        titulo = "Aventuras por los campos";
        autor = new Persona();
        isbn = 342387635;
        cantPaginas = 395;
        editorial = "AdiWillSchreiben";
        fechaPublicacion = new Fecha();
    }

    public Libro(String titulo, int cantPaginas) {
        this.titulo = titulo;
        autor = new Persona();
        isbn = 111111;
        this.cantPaginas = cantPaginas;

    }

    public Libro(String titulo, Persona autor, int isbn, int cantPaginas, String editorial, Fecha fechaPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.cantPaginas = cantPaginas;
        this.editorial = editorial;
        this.fechaPublicacion = fechaPublicacion;
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

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getCantPaginas() {
        return cantPaginas;
    }

    public void setCantPaginas(int cantPaginas) {
        this.cantPaginas = cantPaginas;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public Fecha getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(Fecha fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public void mostrarInfo(){
        System.out.println("El libro se llama " + titulo + " y es de la editorial " + editorial);
        System.out.print("El libro fue escrito por ");
        autor.impresionDeHumanos();
        System.out.println("EL ISBN es: " + isbn);
        System.out.println("Tiene " + cantPaginas + " Paginas");
        System.out.print("Fue escrito el ");
        fechaPublicacion.corta();
    }

    public void libroAnterior(Libro libro1){
        this.fechaPublicacion.menorQue(libro1.getFechaPublicacion());
    }
}

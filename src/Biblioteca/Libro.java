package Biblioteca;

public class Libro {
    private String titulo;
    private Autor autor;
    private Genero genero;
    private String nombreArchivoPDF;
    private int descargasActuales;
    private static int desargasDisponibles=5;

    public Libro(String titulo, Autor autor, Genero genero, String nombreArchivoPDF, int descargasActuales) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.nombreArchivoPDF = nombreArchivoPDF;
        this.descargasActuales=descargasActuales;
    }

    public Libro(){
        titulo="Ardillas";
        autor=new Autor();
        genero=Genero.AVENTURA;
        nombreArchivoPDF="ardillas.pdf";
        descargasActuales=0;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public String getNombreArchivoPDF() {
        return nombreArchivoPDF;
    }

    public void setNombreArchivoPDF(String nombreArchivoPDF) {
        this.nombreArchivoPDF = nombreArchivoPDF;
    }

    public static int getDesargasDisponibles() {
        return desargasDisponibles;
    }

    public static void setDesargasDisponibles(int desargasDisponibles) {
        Libro.desargasDisponibles = desargasDisponibles;
    }

    public int getDescargasActuales() {
        return descargasActuales;
    }

    public void setDescargasActuales(int descargasActuales) {
        this.descargasActuales = descargasActuales;
    }
}

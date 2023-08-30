package CarteleraCine;

public class Pelicula {
    private String titulo;
    private int duracion;
    private Genero genero;
    private static int contador=0;
    private int id;

    public Pelicula(String titulo, int duracion, Genero genero) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.genero = genero;
        contador+=1;
        id=contador;
    }

    public Pelicula() {
        titulo="El Pajaro Veloz";
        duracion=110;
        genero=Genero.AVENTURA;
        contador+=1;
        id=contador;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Pelicula.contador = contador;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int cantidadPeliculasExistentes(){return contador;}

    public String imprimirPelicula() {
        return titulo;
    }
}

package ABMMascotas;

public abstract class Animal {
    private String nombre;
    private Duenio duenio;
    private int alegria;

    public Animal(String nombre,int alegria, Duenio duenio) {
        this.nombre = nombre; 
        this.duenio=duenio;
        this.alegria=alegria;
    }
    public Animal(String nombre, Duenio duenio){
        this.nombre = nombre;
        this.duenio=duenio;
        alegria=1;
    }
    public Animal() {
        nombre = "Juanito";
        duenio= new Duenio();
        alegria=1;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Duenio getDuenio() {
        return duenio;
    }

    public void setDuenio(Duenio duenio) {
        this.duenio = duenio;
    }

    public int getAlegria() {
        return alegria;
    }

    public void setAlegria(int alegria) {
        this.alegria = alegria;
    }

    public abstract String saludo();
    public abstract void alimentar();
    public abstract String tipo();
}

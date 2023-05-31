package Cosas;

public class Plato {
    private String nombre;
    private double precio;

    private int calorias;

    public Plato(){
        nombre="Ceviche";
        precio=9000;
        calorias=6574;
    }

    public Plato(String nombre, double precio, int calorias){
        this.nombre=nombre;
        this.precio=precio;
        this.calorias=calorias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }
}

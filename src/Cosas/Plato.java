package Cosas;

public class Plato {
    private String nombre;
    private double precio;


    public Plato(){
        nombre="Ceviche";
        precio=9000;
    }

    public Plato(String nombre, double precio){
        this.nombre=nombre;
        this.precio=precio;
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
}

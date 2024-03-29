package EjercicioRepaso1;

public abstract class Producto {
    private String nombre;
    private double precio;
    private int stock;

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock(){
        return stock;
    }
    public void setStock(int stock){
        this.stock=stock;
    }

    public Producto(){
        nombre="nombre1";
        precio=100;
        stock=4;
    }

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
}

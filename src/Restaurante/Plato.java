package Restaurante;

public class Plato {
    private String nombre;
    private String descripcion;
    private int precio;
    private Tipo tipo;
    private Chef chefACargo;

    public Plato(String nombre, String descripcion, int precio, Tipo tipo, Chef chefACargo) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.tipo = tipo;
        this.chefACargo=chefACargo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Chef getChefACargo() {
        return chefACargo;
    }

    public void setChefACargo(Chef chefACargo) {
        this.chefACargo = chefACargo;
    }
}

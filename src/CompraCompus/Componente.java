package CompraCompus;

public class Componente {
    private String nombreFabricante;
    private String modelo;
    private float precioVenta;
    private int porcentajePais;
    private int stock;

    public Componente(){
        nombreFabricante="Nisuta";
        modelo="AJK32";
        precioVenta=1000+(1000/100)*porcentajePais;
        porcentajePais=10;
        stock=65;
    }
    public Componente(String nombreFabricante, String modelo, float precioVenta, int porcentajePais, int stock) {
        this.nombreFabricante = nombreFabricante;
        this.modelo = modelo;
        this.precioVenta = precioVenta+(precioVenta/100)*porcentajePais;
        this.porcentajePais=porcentajePais;
        this.stock=stock;
    }

    public String getNombreFabricante() {
        return nombreFabricante;
    }

    public void setNombreFabricante(String nombreFabricante) {
        this.nombreFabricante = nombreFabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(float precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getPorcentajePais() {
        return porcentajePais;
    }

    public void setPorcentajePais(int porcentajePais) {
        this.porcentajePais = porcentajePais;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}

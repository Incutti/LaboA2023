package CompraCompus;

import java.util.ArrayList;

public class Sistema {
    private ArrayList<Orden> computadorasVendidas;
    private ArrayList<Componente> stock;


    public Sistema(){
        computadorasVendidas=new ArrayList<Orden>();
        stock=new ArrayList<Componente>();
    }

    public Sistema(ArrayList<Orden> computadorasVendidas, ArrayList<Componente> stock) {
        this.computadorasVendidas = computadorasVendidas;
        this.stock = stock;
    }

    public ArrayList<Orden> getComputadorasVendidas() {
        return computadorasVendidas;
    }

    public void setComputadorasVendidas(ArrayList<Orden> computadorasVendidas) {
        this.computadorasVendidas = computadorasVendidas;
    }

    public ArrayList<Componente> getStock() {
        return stock;
    }

    public void setStock(ArrayList<Componente> stock) {
        this.stock = stock;
    }
    public void agregarOrden(Orden orden){computadorasVendidas.add(orden);}
    public void eliminarOrden(Orden orden){computadorasVendidas.remove(orden);}

}

package CompraCompus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Sistema {
    private ArrayList<Orden> computadorasVendidas;
    private HashSet<Componente> stock;

    public ArrayList<Orden> getComputadorasVendidas() {
        return computadorasVendidas;
    }

    public void setComputadorasVendidas(ArrayList<Orden> computadorasVendidas) {
        this.computadorasVendidas = computadorasVendidas;
    }

    public Sistema() {
        computadorasVendidas=new ArrayList<>();
        stock=new HashSet<>();
    }

    public Sistema(ArrayList<Orden>computadorasVendidas, HashSet<Componente>stock) {
        this.computadorasVendidas=computadorasVendidas;
        this.stock=stock;
    }

    public HashSet<Componente> getStock() {
        return stock;
    }

    public void setStock(HashSet<Componente> stock) {
        this.stock = stock;
    }

    public void agregarOrden(Orden orden){computadorasVendidas.add(orden);}
    public void eliminarOrden(Orden orden){computadorasVendidas.remove(orden);}

}

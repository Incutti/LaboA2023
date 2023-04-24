package CompraCompus;

import java.util.ArrayList;

public class Sistema {
    private ArrayList<Orden> ordenes;
    private ArrayList<Componente> stock;


    public Sistema(){
        ordenes=new ArrayList<Orden>();
        stock=new ArrayList<Componente>();
    }

    public Sistema(ArrayList<Orden> ordenes, ArrayList<Componente> stock) {
        this.ordenes = ordenes;
        this.stock = stock;
    }

    public ArrayList<Orden> getOrdenes() {
        return ordenes;
    }

    public void setOrdenes(ArrayList<Orden> ordenes) {
        this.ordenes = ordenes;
    }

    public ArrayList<Componente> getStock() {
        return stock;
    }

    public void setStock(ArrayList<Componente> stock) {
        this.stock = stock;
    }
    public void agregarOrden(Orden orden){ordenes.add(orden);}
    public void eliminarOrden(Orden orden){ordenes.remove(orden);}

}

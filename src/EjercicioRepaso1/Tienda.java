package EjercicioRepaso1;

import java.util.ArrayList;

public class Tienda {
    private ArrayList<Producto>listaProductos;

    public ArrayList<Producto> getListaProductos(){
        return listaProductos;
    }
    public void setListaProductos(ArrayList<Producto>listaProdcutos){
        this.listaProductos = listaProductos;
    }

    public Tienda(){
        listaProductos=new ArrayList<Producto>();
    }

    public Tienda(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public void agregarProducto(Producto producto){
        listaProductos.add(producto);
    }
    public void eliminarProducto(Producto producto){
        listaProductos.remove(producto);
    }
    public void modificarProducto(int posicion, Producto productoAntiguo, Producto productoNuevo){
        /*listaProductos.remove(productoAntiguo);
        listaProductos.add(productoNuevo);*/
        listaProductos.set(posicion, productoNuevo);
        // las dos formas sirven
    }
    public void mayorYMenorStock(){
        int mayor=0, menor= listaProductos.get(0).getStock();
        Producto productoMayor = null, productoMenor = null;

        for(Producto producto:listaProductos){
            if(producto.getStock()>mayor){
                mayor= producto.getStock();
                productoMayor=producto;
            } else if(producto.getStock()<menor){
                menor=producto.getStock();
                productoMenor=producto;
            }
        }
        System.out.println("El producto con mayor stock es " + productoMayor.getNombre() + " y el de menor stock es " + productoMenor.getNombre());
    }
}

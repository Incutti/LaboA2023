package Cosas;
import java.util.ArrayList;
import java.util.Scanner;


public class Menu {
    private ArrayList<Plato> listaPlatos ;
    private ArrayList<Pedido> listaPedidos;
    private ArrayList<Pedido> platosACocinar;

    public Menu(){
        listaPlatos=new ArrayList<Plato>();
        listaPedidos=new ArrayList<Pedido>();
        platosACocinar=new ArrayList<Pedido>();
    }

    public ArrayList<Plato> getListaPlatos() {
        return listaPlatos;
    }

    public void setListaPlatos(ArrayList<Plato> listaPlatos) {
        this.listaPlatos = listaPlatos;
    }

    public ArrayList<Pedido> getListaPedidos() {
        return listaPedidos;
    }

    public void setListaPedidos(ArrayList<Pedido> listaPedidos) {
        this.listaPedidos = listaPedidos;
    }

    public ArrayList<Pedido> getPlatosACocinar() {
        return platosACocinar;
    }

    public void setPlatosACocinar(ArrayList<Pedido> platosACocinar) {
        this.platosACocinar = platosACocinar;
    }

    public void mostrarMenu() {

        Scanner entrada = new Scanner(System.in);
        int opcion;
        String nombre = "";
        float precio;
        System.out.println("\t \t ------------------------------------");
        System.out.println("\t \t | \t Indique lo que desee hacer \t|");
        System.out.println("\t \t | \t 1) Agregar  \t|");
        System.out.println("\t \t | \t 2) Modificar  \t|");
        System.out.println("\t \t | \t 3) Eliminar  \t|");
        opcion=entrada.nextInt();

        if (opcion == 1) {

            System.out.println("\t \t | \t Elegiste La opcion Agregar  \t|");
            System.out.println("\t \t | \t 1)Agregar plato  \t|");
            System.out.println("\t \t | \t 2)Agregar pedido  \t|");

            opcion=entrada.nextInt();

            if (opcion == 1) {
                Plato plato = new Plato();
                listaPlatos.add(plato);
            } else if (opcion == 2) {
                Pedido pedido = new Pedido();
                listaPedidos.add(pedido);
            }
        } else if (opcion == 2) {

            System.out.println("\t \t | \t Elegiste La opcion Modificar  \t|");
            System.out.println("\t \t | \t 1)Modificar plato  \t|");
            System.out.println("\t \t | \t 2)Modificar pedido  \t|");
            opcion=entrada.nextInt();
            entrada.next();
            if (opcion == 1) {
                System.out.println("ingrese nombre del Plato a modificar");
                nombre=entrada.next();
                System.out.println("ingrese el precio que le quiera poner");
                precio=entrada.nextFloat();
                for(Plato plato:listaPlatos){
                    if(nombre.equals(plato.getNombre())){
                        plato.setPrecio(precio);
                    }
                }
            } else if (opcion == 2) {
                System.out.println("Ingrese el pedido a modificar");
                Pedido pedidoModificar=new Pedido();
                System.out.println("Ahora el nuevoPedido");
                Pedido pedidoModificado=new Pedido();
                modificarPedido(pedidoModificar, pedidoModificado);

            }
        } else if (opcion == 3) {

            System.out.println("\t \t | \t Elegiste La opcion Eliminar  \t|");
            System.out.println("\t \t | \t 1)Eliminar plato  \t|");
            System.out.println("\t \t | \t 2)Eliminar pedido  \t|");
            opcion=entrada.nextInt();
            if (opcion == 1) {
                eliminarPlato(new Plato());
                }
            } else if (opcion == 2) {
                eliminarPedido(new Pedido());
                }
            }
    public void eliminarPedido(Pedido pedidoSacar){
        for(Pedido pedido:listaPedidos){
            if(pedido == pedidoSacar){
                listaPlatos.remove(pedido);
            }
        }
    }
    public void eliminarPlato(Plato platoSacar){
        for(Plato plato:listaPlatos){
            if(plato == platoSacar){
                listaPlatos.remove(plato);
            }
        }
    }
    public void modificarPedido(Pedido pedidoModificar,Pedido pedidoModificado){
        for(Pedido pedido:listaPedidos) {
            if (pedidoModificar == pedido){
                // listaPedidos.set(pedidoModificar);
                pedido=pedidoModificado;
            }
        }
    }
}
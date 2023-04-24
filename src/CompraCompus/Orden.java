package CompraCompus;

import Formitas.Circulo;

import java.util.ArrayList;

public class Orden {
    private Cliente cliente;
    private Boolean metodoPago; //true=tarjeta
    private Tarjeta tarjeta;
    private ArrayList<Componente> componentes;
    private double precioTotal;
    

    public Orden(){
        cliente=new Cliente();
        metodoPago=true;
        tarjeta=new Tarjeta();
        componentes=new ArrayList<Componente>();
        for (Componente componente:componentes){
            precioTotal=precioTotal+componente.getPrecioVenta();
            precioTotal=precioTotal+(precioTotal*100/5);
        }
    }
    public Orden(Cliente cliente, Tarjeta tarjeta, ArrayList<Componente> componentes) {

        if(validacionOrden(new Sistema())){
            this.cliente = cliente;
            metodoPago = true;
            this.tarjeta = tarjeta;
            this.componentes = componentes;
            for (Componente componente:componentes){
                precioTotal=precioTotal+componente.getPrecioVenta();
                precioTotal=precioTotal+(precioTotal*100/5);
            }
        } else{
            System.out.println("Faltan componentes en la orden");
        }
    }

    public Orden(Cliente cliente, ArrayList<Componente> componentes,Sistema sistema) {
        if(validacionOrden(new Sistema())) {
            this.cliente = cliente;
            metodoPago = false;  // efectivo
            this.componentes = componentes;
            for (Componente componente:componentes){
                precioTotal=precioTotal+componente.getPrecioVenta();
            }
            for(Componente componente: sistema.getStock()){
                for (Componente componente1:componentes){
                    if(componente==componente1){
                        sistema.getStock().remove(componente);
                    }
                }
            }
        } else{
            System.out.println("Faltan componentes en la orden");
        }
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Boolean getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(Boolean metodoPago) {
        this.metodoPago = metodoPago;
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }

    public ArrayList<Componente> getComponentes() {
        return componentes;
    }

    public void setComponentes(ArrayList<Componente> componentes) {
        this.componentes = componentes;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public void agregarComponenteOrden(Componente componente){
        componentes.add(componente);
    }
    public void eliminarComponenteOrden(Componente componente){
        componentes.remove(componente);
    }
    public boolean validacionOrden(Sistema sistema){
        boolean sirve=false;
        boolean CPU=false;
        boolean entrada=false;
        boolean salida=false;

        for(Componente componente:componentes){
            for(Componente elemStock: sistema.getStock()){
                if(elemStock==componente){
                    if(componente instanceof CPU){
                        CPU=true;
                    }else if(componente instanceof Periferico && ((Periferico) componente).getEntrada()){
                        entrada=true;
                    }else if(componente instanceof Periferico && !((Periferico) componente).getEntrada()){
                        salida=true;
                    }
                }

            }

        }
        if(CPU && entrada && salida){
            sirve=true;
        }
        return sirve;
    }
    public void cantidadComponentes(){
        int cantEntrada=0;
        int cantSalida=0;
        for(Componente componente:componentes){
            if(componente instanceof Periferico){
                if(((Periferico) componente).getEntrada()){
                    cantEntrada++;
                }else {
                    cantSalida++;
                }
            }
        }
        System.out.println("Hay " + cantEntrada + " dispositivos de entrada y " + cantSalida + " de salida.");
    }
}


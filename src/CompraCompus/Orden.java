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
    public Orden(Cliente cliente, Tarjeta tarjeta, ArrayList<Componente> componentes, Sistema sistema) {

        try {
            validacionOrden(sistema);
            for (Componente componente:componentes){
                verificacionStock(componente,sistema);
            }
            this.cliente = cliente;
            metodoPago = true;
            this.tarjeta = tarjeta;
            this.componentes = componentes;
            for (Componente componente:componentes){
                precioTotal=precioTotal+componente.getPrecioVenta();
                precioTotal=precioTotal+(precioTotal*100/5);
            }
        }catch (StockNoDisponible e1){
            System.out.println(e1);
        } catch (FaltaComponenteExeption e) {
            System.out.println(e);
        }
    }

    public Orden(Cliente cliente, ArrayList<Componente> componentes,Sistema sistema) throws StockNoDisponible{
        try {
                validacionOrden(sistema);
                this.cliente = cliente;
                metodoPago = false;  // efectivo
                this.componentes = componentes;
                for (Componente componente:componentes){
                    precioTotal=precioTotal+componente.getPrecioVenta();
                }
                for(Componente componente1:componentes){
                    for (Componente componente: sistema.getStock()){
                        if(componente==componente1){
                            try {
                                verificacionStock(componente,sistema);
                            }catch (StockNoDisponible e){
                                System.out.println(e);
                            }
                        }
                    }
                }
        } catch (FaltaComponenteExeption e) {
            System.out.println(e);
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

    public void validacionOrden(Sistema sistema) throws FaltaComponenteExeption{
        Boolean CPU=false, entrada=false, salida=false;
        for(Componente componente:componentes){
            for(Componente elemStock: sistema.getStock()){
                if(elemStock==componente){
                    if(componente instanceof CPU){ CPU=true; }
                    else if(componente instanceof Periferico && ((Periferico) componente).getEntrada()){ entrada=true; }
                    else if(componente instanceof Periferico && !((Periferico) componente).getEntrada()){ salida=true; }
                }
            }
        }
        if(!(CPU && entrada && salida)){
            throw new FaltaComponenteExeption("Falta algun componente en su orden");
        }
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

    public void verificacionStock(Componente componente, Sistema sistema)throws StockNoDisponible{
        if (componente.getStock()>0){
            sistema.getStock().remove(componente);
            componente.setStock(componente.getStock()-1);
            sistema.getStock().add(componente);
        }else{
            throw new StockNoDisponible("No hay Stock disponible para la compra");
        }
    }

}


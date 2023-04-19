package CompraCompus;

import Formitas.Circulo;

import java.util.ArrayList;

public class Orden {
    private Cliente cliente;
    private Boolean metodoPago; //true=tarjeta
    private Tarjeta tarjeta;
    private ArrayList<Componente> componentes;
    

    public Orden(){
        cliente=new Cliente();
        metodoPago=true;
        tarjeta=new Tarjeta();
        componentes=new ArrayList<Componente>();
    }
    public Orden(Cliente cliente, Tarjeta tarjeta, ArrayList<Componente> componentes) {

        if(validacionOrden()){
            this.cliente = cliente;
            metodoPago = true;
            this.tarjeta = tarjeta;
            this.componentes = componentes;
        } else{
            System.out.println("Faltan componentes en la orden");
        }
    }

    public Orden(Cliente cliente, ArrayList<Componente> componentes) {
        if(validacionOrden()) {
            this.cliente = cliente;
            metodoPago = false;
            this.componentes = componentes;
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

    public void agregarComponenteOrden(Componente componente){
        componentes.add(componente);
    }
    public void eliminarComponenteOrden(Componente componente){
        componentes.remove(componente);
    }
    public boolean validacionOrden(){
        boolean sirve=false;
        boolean CPU=false;
        boolean entrada=false;
        boolean salida=false;
        for(Componente componente:componentes){
            if(componente instanceof CPU){
                CPU=true;
            }else if(componente instanceof Periferico && ((Periferico) componente).getEntrada()){
                entrada=true;
            }else if(componente instanceof Periferico && !((Periferico) componente).getEntrada()){
                salida=true;
            }
        }
        if(CPU && entrada && salida){
            sirve=true;
        }
        return sirve;
    }
}

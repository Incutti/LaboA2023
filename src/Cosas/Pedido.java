package Cosas;
import tiempo.Fecha;
import Humanos.*;
import java.util.Date;

public class Pedido {
    private Fecha fechaDeCreacion;
    private Plato platoPedido;
    private Boolean entregado;
    private Persona cliente;
    private Date horaDeEntrega;



    public Pedido (){
        fechaDeCreacion = new Fecha();
        platoPedido = new Plato();
        entregado=false;
        cliente = new Alumno();
        horaDeEntrega = new Date();
    }

    public Pedido(Fecha fechaDeCreacion, Plato platoPedido, Boolean entregado, Persona cliente, Date horaDeEntrega) {
        this.fechaDeCreacion = fechaDeCreacion;
        this.platoPedido = platoPedido;
        this.entregado = entregado;
        this.cliente = cliente;
        this.horaDeEntrega = horaDeEntrega;
    }



    public Fecha getFechaDeCreacion() {
        return fechaDeCreacion;
    }

    public void setFechaDeCreacion(Fecha fechaDeCreacion) {
        this.fechaDeCreacion = fechaDeCreacion;
    }

    public Plato getPlatoPedido() {
        return platoPedido;
    }

    public void setPlatoPedido(Plato platoPedido) {
        this.platoPedido = platoPedido;
    }

    public Boolean getEntregado() {
        return entregado;
    }

    public void setEntregado(Boolean entregado) {
        this.entregado = entregado;
    }

    public Persona getCliente() {
        return cliente;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }

    public Date getHoraDeEntrega() {
        return horaDeEntrega;
    }

    public void setHoraDeEntrega(Date horaDeEntrega) {
        this.horaDeEntrega = horaDeEntrega;
    }


}

package CompraCompus;

import Humanos.Persona;
import tiempo.Fecha;

public class Cliente extends Persona {
    private int celular;
    private Tarjeta tarjeta;


    public Cliente() {
        super();
        celular = 1148992390;
        tarjeta = new Tarjeta();
    }

    public Cliente(String nombre, String apellido, String direccion, Fecha fechaNacimiento, int celular, Tarjeta tarjeta) {
        super(nombre, apellido, direccion, fechaNacimiento);
        this.celular = celular;
        this.tarjeta = tarjeta;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }
}

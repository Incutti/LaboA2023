package CompraCompus;

import java.util.ArrayList;

public class Teclado extends Periferico{
    private String tamanio;

    public Teclado(String nombreFabricante, String modelo, float precioVenta, int porcentajePais, int stock, String conector, ArrayList<String> puertosValidos, Boolean entrada, String tamanio) {
        super(nombreFabricante, modelo, precioVenta, porcentajePais, stock, conector, puertosValidos, entrada);
        this.tamanio = tamanio;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }
}

package CompraCompus;

import java.util.ArrayList;

public class Impresora extends Periferico{
    private String metodoImpresion;

    public Impresora(){
        super();
        metodoImpresion="Laser";
    }
    public Impresora(String nombreFabricante, String modelo, float precioVenta, int porcentajePais, int stock, String conector, ArrayList<String> puertosValidos, Boolean entrada, String metodoImpresion) {
        super(nombreFabricante, modelo, precioVenta, porcentajePais, stock, conector, puertosValidos, entrada);
        this.metodoImpresion = metodoImpresion;
    }

    public String getMetodoImpresion() {
        return metodoImpresion;
    }

    public void setMetodoImpresion(String metodoImpresion) {
        this.metodoImpresion = metodoImpresion;
    }
}

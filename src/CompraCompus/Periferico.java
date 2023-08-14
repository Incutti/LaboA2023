package CompraCompus;

import java.util.ArrayList;

public abstract class Periferico extends Componente{
    private String conector;
    private ArrayList<String>puertosValidos;
    private Boolean entrada;

    public Periferico(){
        super();
        conector="USB 2.0";
        puertosValidos=new ArrayList<String>();
        entrada=true;
    }
    public Periferico(String nombreFabricante, String modelo, float precioVenta, int porcentajePais, int stock, String conector, ArrayList<String> puertosValidos, Boolean entrada) {
        super(nombreFabricante, modelo, precioVenta, porcentajePais, stock);
        this.conector = conector;
        this.puertosValidos = puertosValidos;
        this.entrada = entrada;
    }
    public Periferico(Boolean entrada){
        super();
        conector="USB 2.0";
        puertosValidos=new ArrayList<String>();
        this.entrada=entrada;
    }

    public String getConector() {
        return conector;
    }

    public void setConector(String conector) {
        this.conector = conector;
    }

    public ArrayList<String> getPuertosValidos() {
        return puertosValidos;
    }

    public void setPuertosValidos(ArrayList<String> puertosValidos) {
        this.puertosValidos = puertosValidos;
    }

    public Boolean getEntrada() {
        return entrada;
    }

    public void setEntrada(Boolean entrada) {
        this.entrada = entrada;
    }
}

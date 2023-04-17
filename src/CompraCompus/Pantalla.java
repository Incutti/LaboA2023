package CompraCompus;

import java.util.ArrayList;

public class Pantalla extends Periferico{
    private int pulgadas;
    private ArrayList<Integer> definicion;
    private String panel;

    public Pantalla(String nombreFabricante, String modelo, float precioVenta, int porcentajePais, int stock, String conector, ArrayList<String> puertosValidos, Boolean entrada, int pulgadas, ArrayList<Integer> definicion, String panel) {
        super(nombreFabricante, modelo, precioVenta, porcentajePais, stock, conector, puertosValidos, entrada);
        this.pulgadas = pulgadas;
        this.definicion = definicion;
        this.panel = panel;
    }
    public Pantalla(){
        super();
        pulgadas=24;
        definicion =new ArrayList<Integer>();
        panel="IPS";
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public ArrayList<Integer> getDefinicion() {
        return definicion;
    }

    public void setDefinicion(ArrayList<Integer> definicion) {
        this.definicion = definicion;
    }

    public String getPanel() {
        return panel;
    }

    public void setPanel(String panel) {
        this.panel = panel;
    }
}

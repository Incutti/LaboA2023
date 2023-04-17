package CompraCompus;

import java.util.ArrayList;

public class Mouse extends Periferico{
    private String sensor;
    private String agarre;

    public Mouse(){
        super();
        sensor="optico";
        agarre="claw";
    }
    public Mouse(String nombreFabricante, String modelo, float precioVenta, int porcentajePais, int stock, String conector, ArrayList<String> puertosValidos, Boolean entrada, String sensor, String agarre) {
        super(nombreFabricante, modelo, precioVenta, porcentajePais, stock, conector, puertosValidos, entrada);
        this.sensor = sensor;
        this.agarre = agarre;
    }

    public String getSensor() {
        return sensor;
    }

    public void setSensor(String sensor) {
        this.sensor = sensor;
    }

    public String getAgarre() {
        return agarre;
    }

    public void setAgarre(String agarre) {
        this.agarre = agarre;
    }
}

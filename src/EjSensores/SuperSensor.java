package EjSensores;

import java.util.ArrayList;

public class SuperSensor extends Sensor {
    private ArrayList<Sensor> sensores;
    private double valMedio;

    public SuperSensor() {
        super();
        sensores = new ArrayList<Sensor>();
        for(Sensor sensor:sensores){
            valMedio=valMedio+sensor.getValor();
        }
        valMedio=valMedio/ sensores.size();
    }
    public SuperSensor(boolean estado, double valor, double umbral, int anioAdquisicion, ArrayList<Sensor> sensores) {
        super(estado, valor, umbral, anioAdquisicion);
        this.sensores = sensores;
        for(Sensor sensor:sensores){
            valMedio=valMedio+sensor.getValor();
        }
        valMedio=valMedio/ sensores.size();
    }

    public ArrayList<Sensor> getSensores() {

        return sensores;
    }

    public void setSensores(ArrayList<Sensor> sensores) {
        this.sensores = sensores;
    }

    public double getValMedio() {
        return valMedio;
    }

    public void setValMedio(double valMedio) {
        this.valMedio = valMedio;
    }
}



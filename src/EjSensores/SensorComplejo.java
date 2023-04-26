package EjSensores;

import java.util.ArrayList;

public class SensorComplejo {
    private ArrayList<Sensor> sensores;
    private double valMedio;

    private double umbral;

    public SensorComplejo() {
        sensores = new ArrayList<Sensor>();
        for(Sensor sensor:sensores){
            valMedio=valMedio+sensor.getValor();
        }
        valMedio=valMedio/ sensores.size();
        umbral=123;
    }
    public SensorComplejo(ArrayList<Sensor> sensores, double umbral) {
        this.sensores = sensores;
        for(Sensor sensor:sensores){
            valMedio=valMedio+sensor.getValor();
        }
        valMedio=valMedio/ sensores.size();
        this.umbral=umbral;
    }

    public double getUmbral() { return umbral; }
    public void setUmbral(double umbral) { this.umbral = umbral; }
    public ArrayList<Sensor> getSensores() { return sensores; }
    public void setSensores(ArrayList<Sensor> sensores) { this.sensores = sensores; }
    public double getValMedio() { return valMedio; }
    public void setValMedio(double valMedio) { this.valMedio = valMedio; }

    public void verificar(){
        if(umbral<valMedio){
                for (Sensor sensor:sensores){
                    sensor.alarma();
                }
        }
    }
}



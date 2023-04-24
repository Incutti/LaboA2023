package EjSensores;

import java.util.ArrayList;

public class Edificio {
    private ArrayList<Sensor>sensoresVinculados;

    public Edificio(){
        sensoresVinculados=new ArrayList<Sensor>();
    }
    public Edificio(ArrayList<Sensor> sensoresVinculados) {
        this.sensoresVinculados = sensoresVinculados;
    }

    public ArrayList<Sensor> getSensoresVinculados() {
        return sensoresVinculados;
    }

    public void setSensoresVinculados(ArrayList<Sensor> sensoresVinculados) {
        this.sensoresVinculados = sensoresVinculados;
    }

    public void vincular(Sensor sensor){
        if (sensor.isEstado()){
            sensoresVinculados.add(sensor);
        }
    }
    public void desvincular(Sensor sensor){
        for(Sensor sensorActual:sensoresVinculados){
            if(!sensor.isEstado()){
                sensoresVinculados.remove(sensor);
            }
        }
    }

    public void alarma(){
        for(Sensor sensor:sensoresVinculados){
            if(sensor.getValor()> sensor.getUmbral()){
                if(sensor instanceof SensorHumo){
                    System.out.println("¡Auxilio, necesitamos a los bomberos!");
                } else if (sensor instanceof SensorTemperatura){
                    System.out.println("¡Cuidado! La temperatura sube");
                } else if (sensor instanceof SensorPresion){
                    System.out.println("Sensor de presión activado");
                }
            }
        }
    }
}

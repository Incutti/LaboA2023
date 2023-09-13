package EjSensores;

import java.util.ArrayList;

public class Edificio {
    private ArrayList<Sensor> sensores;

    public Edificio(){
        sensores=new ArrayList<>();
    }
    public Edificio(ArrayList<Sensor> sensores) {
        this.sensores = sensores;
    }

    public ArrayList<Sensor> getSensores() {
        return sensores;
    }

    public void setSensores(ArrayList<Sensor> sensores) {
        this.sensores = sensores;
    }

    public static void main(String[] args){

        Edificio edificio = new Edificio();

        SensorHumo sh1 =new SensorHumo(true, 1, 100, 1999); edificio.getSensores().add(sh1);
        SensorHumo sh2 =new SensorHumo(true, 2, 200, 2000); edificio.getSensores().add(sh2);
        SensorHumo sh3 =new SensorHumo(true, 3, 300, 2001); edificio.getSensores().add(sh3);
        SensorPresion sp1 =new SensorPresion(true, 4, 400, 2002);
        SensorPresion sp2 =new SensorPresion(true, 5, 500, 2003);
        SensorPresion sp3 =new SensorPresion(true, 6, 600, 2004);
        SensorTemperatura st1 =new SensorTemperatura(true, 7, 700, 2005);
        SensorTemperatura st2 =new SensorTemperatura(true, 8, 800, 2006);
        SensorTemperatura st3 =new SensorTemperatura(true, 9, 900, 2007);


    }
}

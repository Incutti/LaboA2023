package EjSensores;

public class SensorPresion extends Sensor{

    public SensorPresion(){
        super();
    }

    public SensorPresion(boolean estado, double valor, double umbral, int anioAdquisicion) {
        super(estado, valor, umbral, anioAdquisicion);
    }
}

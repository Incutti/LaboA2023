package EjSensores;

public class SensorTemperatura extends Sensor{
    public SensorTemperatura (){
    super();
}

    public SensorTemperatura(boolean estado, double valor, double umbral, int anioAdquisicion) {
        super(estado, valor, umbral, anioAdquisicion);
    }
}

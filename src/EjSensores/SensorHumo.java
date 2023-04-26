package EjSensores;

public class SensorHumo extends Sensor{
    public SensorHumo (){
        super();
    }

    public SensorHumo(boolean estado, double valor, double umbral, int anioAdquisicion) {
        super(estado, valor, umbral, anioAdquisicion);
    }
    @Override
    public void alarma(){
            System.out.println("¡Auxilio, necesitamos a los bomberos!");
        }
    }

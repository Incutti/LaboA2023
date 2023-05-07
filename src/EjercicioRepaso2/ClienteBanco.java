package EjercicioRepaso2;

import Humanos.Persona;
import tiempo.Fecha;

public class ClienteBanco extends Persona {
    private int cuil;

    public int getCuil(){
        return cuil;
    }
    public void setCuil(int cuil){
        this.cuil=cuil;
    }
    public ClienteBanco(){
        super();
        cuil=2130525666;
    }
    public ClienteBanco(String nombre, String apellido, int dni, int edad, Fecha fechaNacimiento, String direccion, int cuil){
        super(nombre, apellido, dni, edad, fechaNacimiento, direccion);
        this.cuil=cuil;
    }


}

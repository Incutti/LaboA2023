package Telefonia;
import Humanos.Persona;

public class Empleado extends Persona {
    public Empleado(String nombre, String apellido, int DNI, int numTelefono, String pais) {
        super(nombre, apellido, DNI, numTelefono, pais);
    }
    public Empleado(){
        super();
    }

}

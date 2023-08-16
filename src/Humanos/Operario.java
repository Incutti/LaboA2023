package Humanos;

import Humanos.Empleado;

public abstract class Operario extends Empleado {
    public Operario(String nombre){
        super (nombre);
    }

    @Override
    public String toString() {
        return getClass().getSuperclass().getName() + " " + getNombre() + " -> " + getClass().getCanonicalName();
    }
}

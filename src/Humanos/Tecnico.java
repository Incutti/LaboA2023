package Humanos;

public class Tecnico extends Operario{
    public Tecnico(String nombre){
        super(nombre);
    }

    @Override
    public String toString() {

        return getClass().getSuperclass().getSuperclass().getName() + " " + getNombre() + " -> " + getClass().getSuperclass().getName() + " -> " + getClass().getCanonicalName();    }
}

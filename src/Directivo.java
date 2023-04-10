public class Directivo extends Empleado{
    public Directivo(String nombre){
        super (nombre);
    }

    @Override
    public String toString() {

        return  getClass().getSuperclass().getName() + " " + getNombre() + " -> " + getClass().getCanonicalName();
    }
}

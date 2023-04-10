public class Oficial extends Operario{
    public Oficial(String nombre){
        super(nombre);
    }

    @Override
    public String toString() {

        return getClass().getSuperclass().getSuperclass().getName() + " " + getNombre() + " -> " + getClass().getSuperclass().getName() + " -> " + getClass().getCanonicalName();
    }
}

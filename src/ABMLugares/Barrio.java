package ABMLugares;

import java.util.HashSet;

public class Barrio extends Lugar{
    private int poblacion;
    public Barrio(){
        super();
        poblacion=5000;
    }

    public Barrio(String nombre, int codigo, HashSet<Coordenadas> coordenadas, int poblacion) {
        super(nombre, codigo, coordenadas);
        this.poblacion = poblacion;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    @Override
    public int consultaPoblacion() {
        return poblacion;
    }
}

package ABMLugares;

import java.util.ArrayList;
import java.util.HashSet;

public class Provincia extends Lugar{
    HashSet<Ciudad>ciudadesDentro;

    public Provincia(){
        super();
        ciudadesDentro=new HashSet<>();
    }

    public Provincia(String nombre, int codigo, HashSet<Coordenadas> coordenadas, HashSet<Ciudad> ciudadesDentro) {
        super(nombre, codigo, coordenadas);
        this.ciudadesDentro = ciudadesDentro;
    }

    public HashSet<Ciudad> getCiudadesDentro() {
        return ciudadesDentro;
    }

    public void setCiudadesDentro(HashSet<Ciudad> ciudadesDentro) {
        this.ciudadesDentro = ciudadesDentro;
    }

    @Override
    public int consultaPoblacion() {
        int cantHabitantes=0;
        for(Ciudad ciudad:ciudadesDentro){
            cantHabitantes+=ciudad.consultaPoblacion();
        }
        return cantHabitantes;
    }
}

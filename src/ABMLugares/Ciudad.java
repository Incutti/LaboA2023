package ABMLugares;

import java.util.ArrayList;
import java.util.HashSet;

public class Ciudad extends Lugar{
    HashSet<Barrio>barriosDentro;

    public Ciudad(){
        super();
        barriosDentro=new HashSet<>();
    }
    public Ciudad(String nombre, int codigo, HashSet<Coordenadas> coordenadas, HashSet<Barrio> barriosDentro) {
        super(nombre, codigo, coordenadas);
        this.barriosDentro = barriosDentro;
    }

    public HashSet<Barrio> getBarriosDentro() {
        return barriosDentro;
    }

    public void setBarriosDentro(HashSet<Barrio> barriosDentro) {
        this.barriosDentro = barriosDentro;
    }
    @Override
    public int consultaPoblacion() {
        int cantHabitantes=0;
        for(Barrio barrio:barriosDentro){
            cantHabitantes+=barrio.consultaPoblacion();
        }
        return cantHabitantes;
    }
}

package ABMLugares;

import java.util.ArrayList;
import java.util.HashSet;

public class Continente extends Lugar{
    private HashSet<Pais>paisesDentro;

    public Continente(){
        paisesDentro=new HashSet<>();
    }

    public Continente(String nombre, int codigo, HashSet<Coordenadas> coordenadas, HashSet<Pais> paisesDentro) {
        super(nombre, codigo, coordenadas);
        this.paisesDentro = paisesDentro;
    }

    public HashSet<Pais> getPaisesDentro() {
        return paisesDentro;
    }

    public void setPaisesDentro(HashSet<Pais> paisesDentro) {
        this.paisesDentro = paisesDentro;
    }

    @Override
    public int consultaPoblacion() {
        int cantHabitantes=0;
        for(Pais pais:paisesDentro){
            cantHabitantes+=pais.consultaPoblacion();
        }
        return cantHabitantes;
    }
}

package ABMLugares;

import java.util.ArrayList;
import java.util.HashSet;

public class Pais extends Lugar{

    private HashSet<Provincia> provinciasDentro;

    public Pais(){
        provinciasDentro=new HashSet<>();
    }
    public Pais(String nombre, int codigo, HashSet<Coordenadas> coordenadas, HashSet<Provincia> provinciasDentro) {
        super(nombre, codigo, coordenadas);
        this.provinciasDentro = provinciasDentro;
    }

    public HashSet<Provincia> getProvinciasDentro() {
        return provinciasDentro;
    }

    public void setProvinciasDentro(HashSet<Provincia> provinciasDentro) {
        this.provinciasDentro = provinciasDentro;
    }

    @Override
    public int consultaPoblacion() {
        int cantHabitantes=0;
        for(Provincia provincia:provinciasDentro){
            cantHabitantes+=provincia.consultaPoblacion();
        }
        return cantHabitantes;
    }
}

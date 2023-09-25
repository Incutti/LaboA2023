package IntercambioObjetos;

import Humanos.Persona;

import java.util.HashSet;

public class Trader extends Persona {
    private HashSet<Prestable> pertenencias;

    public Trader(String nombre, String apellido, int dni, HashSet<Prestable> pertenencias) {
        super(nombre, apellido, dni);
        this.pertenencias = pertenencias;
    }

    public HashSet<Prestable> getPertenencias() {
        return pertenencias;
    }

    public void setPertenencias(HashSet<Prestable> pertenencias) {
        this.pertenencias = pertenencias;
    }
}

package FutbolArgentino;

import java.util.HashSet;

public class Sistema {
    private HashSet<Partido>partidos;

    public Sistema() {
        partidos=new HashSet<>();
    }

    public HashSet<Partido> getPartidos() {
        return partidos;
    }

    public void setPartidos(HashSet<Partido> partidos) {
        this.partidos = partidos;
    }
}

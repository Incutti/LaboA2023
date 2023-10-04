package FutbolArgentino;

public class YaJugoException extends Exception {
    public YaJugoException(){
        super("El jugador ya ha jugado en este equipo");
    }
}

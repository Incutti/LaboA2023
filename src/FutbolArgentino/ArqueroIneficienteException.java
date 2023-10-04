package FutbolArgentino;

public class ArqueroIneficienteException extends Exception {
    public ArqueroIneficienteException(){
        super("El arquero no cumple los parametros necesarios para unirse al club.");
    }
}

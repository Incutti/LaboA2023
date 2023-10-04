package FutbolArgentino;

public class JugadorCampoIneficienteException extends Exception {
    public JugadorCampoIneficienteException(){
        super("El jugador no cumple los parametros necesarios para unirse al club.");
    }

}

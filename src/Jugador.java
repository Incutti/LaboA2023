public class Jugador {
    private Persona jugador ;
    private int numero;
    private Boolean capitan;

    public Jugador(){
        jugador=new Persona();
        numero=1;
        capitan=false;
    }
    public Jugador(Persona jugador, int numero){
        this.jugador=jugador;
        this.numero=numero;
        capitan=false;
    }

    public Persona getJugador() {
        return jugador;
    }

    public void setJugador(Persona jugador) {
        this.jugador = jugador;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Boolean getCapitan() {
        return capitan;
    }

    public void setCapitan(Boolean capitan) {
        this.capitan = capitan;
    }
}

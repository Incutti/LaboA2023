package Humanos;

public class Jugador extends Persona{
    private int numero;
    private Boolean capitan;

    public Jugador(){
        super();
        numero=1;
        capitan=false;
    }
    public Jugador(/*Humanos.Persona jugador,*/String nombre, int numero){
        //this.jugador=jugador;
        super(nombre);
        this.numero=numero;
        capitan=false;
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

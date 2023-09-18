package ConsumoBebidas;

public class DniRepetidoException extends Exception{
    public DniRepetidoException(){
        super("El DNI del usuario ya esta registrado en el Sistema");
    }
}

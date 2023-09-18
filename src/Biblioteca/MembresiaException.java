package Biblioteca;

public class MembresiaException extends Exception {
    public MembresiaException (){
        super("Usted No tiene mas prestamos disponibles");
    }
}

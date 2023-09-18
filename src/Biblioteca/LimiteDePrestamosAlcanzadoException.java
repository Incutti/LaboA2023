package Biblioteca;

public class LimiteDePrestamosAlcanzadoException extends Exception {
    public LimiteDePrestamosAlcanzadoException(){
        super("Se ha alcanzado el limite de Prestamos para este Libro");
    }
}

package Restaurante;

public class YaExisteException extends Exception{
    public YaExisteException(){
        super("Ese plato ya existe en el menú");
    }
}

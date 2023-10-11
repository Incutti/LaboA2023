package Restaurante;

public class ChefContratadoException extends Exception{
    public ChefContratadoException(){
        super("El chef que hace el plato no está contratado");
    }
}

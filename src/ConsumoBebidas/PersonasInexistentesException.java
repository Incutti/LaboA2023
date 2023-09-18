package ConsumoBebidas;

public class PersonasInexistentesException extends Exception{
    public PersonasInexistentesException(){
        super("No hay personas suficientes o no se encontró ningun mejor ni peor coeficiente de persona de hidratacion");
    }
}

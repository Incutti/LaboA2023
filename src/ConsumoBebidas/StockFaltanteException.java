package ConsumoBebidas;

public class StockFaltanteException extends Exception{
    public StockFaltanteException(){
        super("No tenemos esa bebida o la cantidad suficiente de la misma");
    }
}

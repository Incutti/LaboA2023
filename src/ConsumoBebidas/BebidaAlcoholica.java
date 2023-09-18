package ConsumoBebidas;

public class BebidaAlcoholica extends Bebida{
    private int cantidadAlcohol;

    public BebidaAlcoholica(){
        super();
        super.setCoeficientePositividad(0);
        super.setCoeficienteNegatividad(cantidadAlcohol*20);
    }
    public BebidaAlcoholica(String nombre, int cantidadAlcohol){
        super(nombre);
        this.cantidadAlcohol=cantidadAlcohol;
        super.setCoeficientePositividad(0);
        super.setCoeficienteNegatividad(cantidadAlcohol*20);
    }

    public int getCantidadAlcohol() {
        return cantidadAlcohol;
    }

    public void setCantidadAlcohol(int cantidadAlcohol) {
        this.cantidadAlcohol = cantidadAlcohol;
    }
}

package ConsumoBebidas;

public class BebidaAzucarada extends Bebida{
    private int cantidadAzucar;

    public BebidaAzucarada(){
        super();
        cantidadAzucar=10;
        super.setCoeficientePositividad(1);
        super.setCoeficienteNegatividad(cantidadAzucar*10);
    }
    public BebidaAzucarada(String nombre, int cantidadAzucar){
        super(nombre);
        this.cantidadAzucar=cantidadAzucar;
        super.setCoeficientePositividad(1);
        super.setCoeficienteNegatividad(cantidadAzucar*10);
    }

    public int getCantidadAzucar() {
        return cantidadAzucar;
    }

    public void setCantidadAzucar(int cantidadAzucar) {
        this.cantidadAzucar = cantidadAzucar;
    }
}

package IntercambioObjetos;

import Enums.Color;

public class Pantalon extends Ropa implements Prestable{
    private double medidaCintura;
    private double medidaCadera;
    private double medidaLargo;

    public Pantalon(Color color, Material material, String marca, Boolean tieneRoturas, Boolean tieneManchas, double medidaCintura, double medidaCadera, double medidaLargo) {
        super(color, material, marca, tieneRoturas, tieneManchas);
        this.medidaCintura = medidaCintura;
        this.medidaCadera = medidaCadera;
        this.medidaLargo = medidaLargo;
    }

    public double getMedidaCintura() {
        return medidaCintura;
    }

    public void setMedidaCintura(double medidaCintura) {
        this.medidaCintura = medidaCintura;
    }

    public double getMedidaCadera() {
        return medidaCadera;
    }

    public void setMedidaCadera(double medidaCadera) {
        this.medidaCadera = medidaCadera;
    }

    public double getMedidaLargo() {
        return medidaLargo;
    }

    public void setMedidaLargo(double medidaLargo) {
        this.medidaLargo = medidaLargo;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Pantalon{" +
                "medidaCintura=" + medidaCintura +
                ", medidaCadera=" + medidaCadera +
                ", medidaLargo=" + medidaLargo +
                '}';
    }

    @Override
    public Boolean prestar() {
        if(!super.getTieneManchas() && !super.getTieneRoturas()){
            System.out.println("El pantalón se dará prestado.");
            return true;
        } else {
            System.out.println("El pantalón no se prestará.");
            return false;
        }
    }

    @Override
    public Boolean agregarElemento() {
        if(prestar()) {
            System.out.println("El artículo ingresado puede ingresar al circuito de préstamos");
            return true;
        } else {
            System.out.println("El artículo ingresado no podrá ingresar a nuestro sistema");
            return false;
        }
    }
}

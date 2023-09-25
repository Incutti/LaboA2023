package IntercambioObjetos;

import Enums.Color;

public class Remera extends Ropa implements Prestable{
    private double medidaEspalda;
    private double medidaContorno;
    private double largoTorso;

    public Remera(Color color, Material material, String marca, Boolean tieneRoturas, Boolean tieneManchas, double medidaEspalda, double medidaContorno, double largoTorso) {
        super(color, material, marca, tieneRoturas, tieneManchas);
        this.medidaEspalda = medidaEspalda;
        this.medidaContorno = medidaContorno;
        this.largoTorso = largoTorso;
    }

    public double getMedidaEspalda() {
        return medidaEspalda;
    }

    public void setMedidaEspalda(double medidaEspalda) {
        this.medidaEspalda = medidaEspalda;
    }

    public double getMedidaContorno() {
        return medidaContorno;
    }

    public void setMedidaContorno(double medidaContorno) {
        this.medidaContorno = medidaContorno;
    }

    public double getLargoTorso() {
        return largoTorso;
    }

    public void setLargoTorso(double largoTorso) {
        this.largoTorso = largoTorso;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Remera{" +
                "medidaEspalda=" + medidaEspalda +
                ", medidaContorno=" + medidaContorno +
                ", largoTorso=" + largoTorso +
                '}';
    }

    @Override
    public Boolean prestar() {
        if(!super.getTieneManchas() && !super.getTieneRoturas()){
            System.out.println("La remera se dará prestada.");
            return true;
        } else {
            System.out.println("La remera no se prestará.");
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

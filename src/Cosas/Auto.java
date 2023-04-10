package Cosas;

public class Auto extends Vehiculo{

    private int velocidad;


    public Auto() {
        this.marca = "Volkswagen";
        this.modelo = "Nivus";
        this.color = "blanco";
        this.velocidad= 0;
    }
    public Auto(String marca, String modelo, String color, int velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.velocidad= velocidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int acelerar(){
        velocidad++;
        return velocidad;
    }
    public int frenar() {
        if (velocidad > 0) {

            velocidad--;
        }
        return velocidad;
    }
    public void mostrarVelocidad(){
        System.out.println(velocidad);

    }
}


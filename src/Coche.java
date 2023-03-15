public class Coche {
    private String marca;
    private String modelo;
    private String color;
    private int velocidad;


    public Coche() {
        this.marca = "Volkswagen";
        this.modelo = "Nivus";
        this.color = "blanco";
        this.velocidad= 0;
    }
    public Coche(String marca, String modelo, String color, int velocidad) {
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

    public int acelerar(int velocidad){
        velocidad++;
        return velocidad;
    }
    public int frenar(int velocidad) {
        if (velocidad > 0) {

            velocidad--;
        }
        return velocidad;
    }
    public void mostrarVelocidad(int velocidad){

        System.out.println(velocidad);

    }
}

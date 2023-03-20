public class Taza {
    private int cantMaxima;
    private int cantActual;
    private String color;
    private String material;

    public Taza() {
        cantMaxima = 250;
        cantActual = 0;
        color = "blanca";
        material = "porcelana";
    }
    public Taza(int cantMaxima, int cantActual) {
        this.cantMaxima = cantMaxima;
        this.cantActual = cantActual;
    }

    public int getCantMaxima() {
        return cantMaxima;
    }

    public void setCantMaxima(int cantMaxima) {
        this.cantMaxima = cantMaxima;
    }

    public int getCantActual() {
        return cantActual;
    }

    public void setCantActual(int cantActual) {
        this.cantActual = cantActual;
    }
}


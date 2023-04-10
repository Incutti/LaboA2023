package Cosas;

public class Cafetera {
    private int cantMaxima;
    private int cantActual;

    public Cafetera() {
        cantMaxima = 1000;
        cantActual = 0;
    }
    public Cafetera(int cantMaxima) {
        this.cantMaxima = cantMaxima;
        cantActual = cantMaxima;
    }
    public Cafetera(int cantMaxima, int cantActual) {
        this.cantMaxima = cantMaxima;
        if(cantActual>cantMaxima){
            this.cantActual=this.cantMaxima;
        } else{
            this.cantActual = cantActual;
        }

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

    void llenarCafetera(){
        cantActual=cantMaxima;
    }

    void servirTaza(Taza taza) {
        int espacioTaza = taza.getCantMaxima() - taza.getCantActual();
        if (cantActual >= espacioTaza) {
            cantActual= cantActual - espacioTaza;
            taza.setCantActual(taza.getCantMaxima());
        }else {
            taza.setCantActual(cantActual+ taza.getCantActual());
            cantActual=0;
        }
    }
    void vaciarCafetera(){
        cantActual=0;
    }
    void agregarCafe(int cantidad){
        cantActual=cantActual+cantidad;
        if(cantActual>cantMaxima){
            cantActual=cantMaxima;
        }
    }
}







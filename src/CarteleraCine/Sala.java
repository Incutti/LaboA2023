package CarteleraCine;

public class Sala {
    private int numero;
    private static int contador=1;
    private static int cantidadButacas=45;

    public Sala(){
        numero = contador;
        contador+=1;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public static int getCantidadButacas() {
        return cantidadButacas;
    }

    public static void setCantidadButacas(int cantidadButacas) {
        Sala.cantidadButacas = cantidadButacas;
    }
}

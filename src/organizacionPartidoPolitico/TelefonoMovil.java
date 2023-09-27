package organizacionPartidoPolitico;

public class TelefonoMovil extends Dispositivos implements Mensajeria{
    private Compania compania;
    private int numeroCelular;
    private boolean prendido;
    private boolean creditoDisponible;


    public TelefonoMovil(int numeroSerie, String fabricante, String modelo, Compania compania, int numeroCelular, boolean prendido, boolean creditoDisponible) {
        super(numeroSerie, fabricante, modelo);
        this.compania = compania;
        this.numeroCelular = numeroCelular;
        this.prendido = prendido;
        this.creditoDisponible = creditoDisponible;
    }

    public Compania getCompania() {
        return compania;
    }

    public void setCompania(Compania compania) {
        this.compania = compania;
    }

    public int getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(int numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public boolean isPrendido() {
        return prendido;
    }

    public void setPrendido(boolean prendido) {
        this.prendido = prendido;
    }

    public boolean isCreditoDisponible() {
        return creditoDisponible;
    }

    public void setCreditoDisponible(boolean creditoDisponible) {
        this.creditoDisponible = creditoDisponible;
    }

    @Override
    public void mensajeApoyo(PartidoPolitico partido) {
        if(creditoDisponible && prendido){
            System.out.println("Conectando con la antena más cercana: ¡Ring ring! voten por "+partido.getNombre());
        } else {
            System.out.println("Credito insuficiente o celular apagado...");
        }
    }
}

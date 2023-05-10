package EjercicioRepaso2;

public class Cheque {
    private ClienteBanco clienteEmisor;
    private ClienteBanco clienteReceptor;
    private double monto;

    public ClienteBanco getClienteEmisor() {
        return clienteEmisor;
    }

    public void setClienteEmisor(ClienteBanco clienteEmisor) {
        this.clienteEmisor = clienteEmisor;
    }

    public ClienteBanco getClienteReceptor() {
        return clienteReceptor;
    }

    public void setClienteReceptor(ClienteBanco clienteReceptor) {
        this.clienteReceptor = clienteReceptor;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public Cheque(){
        clienteEmisor=new ClienteBanco();
        clienteReceptor=new ClienteBanco();
        monto=50000;
    }
    public Cheque(ClienteBanco clienteEmisor, ClienteBanco clienteReceptor, double monto) {
        this.clienteEmisor = clienteEmisor;
        this.clienteReceptor = clienteReceptor;
        this.monto = monto;
    }
}

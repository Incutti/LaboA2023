package EjercicioRepaso2;

import java.util.ArrayList;

public class CuentaCorriente extends CuentaBancaria{
    private ArrayList<Cheque> listaCheques;

    public ArrayList<Cheque> getListaCheques(){
        return listaCheques;
    }
    public void setListaCheuqes(ArrayList<Cheque>listacheques){
        this.listaCheques=listaCheques;
    }
    public CuentaCorriente(){
        super();
        listaCheques=new ArrayList<Cheque>();
    }
    public CuentaCorriente(ClienteBanco titular, int cbu, int numCuenta, String alias, double saldo, ArrayList<Cheque> listaCheques){
        super(titular, cbu, numCuenta, alias, saldo);
        this.listaCheques=listaCheques;
    }

    public void generarCheque(ClienteBanco receptor, double monto){
        Cheque chequeNuevo=new Cheque(super.getTitular(), receptor, monto);
        listaCheques.add(chequeNuevo);
    }
}

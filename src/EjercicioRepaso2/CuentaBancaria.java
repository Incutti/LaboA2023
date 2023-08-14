package EjercicioRepaso2;

import java.util.ArrayList;

public abstract class CuentaBancaria {
    private ClienteBanco titular;
    private int cbu;
    private int numCuenta;
    private String alias;
    private double saldo;


    public ClienteBanco getTitular() {
        return titular;
    }

    public void setTitular(ClienteBanco titular) {
        this.titular = titular;
    }

    public int getCbu() {
        return cbu;
    }

    public void setCbu(int cbu) {
        this.cbu = cbu;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }



    public CuentaBancaria(){
        titular=new ClienteBanco();
        cbu=1234678901;
        numCuenta=547893;
        alias="Juan Perez";
        saldo=60010.99;
    }
    public CuentaBancaria(ClienteBanco titular, int cbu, int numCuenta, String alias, double saldo) {
        this.titular = titular;
        this.cbu = cbu;
        this.numCuenta = numCuenta;
        this.alias = alias;
        this.saldo = saldo;

    }

    public void depositar(int monto){
        saldo+=monto;
    }

    public void retirar(int monto){
        if(monto<=saldo){
            saldo-=monto;
        }else{
            System.out.println("No tiene esa cantidad de dinero.");
        }
    }


}

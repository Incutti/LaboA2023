package EjercicioRepaso2;

import java.util.ArrayList;

public class Banco {
    private ArrayList<CuentaBancaria> listaCuentas;
    public int cbuPorCuil(int cuil){
        int cbu = 0;
        for(CuentaBancaria cuenta:listaCuentas){
            if(cuenta.getTitular().getCuil()==cuil){
                cbu=cuenta.getCbu();
            }
        }
        return cbu;
    }

    public String nombrePorNumCuenta(int numCuenta){
        String nombreTitular="";
        for(CuentaBancaria cuenta : listaCuentas){
            if(cuenta.getNumCuenta()==numCuenta){
                nombreTitular=cuenta.getTitular().getNombre()+" "+cuenta.getTitular().getApellido();
            }
        }
        return nombreTitular;
    }

    public ClienteBanco masJoven(){
        ClienteBanco clienteMasJoven=listaCuentas.get(0).getTitular();
        for(CuentaBancaria cuenta : listaCuentas){
            if(cuenta.getTitular().getEdad()<clienteMasJoven.getEdad()){
                clienteMasJoven=cuenta.getTitular();
            }
        }
        return clienteMasJoven;
    }

    public void masTransferenciasCheque(){
        int cbu=0, mayor=0;
        for(CuentaBancaria cuenta : listaCuentas){
            if(cuenta instanceof CuentaCorriente){
                if( ((CuentaCorriente) cuenta).getListaCheques().size()>mayor){
                    mayor=((CuentaCorriente)cuenta).getListaCheques().size();
                    cbu=cuenta.getCbu();
                }
            }
        }
        System.out.println("El cliente cuyo cbu es " + cbu + ", es el que más transeferencias (" + mayor + ") ha hecho por medio de cheques ");
    }
}

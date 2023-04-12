import Cosas.*;

import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private ArrayList<Vehiculo> listaVehiculos;

    public Empresa(){
        nombre="SaulGoddamn";
        listaVehiculos=new ArrayList<Vehiculo>();
    }

    public Empresa(String nombre, ArrayList<Vehiculo> listaVehiculos) {
        this.nombre = nombre;
        this.listaVehiculos = listaVehiculos;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    public void setListaVehiculos(ArrayList<Vehiculo> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }

    public void CualTieneMas(){
        int contadorAutos=0, contadorCamionetas=0, contadorBicis=0;
        for(Vehiculo vehiculo:listaVehiculos) {
            if (vehiculo.getClass().getName().equals("Auto")){
                contadorAutos++;
            } else if (vehiculo.getClass().getName().equals("Camioneta")){
                contadorCamionetas++;
            } else if (vehiculo.getClass().getName().equals("Bicicleta")){
                contadorBicis++;
            }

        }
            if (contadorAutos < contadorCamionetas && contadorBicis < contadorCamionetas) {
                System.out.println("Hay mas camionetas");
            } else if (contadorAutos > contadorCamionetas && contadorAutos > contadorBicis) {
                System.out.println("Hay mas autos");
            } else {
                System.out.println("Hay la misma cantidad de autos que de camionetas");
            }

    }

    public void porcentajeAutosDescapotables(){
        int contador=0;
        int contadorAuto=0;
        for (Vehiculo vehiculo: listaVehiculos) {
            if (vehiculo instanceof Auto){
                contadorAuto++;
                if (((Auto)vehiculo).isDescapotable()) {
                    contador++;
                }
            }
        }
        System.out.println("Su empresa cuenta con el " + (contador*100)/contadorAuto + "% de autos descapotables");
    }
}

import Cosas.*;

import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private ArrayList<Auto> listaAutos;
    private ArrayList<Camioneta> listaCamionetas;

    public Empresa(){
        nombre="SaulGoddamn";
        listaAutos = new ArrayList<Auto>();
        listaCamionetas = new ArrayList<Camioneta>();
    }
    public Empresa(String nombre, ArrayList<Auto> listaAutos, ArrayList<Camioneta> listaCamionetas) {
        this.nombre = nombre;
        this.listaAutos = listaAutos;
        this.listaCamionetas = listaCamionetas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Auto> getListaAutos() {
        return listaAutos;
    }

    public void setListaAutos(ArrayList<Auto> listaAutos) {
        this.listaAutos = listaAutos;
    }

    public ArrayList<Camioneta> getListaCamionetas() {
        return listaCamionetas;
    }

    public void setListaCamionetas(ArrayList<Camioneta> listaCamionetas) {
        this.listaCamionetas = listaCamionetas;
    }

    public void CualTieneMas(){
        if(listaAutos.size()<listaCamionetas.size()){
            System.out.println("Hay mas camionetas");
        } else if (listaAutos.size()>listaCamionetas.size()){
            System.out.println("Hay mas autos");
        } else {
            System.out.println("Hay la misma cantidad de autos que de camionetas");
        }
    }

    public void porcentajeAutosDescapotables(){
        int contador=0;
        for(Auto auto : listaAutos){
            if(auto.isDescapotable()){
                contador++;
            }
        }
        System.out.println("Su empresa cuenta con el " + (contador*100)/listaAutos.size() + "% de autos descapotables");
    }
}

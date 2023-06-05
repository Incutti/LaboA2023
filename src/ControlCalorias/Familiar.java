package ControlCalorias;

import Cosas.Plato;
import Humanos.Persona;
import tiempo.Fecha;

import java.util.ArrayList;

public class Familiar extends Persona {
    ArrayList<Plato>alimentosIngeridos;
    public Familiar(){
        super();
        alimentosIngeridos=new ArrayList<>();
    }
    public Familiar(String nombre, Fecha fechaDeNacimiento, ArrayList<Plato>alimentosIngeridos){
        super(nombre, fechaDeNacimiento);
        this.alimentosIngeridos=alimentosIngeridos;
    }

    public int consultarCalorias(){
        int contCalorias=0;
        for(Plato plato:alimentosIngeridos){
            contCalorias += plato.getCalorias();
        }
        return contCalorias;
    }
}

package ControlCalorias;

import Humanos.Persona;

import java.util.HashSet;

public class Familia {
    private HashSet<Familiar> familiares;

    public Familia() {
        familiares=new HashSet<>();
    }

    public Familia(HashSet<Familiar> familiares) {
        this.familiares = familiares;
    }

    public HashSet<Familiar> getFamiliares() {
        return familiares;
    }

    public void setFamiliares(HashSet<Familiar> familiares) {
        this.familiares = familiares;
    }

    public double promedioCalorias (){
        double contador=0;
        for (Familiar familiar:familiares){
            contador+=familiar.consultarCalorias();
        }
        contador/=familiares.size();
        return contador;
    }
    public Familiar masCalorias (){
        int contador=0;
        Familiar masGordo=new Familiar();
        for (Familiar familiar:familiares){
            if (familiar.consultarCalorias()>contador){
                contador=familiar.consultarCalorias();
                masGordo=familiar;
            }
        }
        return masGordo;
    }

    public Familiar menosCalorias (){
        int contador=0;
        Familiar desnutrido=new Familiar();
        for (Familiar familiar:familiares){
            if (familiar.consultarCalorias()<contador || contador==0){
                contador= familiar.consultarCalorias();
                desnutrido=familiar;
            }
        }
        return desnutrido;
    }
}

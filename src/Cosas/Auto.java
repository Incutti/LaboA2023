package Cosas;

import Enums.Color;

public class Auto extends Vehiculo{

    private int velocidad;
    private String patente;
    private boolean descapotable;


    public Auto() {
        super();
        velocidad= 0;
        patente="AD490XD";
        descapotable=false;
    }
    public Auto(String marca, String modelo, Color color, int velocidad, String patente, boolean descapotable) {
        super(marca, modelo, color);
        this.velocidad= velocidad;
        this.patente = patente;
        this.descapotable=descapotable;
    }

    public boolean isDescapotable() {
        return descapotable;
    }

    public void setDescapotable(boolean descapotable) {
        this.descapotable = descapotable;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int acelerar(){
        velocidad++;
        return velocidad;
    }
    public int frenar() {
        if (velocidad > 0) {

            velocidad--;
        }
        return velocidad;
    }
    public void mostrarVelocidad(){
        System.out.println(velocidad);
    }



}


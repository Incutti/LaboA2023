package Cosas;

import Enums.Color;

public class Vehiculo {
    private String marca, modelo;
    private Color color;
    private int cantidadRuedas , anioFabricacion;

    public Vehiculo (){
        marca="Mercedes";
        modelo="AMG1";
        color=Color.ROJO;
        cantidadRuedas=4;
        anioFabricacion=2021;
    }
    public Vehiculo(String marca, String modelo, Color color, int cantidadRuedas, int anioFabricacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.cantidadRuedas = cantidadRuedas;
        this.anioFabricacion = anioFabricacion;
    }
    public Vehiculo(String marca, String modelo, Color color){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getCantidadRuedas() {
        return cantidadRuedas;
    }

    public void setCantidadRuedas(int cantidadRuedas) {
        this.cantidadRuedas = cantidadRuedas;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }



}

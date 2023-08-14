package Cosas;

import Enums.Color;

public class Bicicleta extends Vehiculo{
    private static int cantRuedas=2;

    public Bicicleta (String marca, String modelo, Color color, int anioFabricacion){
        super(marca, modelo, color,anioFabricacion);

    }
    public static int getCantRuedas() {
        return cantRuedas;
    }
    public static void setCantRuedas(int cantRuedas) {
        Bicicleta.cantRuedas = cantRuedas;
    }
}

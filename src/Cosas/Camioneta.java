package Cosas;

import Enums.Color;

public class Camioneta extends Vehiculo{
    private String patente;
    private int capacidadCargaEnKG;
    private int cargaActualEnKG;
    private static int cantRuedas=4;

    public Camioneta(){
        super();
        patente="GT466IV";
        capacidadCargaEnKG=3;
        cargaActualEnKG=0;
    }
    public Camioneta(String marca, String modelo, Color color, String patente, int capacidadCargaEnKG, int cargaActualEnKG){
        super(marca, modelo, color);
        this.patente=patente;
        this.capacidadCargaEnKG=capacidadCargaEnKG;
        this.cargaActualEnKG=cargaActualEnKG;
    }

    public int getCargaActualEnKG() {
        return cargaActualEnKG;
    }

    public void setCargaActualEnKG(int cargaActualEnKG) {
        this.cargaActualEnKG = cargaActualEnKG;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getCapacidadCargaEnKG() {
        return capacidadCargaEnKG;
    }

    public void setCapacidadCargaEnKG(int capacidadCargaEnKG) {
        this.capacidadCargaEnKG = capacidadCargaEnKG;
    }

    public static int getCantRuedas() {
        return cantRuedas;
    }

    public static void setCantRuedas(int cantRuedas) {
        Camioneta.cantRuedas = cantRuedas;
    }

    public void aniadirCarga(int cargaAAniadirEnKg){
        if(cargaAAniadirEnKg>0) {
            cargaActualEnKG = cargaActualEnKG + cargaAAniadirEnKg;
            if (cargaActualEnKG > capacidadCargaEnKG) {
                cargaActualEnKG = capacidadCargaEnKG;
                System.out.println("El vehiculo no ha resistido a la carga (en KG)");
            } else {
                System.out.println("La carga ha sido añadida en su totalidad exitosamente!");
            }
        } else {
            System.out.println("No ingreses una carga negativa porfa");
        }
    }
}

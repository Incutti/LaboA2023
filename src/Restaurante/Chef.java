package Restaurante;

import Humanos.Persona;

public class Chef extends Persona {
    private boolean experienciaAnterior;

    public Chef(String nombre, int edad, boolean experienciaAnterior) {
        super(nombre, edad);
        this.experienciaAnterior = experienciaAnterior;
    }

    public boolean isExperienciaAnterior() {
        return experienciaAnterior;
    }

    public void setExperienciaAnterior(boolean experienciaAnterior) {
        this.experienciaAnterior = experienciaAnterior;
    }
}

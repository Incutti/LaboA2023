package organizacionPartidoPolitico;

import Enums.Color;

public abstract class Ave {
    private String nombre;
    private String especie;
    private Color color;

    public Ave(String nombre, String especie, Color color) {
        this.nombre = nombre;
        this.especie = especie;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}

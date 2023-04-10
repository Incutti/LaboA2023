package Cosas;

import java.util.ArrayList;

public class CD {
    private ArrayList<Cancion> canciones;

    public CD() {
        canciones = new ArrayList<Cancion>();
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    int numeroCanciones() {
        int contador = 0;
        for (Cancion cancion : canciones) {
            contador++;
        }
        return contador;
    }

    Cancion verCancion(int posicion) {
        return canciones.get(posicion);
    }

    void grabaCancion(int posicion, Cancion nuevaCancion) {
        canciones.set(posicion, nuevaCancion);
    }

    void agrega(Cancion cancion) {
        canciones.add(cancion);
    }

    void elimina(int posicion) {
        canciones.remove(posicion);
    }
}
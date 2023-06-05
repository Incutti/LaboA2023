package ABMLugares;

import java.util.ArrayList;
import java.util.HashSet;

public class Lugar {
    private String nombre;
    private int codigo;
    private HashSet<Coordenadas> coordenadas;

    public Lugar(){
        nombre="zurucuchito";
        codigo=1136575;
        coordenadas=new HashSet<>();
    }

    public Lugar(String nombre, int codigo, HashSet<Coordenadas> coordenadas) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.coordenadas = coordenadas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public HashSet<Coordenadas> getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(HashSet<Coordenadas> coordenadas) {
        this.coordenadas = coordenadas;
    }
    public int consultaPoblacion(){
        return 0;
    }


}

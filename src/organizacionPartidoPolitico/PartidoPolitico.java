package organizacionPartidoPolitico;

import java.util.HashSet;

public class PartidoPolitico {
    private String nombre;
    private String direccionOficinaCentral;
    private int cantAfiliados;
    HashSet<Mensajeria>enviadoresMensajes;

    public PartidoPolitico(String nombre, String direccionOficinaCentral, int cantAfiliados, HashSet<Mensajeria> enviadoresMensajes) {
        this.nombre = nombre;
        this.direccionOficinaCentral = direccionOficinaCentral;
        this.cantAfiliados = cantAfiliados;
        this.enviadoresMensajes = enviadoresMensajes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccionOficinaCentral() {
        return direccionOficinaCentral;
    }

    public void setDireccionOficinaCentral(String direccionOficinaCentral) {
        this.direccionOficinaCentral = direccionOficinaCentral;
    }

    public int getCantAfiliados() {
        return cantAfiliados;
    }

    public void setCantAfiliados(int cantAfiliados) {
        this.cantAfiliados = cantAfiliados;
    }

    public HashSet<Mensajeria> getEnviadoresMensajes() {
        return enviadoresMensajes;
    }

    public void setEnviadoresMensajes(HashSet<Mensajeria> enviadoresMensajes) {
        this.enviadoresMensajes = enviadoresMensajes;
    }
}

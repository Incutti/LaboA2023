package FutbolArgentino;

public interface Contrato {
    void contratar(Equipo equipo);
    void renovar();
    boolean verificarPosibilidadContratacion();
    void verificarPosibilidadRenovacion() throws MuyViejoExeption;
}

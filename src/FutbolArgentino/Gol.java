package FutbolArgentino;

public class Gol {
    private JugadorFutbol goleador;
    private JugadorFutbol asistidor;
    private int minuto;

    public Gol(JugadorFutbol goleador, JugadorFutbol asistidor, int minuto) {
        this.goleador = goleador;
        this.asistidor = asistidor;
        this.minuto = minuto;
    }

    public JugadorFutbol getGoleador() {
        return goleador;
    }

    public void setGoleador(JugadorFutbol goleador) {
        this.goleador = goleador;
    }

    public JugadorFutbol getAsistidor() {
        return asistidor;
    }

    public void setAsistidor(JugadorFutbol asistidor) {
        this.asistidor = asistidor;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }
}

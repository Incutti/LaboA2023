package FutbolArgentino;

public class Gol {
    private JugadorCampo goleador;
    private JugadorCampo asistidor;
    private int minuto;

    public Gol(JugadorCampo goleador, JugadorCampo asistidor, int minuto) {
        this.goleador = goleador;
        this.asistidor = asistidor;
        this.minuto = minuto;
    }

    public JugadorCampo getGoleador() {
        return goleador;
    }

    public void setGoleador(JugadorCampo goleador) {
        this.goleador = goleador;
    }

    public JugadorCampo getAsistidor() {
        return asistidor;
    }

    public void setAsistidor(JugadorCampo asistidor) {
        this.asistidor = asistidor;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }
}

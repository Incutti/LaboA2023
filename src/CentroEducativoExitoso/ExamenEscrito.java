package CentroEducativoExitoso;

import java.time.LocalDate;

public class ExamenEscrito extends Examen {
    private static int duracion=90;
    private int nota;

    public ExamenEscrito(LocalDate fechaRealzacion, int nota) {
        super(fechaRealzacion);
        this.nota=nota;
    }


    public static int getDuracion() {
        return duracion;
    }

    public static void setDuracion(int duracion) {
        ExamenEscrito.duracion = duracion;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public boolean calcularAprobacion() {
        return nota >= 6;
    }
}

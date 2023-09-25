package CentroEducativoExitoso;

import java.time.LocalDate;

public class ExamenOral extends Examen {
    private NivelSatisfaccion nivelSatisfaccion;

    public ExamenOral(LocalDate fechaRealzacion, NivelSatisfaccion nivelSatisfaccion) {
        super(fechaRealzacion);
        this.nivelSatisfaccion = nivelSatisfaccion;
    }

    public NivelSatisfaccion getNivelSatisfaccion() {
        return nivelSatisfaccion;
    }

    public void setNivelSatisfaccion(NivelSatisfaccion nivelSatisfaccion) {
        this.nivelSatisfaccion = nivelSatisfaccion;
    }

    @Override
    public boolean calcularAprobacion() {
        return !(nivelSatisfaccion.equals(NivelSatisfaccion.INSUFICIENTE));
    }

}

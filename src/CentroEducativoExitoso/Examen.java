package CentroEducativoExitoso;

import java.time.LocalDate;

public abstract class Examen implements Aprobacion {
    private LocalDate fechaRealizacion;

    public Examen(LocalDate fechaRealzacion) {
        this.fechaRealizacion = fechaRealzacion;
    }

    public LocalDate getFechaRealzacion() {
        return fechaRealizacion;
    }

    public void setFechaRealzacion(LocalDate fechaRealzacion) {
        this.fechaRealizacion = fechaRealzacion;
    }


}

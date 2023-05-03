package Telefonia;
import tiempo.Fecha;

public class Llamada {
    private Empleado empOrigen;
    private Empleado empDestino;
    private Fecha fechaLlamada;
    private int duracion;

    public Llamada(){
        empOrigen = new Empleado();
        empDestino = new Empleado();
        fechaLlamada = new Fecha();
        duracion=80000;
    }
    public Llamada(Empleado empOrigen, Empleado empDestino, Fecha fechaLlamada, int duracion) {
        this.empOrigen = empOrigen;
        this.empDestino = empDestino;
        this.fechaLlamada = fechaLlamada;
        this.duracion = duracion;
    }

    public Empleado getEmpOrigen() {
        return empOrigen;
    }

    public void setEmpOrigen(Empleado empOrigen) {
        this.empOrigen = empOrigen;
    }

    public Empleado getEmpDestino() {
        return empDestino;
    }

    public void setEmpDestino(Empleado empDestino) {
        this.empDestino = empDestino;
    }

    public Fecha getFechaLlamada() {
        return fechaLlamada;
    }

    public void setFechaLlamada(Fecha fechaLlamada) {
        this.fechaLlamada = fechaLlamada;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
}

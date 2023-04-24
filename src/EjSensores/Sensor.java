package EjSensores;

public class Sensor {
    private boolean estado; // 0=desconectafo | 1=conectado
    private double valor;
    private double umbral;
    private int anioAdquisicion;

    public Sensor() {
        estado=false;
        valor=0;
        umbral=100;
        anioAdquisicion=2000;

    }

    public Sensor(boolean estado, double valor, double umbral, int anioAdquisicion) {
        this.estado = estado;
        if (estado){
            this.valor = valor;
        } else{
            valor=0;
        }
        this.umbral = umbral;
        this.anioAdquisicion = anioAdquisicion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getUmbral() {
        return umbral;
    }

    public void setUmbral(double umbral) {
        this.umbral = umbral;
    }

    public int getAnioAdquisicion() {
        return anioAdquisicion;
    }

    public void setAnioAdquisicion(int anioAdquisicion) {
        this.anioAdquisicion = anioAdquisicion;
    }


}

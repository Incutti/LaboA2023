import Humanos.Persona;
import tiempo.Fecha;

public class Profesor extends Persona {
    private int porcentajeDescuento;

    public Profesor(String nombre, String apellido, int porcentajeDescuento) {
        super(nombre, apellido);
        if(porcentajeDescuento<=100 && porcentajeDescuento>=0) {
            this.porcentajeDescuento = porcentajeDescuento;
        } else if(porcentajeDescuento>100){
            this.porcentajeDescuento=100;
        } else{
            porcentajeDescuento=0;
        }
    }
    public Profesor(){
        super("Bautista", "Guerrero");
        porcentajeDescuento=75;
    }
}

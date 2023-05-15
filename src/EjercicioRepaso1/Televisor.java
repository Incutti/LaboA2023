package EjercicioRepaso1;

import Enums.TecnologiaPantalla;

public class Televisor extends SeccionMultimedia{
    private TecnologiaPantalla tecnologiaUtilizada;
    private int pixelesAlto;
    private int pixelesAncho;

    public TecnologiaPantalla getTecnologiaUtilizada(){
        return tecnologiaUtilizada;
    }
    public void setTecnologiaUtilizada(TecnologiaPantalla tecnologiaUtilizada ){
        this.tecnologiaUtilizada=tecnologiaUtilizada;
    }

    public int getPixelesAlto() {
        return pixelesAlto;
    }

    public void setPixelesAlto(int pixelesAlto) {
        this.pixelesAlto = pixelesAlto;
    }

    public int getPixelesAncho() {
        return pixelesAncho;
    }

    public void setPixelesAncho(int pixelesAncho) {
        this.pixelesAncho = pixelesAncho;
    }
    public Televisor(){
        super();
        tecnologiaUtilizada=TecnologiaPantalla.FULLHD;
        pixelesAlto=1080;
        pixelesAncho=1920;
    }

    public Televisor(String nombre, double precio, int stock, TecnologiaPantalla tecnologiaUtilizada, int pixelesAlto, int pixelesAncho) {
        super(nombre, precio, stock);
        this.tecnologiaUtilizada = tecnologiaUtilizada;
        this.pixelesAlto = pixelesAlto;
        this.pixelesAncho = pixelesAncho;
    }
}

package EjercicioRepaso1;

public class Televisor extends SeccionMultimedia{
    private String tecnologiaUtilizada;
    private int pixelesAlto;
    private int pixelesAncho;

    public String getTecnologiaUtilizada(){
        return tecnologiaUtilizada;
    }
    public void setTecnologiaUtilizada(String tecnologiaUtilizada ){
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
        tecnologiaUtilizada="FullHD";
        pixelesAlto=1080;
        pixelesAncho=1920;
    }

    public Televisor(String nombre, double precio, int stock, String tecnologiaUtilizada, int pixelesAlto, int pixelesAncho) {
        super(nombre, precio, stock);
        this.tecnologiaUtilizada = tecnologiaUtilizada;
        this.pixelesAlto = pixelesAlto;
        this.pixelesAncho = pixelesAncho;
    }
}

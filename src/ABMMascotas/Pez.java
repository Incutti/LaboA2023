package ABMMascotas;

public class Pez extends Animal {
    private static int vidasIniciales=10;
    private int vidasActuales;

    public Pez(){
        super();
        vidasActuales=vidasIniciales;
    }

    @Override
    public String saludo(boolean esDuenio){

        if(esDuenio){
            vidasActuales-=1;

            if(vidasActuales>0){

                return "Le quedan "+vidasActuales+" vidas";
            } else {
                return getNombre() + " ha muerto";
            }
        } else {
            setVidasActuales(0);
            return getNombre() + " ha muerto";
        }

    } // hay q arreglar bien el metodo y en main tb

    @Override
    public void alimentar() {
        vidasActuales+=1;
    }

    @Override
    public String tipo() {
        return null;
    }

    public Pez(int vidasActuales) {
        this.vidasActuales = vidasActuales;
    }

    public static int getVidasIniciales() {
        return vidasIniciales;
    }

    public static void setVidasIniciales(int vidasIniciales) {
        Pez.vidasIniciales = vidasIniciales;
    }

    public int getVidasActuales() {
        return vidasActuales;
    }

    public void setVidasActuales(int vidasActuales) {
        this.vidasActuales = vidasActuales;
    }
}

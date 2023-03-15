public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha() {
        this.dia = 1;
        this.mes = 1;
        this.anio = 1900;
    }
    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        valida();
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    void valida(){
        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12 -> {
                if (dia < 1 || dia > 31) {
                    dia = 1;
                }
            }
            case 4, 6, 9, 11 -> {
                if (dia < 1 || dia > 30) {
                    dia = 1;
                }
            }
            default -> {
                if (dia < 1 || dia > 28) {
                    dia = 1;
                }
            }
        }
        if(mes<1 || mes>12){
            mes=1;
        }
        if (anio<1000 || anio>9999){
            anio=1900;
        }
    }
    int diasMes(int mes){
        int cantDias;
        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12 -> {
                cantDias=31;
            }
            case 4, 6, 9, 11 -> {
                cantDias=30;
            }
            default -> {
                cantDias=28;
            }
        }
        return cantDias;
    }

}

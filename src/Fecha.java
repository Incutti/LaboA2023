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
    void corta(){
        valida();
        System.out.println(dia + "-" + mes + "-" + anio);
    }
    void larga(){
        valida();
        String mesLetra = switch (mes) {
            case 1 -> "Enero";
            case 2 -> "Febrero";
            case 3 -> "Marzo";
            case 4 -> "Abril";
            case 5 -> "Mayo";
            case 6 -> "Junio";
            case 7 -> "Julio";
            case 8 -> "Agosto";
            case 9 -> "Septiembre";
            case 10 -> "Octubre";
            case 11 -> "Noviembre";
            default -> "Diciembre";
        };
        System.out.println(dia + " de " + mesLetra + " de " + anio);
    }

    void siguiente(){
        valida();
        int cantDias=diasMes(mes);
        if(cantDias==dia){
            dia=1;
            mes++;
        }
        else{
            dia++;
        }
    }
    void anterior(){
        valida();
        int cantDias=diasMes(mes);
        if(dia==1){
            dia=cantDias;
            mes--;
        }
        else {
            dia--;
        }
    }
    void igualQue(Fecha fecha){
        valida();
        int anio1 = fecha.anio;
        int mes1  = fecha.mes;
        int dia1  = fecha.dia;
        if(anio == anio1 && mes == mes1 && dia == dia1) System.out.println("Las fechas son iguales");
        else System.out.println("Las fechas no son iguales");
    }
    void menorQue(Fecha fecha){
        valida();
        int anio1 = fecha.anio;
        int mes1  = fecha.mes;
        int dia1  = fecha.dia;
        if(anio < anio1)System.out.println("La fecha es menor");
        else if (anio1 == anio && mes < mes1) System.out.println("La fecha es menor");
        else if (anio1 == anio && mes == mes1 && dia < dia1) System.out.println("La fecha es menor");
        else System.out.println("La fecha no es menor");
    }
    void mayorQue(Fecha fecha){
        valida();
        int anio1 = fecha.anio;
        int mes1  = fecha.mes;
        int dia1  = fecha.dia;
        if(anio > anio1)System.out.println("La fecha es mayor");
        else if (anio1 == anio && mes > mes1) System.out.println("La fecha es mayor");
        else if (anio1 == anio && mes == mes1 && dia > dia1) System.out.println("La fecha es mayor");
        else System.out.println("La fecha no es mayor");
    }
}

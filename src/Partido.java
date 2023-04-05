import java.util.ArrayList;

public class Partido {
    private Equipo equipo1;
    private Equipo equipo2;
    private String dia;
    private String hora;

    public Partido(Equipo equipo1, Equipo equipo2, String dia, String hora) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.dia = dia;
        this.hora = hora;
    }

    public Partido() {
        equipo1 = new Equipo();
        equipo2 = new Equipo("Chanchos","Villa Urquiza", new ArrayList<Jugador>(), 2, "mañana",new ArrayList<Boolean>() );
        dia = "lunes";
        hora = "mañana";
    }

    public Partido(Equipo equipo1, Equipo equipo2){
        if(equipo1.getHoraDisponible().equals(equipo2.getHoraDisponible())){
            for(int i=0; i<6; i++) {
                if (equipo1.getDiaDisponible().get(i) ==equipo2.getDiaDisponible().get(i)){
                    switch (i){
                        case 1:
                            dia="Lunes";
                            break;

                        case 2:
                            dia="Martes";
                            break;

                        case 3:
                            dia="Miercoles";
                            break;

                        case 4:
                            dia="Jueves";
                            break;

                        case 5:
                            dia="Viernes";
                            break;
                        default:
                            dia="Sabado";
                            break;
                    }
                }else{ dia="Sabado"; }
            }
            if(equipo1.getHoraDisponible().equals("mañana")){
                hora = "mañana";
            } else if (equipo1.getHoraDisponible().equals("tarde")) {
                hora = "tarde";
            } else if(equipo1.getHoraDisponible().equals("noche")) {
                hora = "noche";
            }
        }
    }

    public Equipo getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(Equipo equipo1) {
        this.equipo1 = equipo1;
    }

    public Equipo getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(Equipo equipo2) {
        this.equipo2 = equipo2;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
}

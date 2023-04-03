import java.util.ArrayList;

public class Campeonato {
    private ArrayList<Partido> listaDePartidos;
    private ArrayList<Equipo> listaDeEquipos;

    public Campeonato(){
        listaDeEquipos=new ArrayList<Equipo>();
        listaDePartidos=new ArrayList<Partido>();
    }
    public Campeonato(ArrayList<Partido> listaDePartidos, ArrayList<Equipo> listaDeEquipos) {
        this.listaDePartidos = listaDePartidos;
        this.listaDeEquipos = listaDeEquipos;
    }

    public ArrayList<Partido> getListaDePartidos() {
        return listaDePartidos;
    }

    public void setListaDePartidos(ArrayList<Partido> listaDePartidos) {
        this.listaDePartidos = listaDePartidos;
    }

    public ArrayList<Equipo> getListaDeEquipos() {
        return listaDeEquipos;
    }

    public void setListaDeEquipos(ArrayList<Equipo> listaDeEquipos) {
        this.listaDeEquipos = listaDeEquipos;
    }

    public Boolean validacionEquipo(Equipo nuevoEquipo){
        boolean puedeEntrar=true;
        for(Equipo equipo : listaDeEquipos){
            if(nuevoEquipo.getNombreEquipo().equals(equipo.getNombreEquipo())){
                puedeEntrar=false;
            }
        }
        return puedeEntrar;
    }
    public void agregarEquipo(Equipo nuevoEquipo){
        boolean puedeEntrar= validacionEquipo(nuevoEquipo);
        if (puedeEntrar) {
            listaDeEquipos.add(nuevoEquipo);
        } else {
            System.out.println("Ya hay un equipo con ese nombre, buscate otro torneo papá.");
        }
    }

}
// (cantequipos/2) ->partidos x fecha -------- (cantequipos/2)*(cantequipos-1) ->partidos totales
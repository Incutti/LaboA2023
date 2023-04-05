import com.sun.xml.internal.ws.wsdl.writer.document.Part;

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

    public void armarFixture(){
        for(int i=0;i<listaDeEquipos.size()-1;i++){
            for (int j=i++;j<listaDeEquipos.size();j++) {
                Partido partido = new Partido(listaDeEquipos.get(i), listaDeEquipos.get(j));
                listaDePartidos.add(partido);
            }
        }
    }
}
// (cantequipos/2) ->partidos x fecha -------- (cantequipos/2)*(cantequipos-1) ->partidos totales
    /*
    public ArrayList<Integer> corroborarHorario(){
        ArrayList<Integer> horarios = new ArrayList<>();
        int maniana=0, tarde=0, noche=0;
        for (Equipo listaDeEquipo : listaDeEquipos) {
            switch (listaDeEquipo.getHoraDisponible()) {
                case "mañana":
                    maniana++;
                    break;
                case "tarde":
                    tarde++;
                    break;
                case "noche":
                    noche++;
                    break;
            }
        }
        horarios.add(maniana);
        horarios.add(tarde);
        horarios.add(noche);
        return horarios;
    }
    */

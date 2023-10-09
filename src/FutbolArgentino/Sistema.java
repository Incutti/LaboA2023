package FutbolArgentino;

import PASO.Provincia;
import tiempo.Fecha;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;

public class Sistema {
    private HashSet<Partido>partidos;
    private HashSet<Equipo>equipos;

    public Sistema() {
        partidos=new HashSet<>();
    }

    public Sistema(HashSet<Partido> partidos, HashSet<Equipo> equipos) {
        this.partidos = partidos;
        this.equipos = equipos;
    }

    public HashSet<Partido> getPartidos() {
        return partidos;
    }

    public void setPartidos(HashSet<Partido> partidos) {
        this.partidos = partidos;
    }

    public HashSet<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(HashSet<Equipo> equipos) {
        this.equipos = equipos;
    }
    public void agregarPartido(Partido partidoNuevo){
        partidos.add(partidoNuevo);
        actualizarCantidadPartidos(partidoNuevo.getEquipoLocal());
        actualizarCantidadPartidos(partidoNuevo.getEquipoVisitante());
        actualizarGolesJugador(partidoNuevo);
        actualizarAtajadas(partidoNuevo);
    }
    public void actualizarGolesJugador(Partido partido){
        for (Gol gol: partido.getGolesEquipoLocal()){
            actualizarJugador(gol);
        }
        for (Gol gol: partido.getGolesEquipoVisitante()){
            actualizarJugador(gol);
        }
    }

    public void actualizarJugador(Gol gol){
        gol.getGoleador().setCantGoles(+1);
        gol.getAsistidor().setCantAsistencias(+1);
        gol.getGoleador().actualizarPorcentaje();
    }

    public void actualizarAtajadas (Partido partido){
        for(JugadorFutbol jugador:partido.getEquipoLocal().getJugadores()){
            if(jugador instanceof Arquero){
                ((Arquero) jugador).setGolesRecibidos(+partido.getGolesEquipoVisitante().size());
                ((Arquero) jugador).setAtajadas(+(partido.getCantTirosAPuertaVisitante()-partido.getGolesEquipoVisitante().size()));
                ((Arquero) jugador).setTirosHistoricos(+partido.getCantTirosAPuertaVisitante());
                ((Arquero) jugador).setPorcentajeAtajadas((double) ( ((Arquero)jugador).getAtajadas() * 100) / ((Arquero)jugador).getTirosHistoricos()  );
            }
        }
        for(JugadorFutbol jugador:partido.getEquipoVisitante().getJugadores()){
            if(jugador instanceof Arquero){
                ((Arquero) jugador).setGolesRecibidos(+partido.getGolesEquipoLocal().size());
                ((Arquero) jugador).setAtajadas(+(partido.getCantTirosAPuertaLocal()-partido.getGolesEquipoLocal().size()));
                ((Arquero) jugador).setTirosHistoricos(+partido.getCantTirosAPuertaLocal());
                ((Arquero) jugador).setPorcentajeAtajadas((double) ( ((Arquero)jugador).getAtajadas() *  100) / ((Arquero)jugador).getTirosHistoricos() );
            }
        }
    }

    public void actualizarCantidadPartidos(Equipo equipo){
        for(JugadorFutbol jugador:equipo.getJugadores()){
            jugador.setCantPartidos(+1);
        }
    }

    public static void main(String[] args) {
        Sistema s1=new Sistema();
        HashSet<Equipo>equipos=new HashSet<>();

        Equipo e1=new Equipo("",new HashSet<>());
        Equipo e2=new Equipo("sacachispas",new HashSet<>());
        Equipo e3=new Equipo("rioCuarto",new HashSet<>());

        JugadorCampo j1=new JugadorCampo("nombre1",new Fecha(), Provincia.CHACO,new HashSet<>(),1,0,0,e1,0,0);
        JugadorCampo j2=new JugadorCampo("nombre2",new Fecha(), Provincia.RIO_NEGRO,new HashSet<>(),2,0,0,e1,0,0);
        JugadorCampo j3=new JugadorCampo("nombre3",new Fecha(), Provincia.BUENOS_AIRES,new HashSet<>(),3,0,0,e1,0,0);
        JugadorCampo j4=new JugadorCampo("nombre4",new Fecha(), Provincia.CABA,new HashSet<>(),4,0,0,e2,0,0);
        JugadorCampo j5=new JugadorCampo("nombre5",new Fecha(), Provincia.CABA,new HashSet<>(),5,0,0,e2,0,0);
        JugadorCampo j6=new JugadorCampo("nombre6",new Fecha(), Provincia.CABA,new HashSet<>(),6,0,0,e2,0,0);
        JugadorCampo j7=new JugadorCampo("nombre7",new Fecha(), Provincia.CABA,new HashSet<>(),7,0,0,e3,0,0);
        JugadorCampo j8=new JugadorCampo("nombre8",new Fecha(), Provincia.CABA,new HashSet<>(),8,0,0,e3,0,0);
        JugadorCampo j9=new JugadorCampo("nombre9",new Fecha(), Provincia.CABA,new HashSet<>(),9,0,0,e3,0,0);

        Arquero a1=new Arquero("nombre1arq",new Fecha(),Provincia.BUENOS_AIRES,new HashSet<>(),10,0,e1,0,0);
        Arquero a2=new Arquero("nombre2arq",new Fecha(),Provincia.BUENOS_AIRES,new HashSet<>(),11,0, e2,0,0);
        Arquero a3=new Arquero("nombre3arq",new Fecha(),Provincia.BUENOS_AIRES,new HashSet<>(),12,0,e3,0,0);

        HashSet<JugadorFutbol> jugadores1=new HashSet<>();
        HashSet<JugadorFutbol> jugadores2=new HashSet<>();
        HashSet<JugadorFutbol> jugadores3=new HashSet<>();

        jugadores1.add(j1);
        jugadores1.add(j2);
        jugadores1.add(j3);
        jugadores1.add(a1);

        jugadores2.add(j4);
        jugadores2.add(j5);
        jugadores2.add(j6);
        jugadores2.add(a2);

        jugadores3.add(j7);
        jugadores3.add(j8);
        jugadores3.add(j9);
        jugadores3.add(a3);

        e1.setJugadores(jugadores1);
        e2.setJugadores(jugadores2);
        e3.setJugadores(jugadores3);

        equipos.add(e1);
        equipos.add(e2);
        equipos.add(e3);

        Gol g1=new Gol(j1,j2,5);
        ArrayList<Gol>goles1=new ArrayList<>();
        goles1.add(g1);

        Partido p1=new Partido(e1,e2, LocalDateTime.now(),goles1,new ArrayList<>(),5,1);
        Partido p2=new Partido(e1,e3, LocalDateTime.now(),goles1,new ArrayList<>(),3,7);

        s1.agregarPartido(p1);
        s1.agregarPartido(p2);

        a2.contratar(e1);
        a2.renovar();
        a2.contratar(e2);
        a2.contratar(e1);
    }
}

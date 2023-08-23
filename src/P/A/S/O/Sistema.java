package P.A.S.O;



import java.util.HashSet;

public class Sistema {
    private HashSet<Votante>padron;
    private HashSet<PartidoPolitico>listaPartidos;

    public Sistema(HashSet<Votante> padron, HashSet<PartidoPolitico> listaPartidos) {
        this.padron = padron;
        this.listaPartidos = listaPartidos;
    }

    public HashSet<Votante> getPadron() {
        return padron;
    }

    public void setPadron(HashSet<Votante> padron) {
        this.padron = padron;
    }

    public HashSet<PartidoPolitico> getListaPartidos() {
        return listaPartidos;
    }

    public void setListaPartidos(HashSet<PartidoPolitico> listaPartidos) {
        this.listaPartidos = listaPartidos;
    }

    public void votar(Votante votante, Candidato candidato){
        if(!(votante.isYaVoto())){
            candidato.getVotosPorProvincia().put(votante.getProvinciaOrigen().toString(),/*sumar un voto*/)
        }
    }
    
}

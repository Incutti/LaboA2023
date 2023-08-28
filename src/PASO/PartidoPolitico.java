package P.A.S.O;

import static P.A.S.O.NombrePartido.EL_POLI_AVANZA;

public class PartidoPolitico {
    private NombrePartido nombre;
    private Candidato candidatoRepresentante;

    public PartidoPolitico() {
        nombre=EL_POLI_AVANZA;
        candidatoRepresentante=new Candidato();
    }

    public PartidoPolitico(NombrePartido nombre, Candidato candidatoRepresentante) {
        this.nombre = nombre;
        this.candidatoRepresentante = candidatoRepresentante;
    }

    public NombrePartido getNombre() {
        return nombre;
    }

    public void setNombre(NombrePartido nombre) {
        this.nombre = nombre;
    }

    public Candidato getCandidatoRepresentante() {
        return candidatoRepresentante;
    }

    public void setCandidatoRepresentante(Candidato candidatoRepresentante) {
        this.candidatoRepresentante = candidatoRepresentante;
    }
}

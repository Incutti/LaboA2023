package PASO;



import tiempo.Fecha;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

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


    public float calculoPorcentajeVotos(Candidato candidato){
        float totalVotos = candidato.conteoVotos();
        float porcentaje = totalVotos * 100 / padron.size();
        return porcentaje;
    }

    public float calculoPorcentajeNoVotantes(){
        float totalVotos = 0;
        float porcentaje = 0;
        for(PartidoPolitico partido : listaPartidos){
            totalVotos=partido.getCandidatoRepresentante().conteoVotos()+totalVotos;
        }
        porcentaje = totalVotos * 100 / padron.size();
        porcentaje = 100 - porcentaje;
        return porcentaje;
    }

    public Candidato ganador(){
        float porcentaje=0f;
        Candidato candidatoGanador=new Candidato();
        for (PartidoPolitico partido:listaPartidos ){

            if(porcentaje==0f || porcentaje< calculoPorcentajeVotos(partido.getCandidatoRepresentante())){
                candidatoGanador=partido.getCandidatoRepresentante();
            }

        }
        return candidatoGanador;
    }


    public static void main(String args[]){
        HashSet<Votante>padron1 = new HashSet<>();
        HashSet<PartidoPolitico>listaPartidos1=new HashSet<>();

        Votante v1 = new Votante(Provincia.BUENOS_AIRES);
        Votante v2 = new Votante(Provincia.CHACO);
        Votante v3 = new Votante(Provincia.CHUBUT);
        Votante v4 = new Votante(Provincia.CATAMARCA);
        Votante v5 = new Votante(Provincia.CORDOBA);
        Votante v6 = new Votante(Provincia.ENTRE_RIOS);
        Votante v7 = new Votante(Provincia.JUJUY);
        Votante v8 = new Votante(Provincia.LA_PAMPA);



        Candidato c1=new Candidato("Javier","Casais",48126397, new Fecha() , NombrePartido.EL_POLI_AVANZA,new HashMap<>(),new HashMap<>());
        PartidoPolitico p1 = new PartidoPolitico(NombrePartido.EL_POLI_AVANZA , c1);

        Candidato c2=new Candidato("Mariano","Mendez",48126395, new Fecha() , NombrePartido.JUNTOS_POR_EL_POLI,new HashMap<>(),new HashMap<>());
        PartidoPolitico p2 = new PartidoPolitico(NombrePartido.JUNTOS_POR_EL_POLI , c2);

        Candidato c3=new Candidato("Mariano","Mendez",48126395, new Fecha() , NombrePartido.UNION_POR_LA_DOCENCIA,new HashMap<>(),new HashMap<>());
        PartidoPolitico p3 = new PartidoPolitico(NombrePartido.UNION_POR_LA_DOCENCIA , c3);

        Candidato c4 =new Candidato("Mariano","Mendez",48126395, new Fecha() , NombrePartido.FRENTE_DE_CONSTITUYENTES,new HashMap<>(),new HashMap<>());
        PartidoPolitico p4 = new PartidoPolitico(NombrePartido.FRENTE_DE_CONSTITUYENTES , c4);

        padron1.add(v1);
        padron1.add(v2);
        padron1.add(v3);
        padron1.add(v4);
        padron1.add(v5);
        padron1.add(v6);
        padron1.add(v7);
        padron1.add(v8);

        listaPartidos1.add(p1);
        listaPartidos1.add(p2);
        listaPartidos1.add(p3);
        listaPartidos1.add(p4);



        Sistema s1 = new Sistema(padron1,listaPartidos1);

        v1.votar(c1);
        
        System.out.println("El candidato " + c1.getApellido() + ", " + c1.getNombre() + " obtuvo el " + s1.calculoPorcentajeVotos(c1) + "% de los votos.");
        System.out.println("Existe un " + s1.calculoPorcentajeNoVotantes() + "% del padron que no voto");
        System.out.println("El ganador es el candidato " + s1.ganador().getApellido() + " con un total de " + s1.ganador().conteoVotos());

    }
}

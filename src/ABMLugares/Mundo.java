package ABMLugares;

import java.util.HashSet;

public class Mundo {
    HashSet<Lugar>lugaresMundo;

    public Mundo(){
        lugaresMundo=new HashSet<>();
    }
    public Mundo(HashSet<Lugar> lugaresMundo) {
        this.lugaresMundo = lugaresMundo;
    }

    public HashSet<Lugar> getLugaresMundo() {
        return lugaresMundo;
    }

    public void setLugaresMundo(HashSet<Lugar> lugaresMundo) {
        this.lugaresMundo = lugaresMundo;
    }

    public void agregarLugar(Lugar lugarNuevo){
        lugaresMundo.add(lugarNuevo);
    }
    public void eliminarLugar(Lugar lugarRemovido){
        lugaresMundo.remove(lugarRemovido);
    }
    public void modificarLugar(Lugar lugarNuevo, Lugar lugarViejo){
        lugaresMundo.remove(lugarViejo);
        lugaresMundo.add(lugarNuevo);
    }

    public void pantallaInformativa(){
        System.out.println("El pais con mayor poblacion es: " + paisMasPoblado().getNombre());
        System.out.println("El pais con menor poblacion es: " + paisMenosPoblado().getNombre());
        System.out.println("El continente con mayor poblacion es: " + continenteMasPoblado().getNombre());
        System.out.println("El continente con menor poblacion es: " + continenteMenosPoblado().getNombre());
    }

    public Pais paisMasPoblado(){
        int mayorPoblacion=0;
        Pais paisMayor=new Pais();
        for(Lugar lugar:lugaresMundo){
            if(lugar instanceof Pais && lugar.consultaPoblacion()>mayorPoblacion){
                mayorPoblacion= lugar.consultaPoblacion();
                paisMayor= (Pais)lugar;
            }
        }
        return paisMayor;
    }

    public Pais paisMenosPoblado(){
        int menorPoblacion=0;
        Pais paisMenor=new Pais();
        for(Lugar lugar:lugaresMundo){
            if(lugar instanceof Pais && (lugar.consultaPoblacion()<menorPoblacion || menorPoblacion==0)){
                menorPoblacion= lugar.consultaPoblacion();
                paisMenor= (Pais)lugar;
            }
        }
        return paisMenor;
    }
    public Continente continenteMasPoblado(){
        int mayorPoblacion=0;
        Continente continenteMayor=new Continente();
        for(Lugar lugar:lugaresMundo){
            if(lugar instanceof Continente && lugar.consultaPoblacion()>mayorPoblacion){
                mayorPoblacion= lugar.consultaPoblacion();
                continenteMayor= (Continente)lugar;
            }
        }
        return continenteMayor;
    }
    public Continente continenteMenosPoblado(){
        int menorPoblacion=0;
        Continente continenteMenor=new Continente();
        for(Lugar lugar:lugaresMundo){
            if(lugar instanceof Continente && (lugar.consultaPoblacion()<menorPoblacion || menorPoblacion==0)){
                menorPoblacion= lugar.consultaPoblacion();
                continenteMenor= (Continente)lugar;
            }
        }
        return continenteMenor;
    }


    public int lugarPorCodigo(int cod){
        int pob=0;
        for(Lugar lugar:lugaresMundo){
            if(lugar.getCodigo()==cod){
                pob=lugar.consultaPoblacion();
            }
        }
        return pob;
    }
    

}

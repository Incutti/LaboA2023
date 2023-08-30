package CarteleraCine;

import tiempo.Fecha;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Sistema {

    private HashSet<Funcion> funciones;
    private HashSet<Espectador> espectadores;

    public Sistema(HashSet<Funcion> funciones, HashSet<Espectador> espectadores) {
        this.funciones = funciones;
        this.espectadores = espectadores;
    }

    public Sistema() {
        funciones = new HashSet<>();
        espectadores = new HashSet<>();
    }

    public HashSet<Espectador> getEspectadores() {
        return espectadores;
    }

    public void setEspectadores(HashSet<Espectador> espectadores) {
        this.espectadores = espectadores;
    }

    public HashSet<Funcion> getFunciones() {
        return funciones;
    }

    public void setFunciones(HashSet<Funcion> funciones) {
        this.funciones = funciones;
    }
    public void agregarFuncion(Pelicula pelicula, LocalDateTime horario, Sala sala){
        Funcion funcion = new Funcion(pelicula, horario, sala);
        funciones.add(funcion);
    }

    public HashSet<Funcion> funcionesDispo(){
        HashSet<Funcion>aux=new HashSet<>();

        for (Funcion funcion:funciones){
            if (funcion.disponible()){
                aux.add(funcion);
            }
        }
        return aux;
    }

    public Pelicula peliculaMasVista(){
        HashMap<Pelicula, Integer> asistenciasPorPelicula = new HashMap<>();
        for(Espectador espectador : espectadores){
            for(Funcion funcion : espectador.getFuncionesAsistidas()){
                if(asistenciasPorPelicula.containsKey(funcion.getPelicula())){
                    asistenciasPorPelicula.put(funcion.getPelicula(),+1);
                } else {
                    asistenciasPorPelicula.put(funcion.getPelicula(),1);
                }
            }
        }
        int mayor=0;
        Pelicula peliMasVista=new Pelicula();
        for(Map.Entry<Pelicula, Integer> pelicula : asistenciasPorPelicula.entrySet()){
            if (pelicula.getValue()>mayor){
                mayor= pelicula.getValue();
                peliMasVista=pelicula.getKey();
            }
        }
        return peliMasVista;
    }

    public Espectador espectadorConMenosEntradas(){
        int cantidad = -1;
        Espectador espectadorMenor=new Espectador();
        for(Espectador espectador : espectadores){
            if ( (cantidad==-1) || (cantidad > espectador.getFuncionesAsistidas().size()) ){
                espectadorMenor=espectador;
                cantidad=espectador.getFuncionesAsistidas().size();
            }
        }
        return espectadorMenor;
    }


    public static void main(String args[]){

        HashSet<Funcion> funciones=new HashSet<>();
        HashSet<Espectador> espectadores=new HashSet<>();

        Sala s1=new Sala();
        Sala s2=new Sala();
        Sala s3=new Sala();

        Pelicula p1=new Pelicula("OpenJaime",180,Genero.DRAMA);
        Pelicula p2=new Pelicula("Barbie",120,Genero.AVENTURA);
        Pelicula p3=new Pelicula("Xmen",132,Genero.ACCION);

        LocalDateTime h1 = LocalDateTime.of(2023, 11, 30, 14, 30, 00);
        LocalDateTime h2 = LocalDateTime.of(2023, 7, 28, 14, 30, 00);
        LocalDateTime h3 = LocalDateTime.of(2023, 10, 28, 14, 30, 00);

        Funcion f1=new Funcion(p1,h1,s1);
        Funcion f2=new Funcion(p2,h2,s2);
        Funcion f3=new Funcion(p3,h3,s3);

        funciones.add(f1);
        funciones.add(f2);
        funciones.add(f3);

        Espectador e1 = new Espectador("Pepe","Lopez",27123789, new Fecha(),"hola1@gmail.com",funciones);
        Espectador e2 = new Espectador("Pepa","Lopaz",27123790, new Fecha(),"hola1@gmail.com",funciones);
        Espectador e3 = new Espectador("Pepi","Lopiz",27123791, new Fecha(),"hola1@gmail.com",funciones);


        espectadores.add(e1);
        espectadores.add(e2);
        espectadores.add(e3);

        Sistema sis = new Sistema(funciones,espectadores);

        HashSet<Funcion> funcionesDispo= sis.funcionesDispo();

        for(Funcion funcion : funcionesDispo){
            System.out.println(funcion.imprimirFuncion()+ " Esta Disponible");
        }

        System.out.println("Hay " + e3.cantidadEspectadorAlta() + " usuarios registrados.");
        System.out.println();

        System.out.println("Hay " + p3.cantidadPeliculasExistentes() + " usuarios registrados.");
        System.out.println();

        Pelicula cars = new Pelicula("Cars",120,Genero.ACCION);
        sis.getFunciones().add(new Funcion(cars,h3,s3));
        for(Funcion funcion:funciones){
            System.out.println(funcion.imprimirFuncion());
        }
        System.out.println();

        System.out.println(sis.peliculaMasVista().getTitulo());
        System.out.println();

        Espectador e4 = new Espectador("Pep","perez",2713791, new Fecha(),"hoa1@gmail.com",new HashSet<>());
        espectadores.add(e4);
        System.out.println(sis.espectadorConMenosEntradas().getApellido());
    }
}

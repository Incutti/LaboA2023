package CarteleraCine;


import java.time.LocalDateTime;
import java.util.HashSet;

public class Funcion {

    private Pelicula pelicula;
    private LocalDateTime horario;
    private Sala sala;
    private int cantEntradasCompradas;

    public Funcion(Pelicula pelicula, LocalDateTime horario, Sala sala) {
        this.pelicula = pelicula;
        this.horario = horario;
        this.sala = sala;
        this.cantEntradasCompradas = 0;
    }

    public Funcion(){
        pelicula= new Pelicula();
        horario = LocalDateTime.now();
        sala = new Sala();
        cantEntradasCompradas = 0;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public LocalDateTime getHorario() {
        return horario;
    }

    public void setHorario(LocalDateTime horario) {
        this.horario = horario;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public int getCantEntradasCompradas() {
        return cantEntradasCompradas;
    }

    public void setCantEntradasCompradas(int cantEntradasCompradas) {
        this.cantEntradasCompradas = cantEntradasCompradas;
    }

    public boolean disponible(){
        if(horario.isAfter(LocalDateTime.now()) && cantEntradasCompradas<Sala.getCantidadButacas()){
            return true;
        }
        return false;
    }


    public String imprimirFuncion() {
        return "La funcion de: " + pelicula.imprimirPelicula() + " En el Horario : " + horario.toString() + " En la sala : " + sala.getNumero();
    }

}

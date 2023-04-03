import java.util.ArrayList;

public class Materia {
    private String nombre;
    private ArrayList<Float> listaDeNotas;



    public Materia() {
        nombre = "Laboratorio";
        listaDeNotas = new ArrayList<Float>();
    }
    public Materia(String nombre, ArrayList<Float> listaDeNotas) {
        this.nombre = nombre;
        this.listaDeNotas = listaDeNotas;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public ArrayList<Float> getListaDeNotas() {
        return listaDeNotas;
    }
    public void setListaDeNotas(ArrayList<Float> listaDeNotas) {
        this.listaDeNotas = listaDeNotas;
    }

    public void agregarNota(Float nota){
        listaDeNotas.add(nota);
    }
    public Float promedioNotasMateria(){
        float suma=0;
        for(Float nota: listaDeNotas){
            suma=suma+nota;
        }
        return suma/listaDeNotas.size();
    }
}



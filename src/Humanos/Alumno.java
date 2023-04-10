package Humanos;
import Cosas.*;
import java.util.ArrayList;

public class Alumno extends Persona {

    private ArrayList<Materia> listaDeMaterias;
    private String division;

    public Alumno(){
        super();
        listaDeMaterias= new ArrayList<Materia>();
        division="3CSTCA";

    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public ArrayList<Materia> getListaDeMaterias(){
        return listaDeMaterias;
    }

    public void setListaDeMaterias(ArrayList<Materia> listaDeMaterias) { this.listaDeMaterias = listaDeMaterias; }

    public void menorNota() {
        float notaMenor = 10;
        for (Materia materia : listaDeMaterias) {
            for(Float nota: materia.getListaDeNotas()) {
                if (nota < notaMenor) {
                    notaMenor = nota;
                }
            }
        }
    }

    public void mayorNota(){
        float notaMayor=0;
        for(Materia materia : listaDeMaterias){
            for(Float nota : materia.getListaDeNotas()){
                if(nota>notaMayor){
                    notaMayor=nota;
                }
            }
        }
    }

    public void agregarMateria(Materia materia){
        listaDeMaterias.add(materia);
    }

    public void ponerNota(Materia materia, Float nota){
        materia.agregarNota(nota);
    }

    public Float promedioNotasAlumno(){
        float promedio=0;
        for(Materia materia:listaDeMaterias){
            promedio=promedio+materia.promedioNotasMateria();
        }
        return promedio/listaDeMaterias.size();
    }
}

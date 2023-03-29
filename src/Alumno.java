import com.sun.org.apache.xpath.internal.operations.Neg;

import java.util.ArrayList;

public class Alumno {
    private String nombre;
    private String apellido;
    private Fecha fechaDeNacimiento;
    private ArrayList<Float> listaDeNotas;

    public Alumno(){
        nombre="Cristian";
        apellido="Fernández";
        fechaDeNacimiento=new Fecha();
        listaDeNotas= new ArrayList<Float>();
    }

    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public Fecha getFechaDeNacimiento(){
        return fechaDeNacimiento;
    }
    public ArrayList<Float> getListaDeNotas(){
        return listaDeNotas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public void setFechaDeNacimiento(Fecha fechaDeNacimiento){
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    public void setListaDeNotas(ArrayList<Float> listaDeNotas){
        this.listaDeNotas=listaDeNotas;
    }

    public void menorNota(){
        float notaMenor=10;
        for(Float nota : listaDeNotas){
            if(nota<notaMenor){
                notaMenor=nota;
            }
        }
    }
    public void mayorNota(){
        float notaMayor=0;
        for(Float nota : listaDeNotas){
            if(nota>notaMayor){
                notaMayor=nota;
            }
        }
    }
    public void agregarNota(Float nota){

        listaDeNotas.add(nota);
    }

}

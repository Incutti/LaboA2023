import java.util.ArrayList;

public class Alumno {
    private String nombre;
    private String apellido;
    private Fecha fechaDeNacimiento;
    private ArrayList<Materia> listaDeMaterias;

    public Alumno(){
        nombre="Cristian";
        apellido="Fernández";
        fechaDeNacimiento=new Fecha();
        listaDeMaterias= new ArrayList<Materia>();

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
    public ArrayList<Materia> getListaDeMaterias(){
        return listaDeMaterias;
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
    public void listaDeMaterias(){
        this.listaDeMaterias=listaDeMaterias;
    }

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

    public void agregarNota(Materia materia, Float nota){
        materia.getListaDeNotas().add(nota);
    }

}

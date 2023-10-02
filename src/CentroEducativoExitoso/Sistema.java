package CentroEducativoExitoso;

import java.time.LocalDate;
import java.util.HashSet;

public class    Sistema {
    private  HashSet<Alumno> alumnos;

    public Sistema(HashSet<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public HashSet<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(HashSet<Alumno> alumnos) {
        this.alumnos = alumnos;
    }


    public int cantAprobados(){
        int contador=0;
        for(Alumno alumno:alumnos){
            if (alumno.aprobacionAlumno())
                    contador++;
                }
        return contador;
    }

    public static void main(String[] args) {

        ExamenEscrito ee1= new ExamenEscrito(LocalDate.now(),10);
        ExamenEscrito ee2= new ExamenEscrito(LocalDate.now(),5);

        ExamenOral eo1=new ExamenOral(LocalDate.now(),NivelSatisfaccion.SUFICIENTE);
        ExamenOral eo2=new ExamenOral(LocalDate.now(),NivelSatisfaccion.INSUFICIENTE);

        HashSet<Examen> examenes=new HashSet<>();
        HashSet<Examen> examenes1=new HashSet<>();

        examenes.add(ee1);
        examenes.add(ee2);
        examenes.add(eo1);
        examenes.add(eo2);

        examenes1.add(ee1);
        examenes1.add(eo1);

        Alumno alumno = new Alumno("Juan", "Sampi",12312312,examenes);
        Alumno alumno1 = new Alumno("Juan", "Sampi",12312312,examenes1);

        HashSet<Alumno> alumnos=new HashSet<>();

        alumnos.add(alumno);
        alumnos.add(alumno1);

        Sistema s1=new Sistema(alumnos);

        System.out.println("la cantidad de aprobados es de "+ s1.cantAprobados());




    }

}

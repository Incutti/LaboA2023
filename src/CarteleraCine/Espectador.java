package CarteleraCine;

import Humanos.Persona;
import tiempo.Fecha;

import java.util.HashSet;

public class Espectador extends Persona {

    private static int contadorAlta=0;
    private int id;
    private String mailRegistro;
    private HashSet<Funcion> funcionesAsistidas;

    public Espectador(String nombre, String apellido, int dni, Fecha fechaNacimiento, String mailRegistro, HashSet<Funcion> funcionesAsistidas) {
        super(nombre, apellido, dni, fechaNacimiento);
        contadorAlta+=1;
        id = contadorAlta;
        this.mailRegistro = mailRegistro;
        this.funcionesAsistidas = funcionesAsistidas;
    }

    public Espectador() {
        super();
        contadorAlta += 1;
        id = contadorAlta;
        mailRegistro = "mensuh@gmail.com";
        funcionesAsistidas = new HashSet<>();
    }

    public static int getContadorAlta() {
        return contadorAlta;
    }

    public static void setContadorAlta(int contadorAlta) {
        Espectador.contadorAlta = contadorAlta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMailRegistro() {
        return mailRegistro;
    }

    public void setMailRegistro(String mailRegistro) {
        this.mailRegistro = mailRegistro;
    }

    public HashSet<Funcion> getFuncionesAsistidas() {
        return funcionesAsistidas;
    }

    public void setFuncionesAsistidas(HashSet<Funcion> funcionesAsistidas) {
        this.funcionesAsistidas = funcionesAsistidas;
    }

    public static int cantidadEspectadorAlta(){return contadorAlta;}



}

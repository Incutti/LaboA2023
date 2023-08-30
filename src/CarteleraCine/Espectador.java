package CarteleraCine;

import Humanos.Persona;
import tiempo.Fecha;

import java.util.HashSet;

public class Espectador extends Persona {

    private static int contadorAlta=1;
    private int id;
    private String mailRegistro;
    private HashSet<Funcion> funcionesAsistidas;

    public Espectador(String nombre, String apellido, int dni, Fecha fechaNacimiento, String mailRegistro, HashSet<Funcion> funcionesAsistidas) {
        super(nombre, apellido, dni, fechaNacimiento);
        id = contadorAlta;
        contadorAlta+=1;
        this.mailRegistro = mailRegistro;
        this.funcionesAsistidas = funcionesAsistidas;
    }

    public Espectador() {
        super();
        id = contadorAlta;
        contadorAlta += 1;
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

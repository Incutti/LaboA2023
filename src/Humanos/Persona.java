package Humanos;

import tiempo.Fecha;
public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private Fecha fechaNacimiento;
    private String direccion;

    public Persona() {
        nombre = "Pablo";
        apellido = "Crisnoselacome";
        edad = 2023-fechaNacimiento.getAnio();
        fechaNacimiento = new Fecha();
        direccion = "Cabildo 5000";
    }
    public Persona(String nombre, String apellido, String direccion, Fecha fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        edad = 2023- fechaNacimiento.getAnio();
        this.direccion = direccion;
        this.fechaNacimiento=fechaNacimiento;
    }
    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public Persona(String nombre) {
        this.nombre = nombre;
    }
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void impresionDeHumanos(){
        System.out.println("El humano llamado " + nombre + ", tiene " + edad + " años y vive en " + direccion);
    }
}

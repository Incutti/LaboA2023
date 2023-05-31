package Humanos;

import tiempo.Fecha;
public class Persona {
    private String nombre;
    private String apellido;
    private int dni;
    private int edad;
    private Fecha fechaNacimiento;
    private String direccion;
    private int DNI;
    private int numTelefono;
    private String pais;

    public Persona() {
        nombre = "Pablo";
        apellido = "Crisnoselacome";
        dni = 30525666;
        edad = 2023-fechaNacimiento.getAnio();
        fechaNacimiento = new Fecha();
        direccion = "Cabildo 5000";
        DNI = 45456678;
        numTelefono=1133445566;
        pais = "bolivia";
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
    public Persona (String nombre, String apellido, int DNI, int numTelefono, String pais){
        this.nombre=nombre;
        this.apellido=apellido;
        this.DNI=DNI;
        this.numTelefono=numTelefono;
        this.pais=pais;
    }


    public Persona(String nombre, String apellido, int dni, int edad, Fecha fechaNacimiento, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
    }

    public Persona(String nombre, Fecha fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
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

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public int getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(int numTelefono) {
        this.numTelefono = numTelefono;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void impresionDeHumanos(){
        System.out.println("El humano llamado " + nombre + ", tiene " + edad + " años y vive en " + direccion);
    }
}

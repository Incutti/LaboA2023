public class Persona {
    private String nombre;
    private int edad;
    private String direccion;

    public Persona() {
        this.nombre = "Pablo";
        this.edad = 15;
        this.direccion = "Cabildo 5000";
    }
    public Persona(String nombre, int edad, String direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }
    public Persona(String nombre) {
        this.nombre = nombre;
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
    public void impresionDeHumanos(){
        System.out.println("El humano llamado " + nombre + ", tiene " + edad + " años y vive en " + direccion);
    }
}

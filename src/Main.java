import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        // UNIDAD 1
        /*
        Libro libro1=new Libro();
        Libro libro=new Libro("cualquier cosa",new Persona(),122341,124124,"string",new Fecha(12,12,2012));
        libro.mostrarInfo();
        libro.libroAnterior(libro1);
        // ------
        Cafetera cafetera= new Cafetera();
        Taza taza=new Taza();
        cafetera.llenarCafetera();
        System.out.println(cafetera.getCantActual());
        cafetera.servirTaza(taza);
        System.out.println(cafetera.getCantActual());
        System.out.println(taza.getCantActual());
        cafetera.vaciarCafetera();
        System.out.println(cafetera.getCantActual());
        cafetera.agregarCafe(333);
        System.out.println(cafetera.getCantActual());
        // ------
        Cancion cancion=new Cancion();
        System.out.println(cancion.getTitulo());
        System.out.println(cancion.getAutor().getNombre());
        System.out.println(cancion.getDuracion());
        System.out.println(cancion.getGenero());
        */
        // UNIDAD 2

        // EJERCICIO 1
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        int cantidad;
        System.out.println("Ingrese la cantidad de numeros que va a ingresar");
        cantidad=entrada.nextInt();
        System.out.println("Elija sus " + cantidad + " numeros");
        for(int i=0; i<cantidad;i++){
            numeros.add(entrada.nextInt());
            entrada.nextLine();
        }
        int suma = 0;
        for (Integer numero : numeros) {
            suma = suma + numero;
        }
        System.out.println(suma);



        //EJERCICIO 2
        System.out.println("Elija con que letra debe coincidir la inicial");
        String letraEspecifica = entrada.nextLine();
        String palabraIngresada;
        ArrayList<String> palabras = new ArrayList<String>();
        System.out.println("Ingrese la cantidad de nombres que va a ingresar");
        cantidad=entrada.nextInt();
        entrada.nextLine();
        System.out.println("Elija sus " + cantidad + " nombres");
        for(int i=0; i<cantidad;i++){
            palabraIngresada=entrada.nextLine();
            palabras.add(palabraIngresada);
        }
        for (String palabra : palabras) {
            if (palabra.charAt(0) == letraEspecifica.charAt(0)) {
                System.out.println(palabra);
            }
        }



        //EJERCICIO 3
        ArrayList<Persona>personas=new ArrayList<Persona>();

        System.out.println("Ingrese la cantidad de nombres que va a ingresar");
        cantidad=entrada.nextInt();
        System.out.println("Elija sus " + cantidad + " nombres con sus respectivas edades");
        String nombre;
        int edad;
        for(int i=0; i<cantidad;i++){
            nombre=entrada.next();
            edad=entrada.nextInt();
            entrada.nextLine();
            Persona persona1 = new Persona(nombre, edad);
            personas.add(persona1);
        }
        for(Persona persona:personas){
            if(persona.getEdad()>30){
                persona.impresionDeHumanos();
            }
        }
    }
}
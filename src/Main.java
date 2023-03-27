import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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
        numeros.add(2);
        numeros.add(4);
        int suma = 0;
        for (Integer numero : numeros) {
            suma = suma + numero;
        }
        System.out.println(suma);

        //EJERCICIO 2
        char letraEspecifica = 'a';
        ArrayList<String> palabras = new ArrayList<String>();
        palabras.add("ariana");
        palabras.add("mariana");
        for (String palabra : palabras) {
            if (palabra.charAt(0) == letraEspecifica) {
                System.out.println(palabra);
            }
        }

        //EJERCICIO 3
        ArrayList<Persona>personas=new ArrayList<Persona>();
        for(Persona persona:personas){
            if(persona.getEdad()>30){
                persona.impresionDeHumanos();
            }
        }
    }
}
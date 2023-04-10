import Humanos.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // UNIDAD 1
        /*
        Objetos.Libro libro1=new Objetos.Libro();
        Objetos.Libro libro=new Objetos.Libro("cualquier cosa",new Humanos.Persona(),122341,124124,"string",new Fecha(12,12,2012));
        libro.mostrarInfo();
        libro.libroAnterior(libro1);
        // ------
        Objetos.Cafetera cafetera= new Objetos.Cafetera();
        Objetos.Taza taza=new Objetos.Taza();
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
        Objetos.Cancion cancion=new Objetos.Cancion();
        System.out.println(cancion.getTitulo());
        System.out.println(cancion.getAutor().getNombre());
        System.out.println(cancion.getDuracion());
        System.out.println(cancion.getGenero());

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
        ArrayList<Humanos.Persona>personas=new ArrayList<Humanos.Persona>();

        System.out.println("Ingrese la cantidad de nombres que va a ingresar");
        cantidad=entrada.nextInt();
        System.out.println("Elija sus " + cantidad + " nombres con sus respectivas edades");
        String nombre;
        int edad;
        for(int i=0; i<cantidad;i++){
            nombre=entrada.next();
            edad=entrada.nextInt();
            entrada.nextLine();
            Humanos.Persona persona1 = new Humanos.Persona(nombre, edad);
            personas.add(persona1);
        }
        for(Humanos.Persona persona:personas){
            if(persona.getEdad()>30){
                persona.impresionDeHumanos();
            }
        }


        // EJERCICIO 6
        Materia materia=new Materia();
        Materia materia2=new Materia();
        Humanos.Alumno alumno=new Humanos.Alumno();
    */
        Empleado E1=new Empleado("manuel");
        Directivo D1 =new Directivo("Martin");
        Operario O1 =new Operario("Mario");
        Oficial OF =new Oficial("Marin");
        Tecnico T1 =new Tecnico("Pablo");


        System.out.println(E1);
        System.out.println(D1);
        System.out.println(O1);
        System.out.println(OF);
        System.out.println(T1);

    }
}

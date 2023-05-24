import Cosas.Menu;
import GuiaComplejidad.Ejercicio3;
import Humanos.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // UNIDAD 1
        /*
        Objetos.Libro libro1=new Objetos.Libro();
        Objetos.Libro libro=new Objetos.Libro("cualquier cosa",new Humanos.Persona(),122341,124124,"string",new tiempo.Fecha(12,12,2012));
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
        Cosas.Materia materia=new Cosas.Materia();
        Cosas.Materia materia2=new Cosas.Materia();
        Humanos.Alumno alumno=new Humanos.Alumno();

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

        Menu menu=new Menu();
        menu.mostrarMenu();



// EJERCICIO 3 de guia complejidad

        ArrayList<Integer> listaMesetas= new ArrayList<Integer>();
        listaMesetas.add(1);
        listaMesetas.add(1);
        listaMesetas.add(2);
        listaMesetas.add(2);
        listaMesetas.add(2);
        listaMesetas.add(4);
        listaMesetas.add(3);

        int i = 0;
        int maxMeseta = 0;
        int contador=1;
        while ( i < listaMesetas.size () ) {
            int siguiente = i + 1;

            if(siguiente< listaMesetas.size()){
                if(listaMesetas.get(i).equals(listaMesetas.get(siguiente))){
                    contador++;
                } else{
                    if (contador>maxMeseta){
                        maxMeseta = contador;
                    }
                    contador=1;
                }
            }
            i++;
        }
        System.out.println(maxMeseta);


// EJERCICIO 6 de la guia de complejidad


        ArrayList<Integer> listaEnteros= new ArrayList<Integer>();
        listaEnteros.add(2);
        listaEnteros.add(6);
        listaEnteros.add(4);
        listaEnteros.add(2);
        listaEnteros.add(2);
        listaEnteros.add(4);
        listaEnteros.add(2);

        int i = 0;
        int maxMeseta = 0;
        int contador=0;
        while ( i < listaEnteros.size () ) {
            int siguiente = i + 1;
            if(siguiente< listaEnteros.size()){
                if(contador==0 && listaEnteros.get(i)%2!=0){
                    contador++;
                }
                if(listaEnteros.get(i).equals(listaEnteros.get(siguiente)) && listaEnteros.get(i)%2 !=0){
                    contador++;
                     else if (contador==1){
                        contador++;
                    }

                } else{
                    if (contador>maxMeseta){
                        maxMeseta = contador;

                    }
                    contador=0;
                }
            }
            i++;
        }
        System.out.println(maxMeseta);

// EJERCICIO 7 A de la guia de complejidad


        ArrayList<Boolean>columna = new ArrayList<Boolean>();
        ArrayList<ArrayList<Boolean>> matrizBooleana= new ArrayList<ArrayList<Boolean>>();

        columna.add(true);
        columna.add(false);
        columna.add(false);
        columna.add(true);
        columna.add(true);
        matrizBooleana.add(columna);

        boolean seRepite=false;
        for(int i = 0; i<matrizBooleana.size(); i++){
            for(int j=0; j<matrizBooleana.get(i).size(); j++){
                if(matrizBooleana.get(i)==matrizBooleana.get(j) && i!=j){
                    seRepite=true;
                }
            }
            if(!seRepite){
                System.out.println(matrizBooleana.get(i) + " es la fila que no se repite.");
            } else {
                seRepite=false;
            }
        }
        //tiempo de ejecucion de peor caso es: O(n²)
// 8


        ArrayList<Integer>v1= new ArrayList<Integer>();
        ArrayList<Integer>v2= new ArrayList<Integer>();
        ArrayList<Integer>nuevoArray= new ArrayList<Integer>();

        int j=0, i=0;
        while(i<v1.size()){
            if(v1.get(i)>=v2.get(j) && j<v2.size()){
                nuevoArray.add(v2.get(j));
                j++;
            } else {
                nuevoArray.add(v1.get(i));
                i++;
            }
        }
        if(i<j){
            int diferencia=j-i;
            for(int k=0; k<diferencia;k++){
                nuevoArray.add(v2.get(v1.size()+k));
            }
        }

// ej 9 guia complejidad
*/
        ArrayList<Integer>v1= new ArrayList<Integer>();
        ArrayList<Integer>v2= new ArrayList<Integer>();
        ArrayList<Integer>v3= new ArrayList<Integer>();
        ArrayList<Integer>posicionesArray= new ArrayList<Integer>();

// ej10 guia complejidad (use counting sort indirectamente)
/*

        ArrayList<Integer>listaDe1a3= new ArrayList<Integer>();
        ArrayList<Integer>listaNueva= new ArrayList<Integer>();

        int cantidad=0;
        for(int i=1;i<=3;i++){
            for (int j=0;j<listaDe1a3.size();j++){
                if(i==listaDe1a3.get(j)){
                    cantidad++;
                }
            }
            for(int k=0; k<cantidad;k++){
                listaNueva.add(i);
            }
            cantidad=0;
        }

         */
    }
}

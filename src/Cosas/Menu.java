package Cosas;
import Humanos.*;
import java.util.ArrayList;


public class Menu {
    private ArrayList<Alumno> listaAlumnos;
    private ArrayList<Profesor> listaProfesores;
    private ArrayList<Plato> listaPlatos;
    private ArrayList<Pedido> listaPedidos;
    private ArrayList<Pedido> platosACocinar;
    public void mostrarMenu(){

        System.out.println("\t \t ------------------------------------");
        System.out.println("\t \t | \t Indique lo que desee hacer \t|" );
        System.out.println("\t \t | \t 1) Agregar  \t|" );
        System.out.println("\t \t | \t 2) Modificar  \t|" );
        System.out.println("\t \t | \t 3) Eliminar  \t|" );

    }
}

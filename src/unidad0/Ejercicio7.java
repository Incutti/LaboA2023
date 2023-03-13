package unidad0;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        System.out.println("Ingrese numeros y se le diran cuantos se ingresaron. Cuando quiera parar, ingrese un -1");
        int contador=0, numero, i=0;
        Scanner entrada = new Scanner(System.in);
        while(i<1){
            numero = entrada.nextInt();
            if(numero==-1){
                i++;
            } else{
                contador++;
            }
        }
        System.out.println("Ingreso " + contador + " numeros.");
    }
}

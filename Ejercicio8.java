package unidad0;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        System.out.println("Ingrese numeros y se le diran cuantos se ingresaron, el mayor numero, el menor, la suma de todos, la suma de los positivos y la suma de los negativos. Cuando quiera parar, ingrese un -1");
        int contador=0, numero, i=0, mayorNum, menorNum, suma=0, sumaPositivos=0, sumaNegativos=0;
        Scanner entrada = new Scanner(System.in);
        numero = entrada.nextInt();
        mayorNum=numero;
        menorNum=numero;
        if(numero==-1){
            i++;
            suma=suma+numero;
            sumaNegativos=suma;
        }
        while(i<1){
            suma=suma+numero;
            contador++;
            numero = entrada.nextInt();
            if(numero==-1){
                i++;
            } else if(numero>mayorNum){
                mayorNum=numero;
            } else if(numero<menorNum){
                menorNum=numero;
            }
            if(numero<0){
                sumaNegativos=sumaNegativos+numero;
            } else{
                sumaPositivos=sumaPositivos+numero;
            }

        }
        System.out.println("Ingreso " + contador + " numeros.");
        System.out.println("El mayor numero fue: "+ mayorNum);
        System.out.println("El menor numero fue: "+ menorNum);
        System.out.println("La suma total da: "+ suma);
        System.out.println("La suma de positivos da: "+ sumaPositivos);
        System.out.println("La suma de negativos da: "+ sumaNegativos);
    }
}

package unidad0;

import java.util.Scanner;

public class PalabrasIguales {
    public static void main(String[] args) {
        System.out.println("Ingrese 2 palabras");
        String palabra1, palabra2;
        Scanner entrada = new Scanner(System.in);
        palabra1 = entrada.nextLine();
        palabra2 = entrada.nextLine();
        if(palabra1.equals(palabra2)){
            System.out.println("Las palabras que ingreso son iguales");
        } else{
            System.out.println("Las palabras que ingreso no son iguales");
        }

    }
}

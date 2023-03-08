package unidad0;

import java.util.Scanner;

public class ReemplazoLetra {
    public static void main(String[] args) {
        String frase = "Ayer me compré muñecos de la marca ‘Colchitas’ por internet";
        String letraIngresada;
        System.out.println("Elija por cual letra quiere cambiar las 'e'.");
        Scanner entrada = new Scanner(System.in);
        letraIngresada = entrada.nextLine();
        char nuevaLetra=letraIngresada.charAt(0);


        String fraseFinal=frase.replaceAll("e",letraIngresada);
        System.out.println(fraseFinal);
    }
    }


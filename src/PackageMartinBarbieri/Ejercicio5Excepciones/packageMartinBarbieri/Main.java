package PackageMartinBarbieri.Ejercicio5Excepciones.packageMartinBarbieri;

import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String args[]){

        Bebedor u1=new Bebedor("franco","hernandez",46443145, new HashMap<>());
        Bebedor u2=new Bebedor("julian","alvarez",32470145, new HashMap<>());
        Bebedor u3=new Bebedor("ian","cuker",45103145, new HashMap<>());

        Alcoholica bal1=new Alcoholica("vodka",45);
        Azucarada baz1=new Azucarada("Coca-cola",9);
        Neutra bn1=new Neutra("agua",0,20);

        HashMap<Bebida, Integer> bebidasEnStock=new HashMap<>();
        bebidasEnStock.put(bal1,10);
        bebidasEnStock.put(baz1,15);
        bebidasEnStock.put(bn1,20);

        HashSet<Bebedor> nuevosBebedores=new HashSet<>();
        nuevosBebedores.add(u1);
        nuevosBebedores.add(u2);
        nuevosBebedores.add(u3);

        Sistema s1=new Sistema(nuevosBebedores,bebidasEnStock);


        try {
            s1.aniadirPersona("ian","cuker",45103145);
        } catch (UsuarioDuplicado e) {
            System.out.println(e.getMessage());
        }


        s1.beber(u1,bn1,3); //la clase bebedor no tiene ni getters/setters ni inicializa bebidasConsumidas en el constructor por lo que nunca esta inicializado, para solucionarlo le agregue el hashSet al constructor
        s1.beber(u2,bn1,2);


        System.out.println();
        System.out.println(u1.coeficienteDeHidratacion());


        System.out.println();
        System.out.println("El Bebedor " + s1.mejorCoeficiente().getNombre() + " es el que mayor hidratacion tiene con un valor de: "+ s1.mejorCoeficiente().coeficienteDeHidratacion());
        System.out.println();
        System.out.println("El Bebedor " + s1.peorCoeficiente().getNombre() + " es el que menor hidratacion tiene con un valor de: "+ s1.peorCoeficiente().coeficienteDeHidratacion());

        //en mejor y peor coeficiente cambie los .equals por == pq sino tiraba error
    }
}

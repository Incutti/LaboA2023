package Try_Catch;
public class Ejercicio1Main {
    private static String nombre = null;
    public static void mostrarNombreThrows()throws NullPointerException{
                System.out.println("El largo del nombre es:"+ nombre.length());
        }

    public static void mostrarNombreThrow(){
        if(nombre==null){
            throw new NullPointerException();
        }else {
            System.out.println("El largo del nombre es:" + nombre.length());
        }
    }

    public static void mostrarNombrePersonalizada() throws NombreVacioExeption {
        if(nombre==null){
            throw new NombreVacioExeption("No puede tener un nombre vacio, Firma Incutti Fernandez");
        }else {
            System.out.println("El largo del nombre es:" + nombre.length());
        }
    }
    public static void main(String[] args){
        try {
            Ejercicio1Main.mostrarNombrePersonalizada();
            // Ejercicio1Main.mostrarNombreThrows(); // throws
             // Ejercicio1Main.mostrarNombreThrow(); // throw
             // System.out.println("El largo del nombre es:"+ nombre.length()); // bloque try/cath
        }catch (NullPointerException e){
            System.out.println(e+" Firma Incutti, Fernandez");
        } catch (NombreVacioExeption e1) {
            System.out.println(e1);
        }

    }

}

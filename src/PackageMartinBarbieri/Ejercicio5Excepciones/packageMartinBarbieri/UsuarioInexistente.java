package PackageMartinBarbieri.Ejercicio5Excepciones.packageMartinBarbieri;

public class UsuarioInexistente extends Exception{
    public UsuarioInexistente(String s) {
        super(s);
    }
}

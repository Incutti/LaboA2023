package IntercambioObjetos;

import java.util.HashMap;
import java.util.Map;

public class Libro extends Escrito implements Prestable{
    private HashMap<String/*capitulo*/, Integer/*pagina*/> pagPorCapitulo;

    public Libro(int codigo, String titulo, int anioPublicacion, HashMap<String, Integer> pagPorCapitulo) {
        super(codigo, titulo, anioPublicacion);
        this.pagPorCapitulo = pagPorCapitulo;
    }

    public HashMap<String, Integer> getPagPorCapitulo() {
        return pagPorCapitulo;
    }

    public void setPagPorCapitulo(HashMap<String, Integer> pagPorCapitulo) {
        this.pagPorCapitulo = pagPorCapitulo;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "Libro{" +
                "pagPorCapitulo=" + pagPorCapitulo +
                '}';
    }

    @Override
    public Boolean prestar() {
        if(pagPorCapitulo.size()%2==1){
            System.out.println("El libro "+super.getTitulo()+" se dará prestado.");
            return true;
        }else {
            System.out.println("El libro "+super.getTitulo()+" no se prestará.");
            return false;
        }
    }

    @Override
    public Boolean agregarElemento() {
        if(prestar()) {
            System.out.println("El artículo ingresado puede ingresar al circuito de préstamos");
            return true;
        } else {
            System.out.println("El artículo ingresado no podrá ingresar a nuestro sistema");
            return false;
        }

    }
}

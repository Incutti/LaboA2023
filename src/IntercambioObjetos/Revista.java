package IntercambioObjetos;

import java.time.LocalDate;

public class Revista extends Escrito implements Prestable{
    private LocalDate fechaPublicacion;

    public Revista(int codigo, String titulo, int anioPublicacion, LocalDate fechaPublicacion) {
        super(codigo, titulo, anioPublicacion);
        super.setAnioPublicacion(fechaPublicacion.getYear());
        this.fechaPublicacion = fechaPublicacion;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Revista{" +
                "fechaPublicacion=" + fechaPublicacion +
                '}';
    }

    @Override
    public Boolean prestar() {
        if(fechaPublicacion.isBefore(LocalDate.now().minusMonths(3))){
            System.out.println("La revista "+super.getTitulo()+" se dará prestada.");
            return true;
        }else {
            System.out.println("La revista "+super.getTitulo()+" no se dará prestada.");
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

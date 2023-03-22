public class Main {
    public static void main(String[] args) {
        Libro libro1=new Libro();
        Libro libro=new Libro("cualquier cosa",new Persona(),122341,124124,"string",new Fecha(12,12,2012));
        libro.mostrarInfo();
        libro.libroAnterior(libro1);
        // ------
        Cafetera cafetera= new Cafetera();
        Taza taza=new Taza();
        cafetera.llenarCafetera();
        System.out.println(cafetera.getCantActual());
        cafetera.servirTaza(taza);
        System.out.println(cafetera.getCantActual());
        System.out.println(taza.getCantActual());
        cafetera.vaciarCafetera();
        System.out.println(cafetera.getCantActual());
        cafetera.agregarCafe(333);
        System.out.println(cafetera.getCantActual());
        // ------
        Cancion cancion=new Cancion();
        System.out.println(cancion.getTitulo());
        System.out.println(cancion.getAutor().getNombre());
        System.out.println(cancion.getDuracion());
        System.out.println(cancion.getGenero());

    }
}
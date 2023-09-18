package Biblioteca;

import ABMLugares.Lugar;
import tiempo.Fecha;
import java.util.HashSet;

public class Sistema {
    private HashSet<Libro>libros;
    private HashSet<Usuario>usuarios;

    public Sistema(HashSet<Libro> libros, HashSet<Usuario> usuarios) {
        this.libros = libros;
        this.usuarios = usuarios;
    }

    public Sistema(){
        libros=new HashSet<>();
        usuarios=new HashSet<>();
    }

    public HashSet<Libro> getLibros() {
        return libros;
    }

    public void setLibros(HashSet<Libro> libros) {
        this.libros = libros;
    }

    public HashSet<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(HashSet<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public void prestamo(Usuario usuario, Libro libro){
        for(Libro libroActual : libros){
            if(libroActual.equals(libro)){
                try {
                    VerificarLibro(libro);
                    VerificarUsuarios(usuario);
                    usuario.getLibrosPrestados().add(libro);
                    libro.setDescargasActuales(+1);
                } catch (LimiteDePrestamosAlcanzadoException e) {
                    System.out.println(e.getMessage());
                } catch (MembresiaException e1) {
                    System.out.println(e1.getMessage());
                }
            }
        }


    }
    public void VerificarLibro (Libro libro) throws LimiteDePrestamosAlcanzadoException{
        if(libro.getDescargasActuales()==Libro.getDesargasDisponibles()){
            throw new LimiteDePrestamosAlcanzadoException();
        }
    }
    public void VerificarUsuarios (Usuario usuario) throws MembresiaException{
        if(usuario.getTipoMiembro().getCantDispo()==usuario.getLibrosPrestados().size()){
            throw new MembresiaException();
        }
    }

    public void agregarlibro(Libro libro){
        libros.add(libro);
    }

    public void eliminarlibro(Libro libro){
        libros.remove(libro);
    }
    public void modificarlibro(Libro libroViejo, Libro libroNuevo){
        libros.remove(libroViejo);
        libros.add(libroNuevo);
    }

    public static void main (String args[]){

        Autor a1=new Autor("juan","perez",12888444,new Fecha(),new HashSet<>());
        Autor a2=new Autor("mario","gomez",13555666,new Fecha(),new HashSet<>());
        Autor a3=new Autor("pepe","garcia",19222111,new Fecha(),new HashSet<>());
        Libro l1=new Libro("aventuras de juan",a1,Genero.AVENTURA,"aventuras.pdf",4);
        Libro l2=new Libro("aventuras de mario",a2,Genero.CIENCIA_FICCION,"aventuras.pdf",3);
        Libro l3=new Libro("aventuras de pepe",a3,Genero.POLICIAL,"aventuras.pdf",2);
        Usuario u1=new Usuario("pamela","nafu",40293567,new Fecha(),"pame@gmail.com",new HashSet<>(),Membresia.BRONCE);
        Usuario u2=new Usuario("mariana","diaz",4112356,new Fecha(),"maru@gmail.com",new HashSet<>(),Membresia.PLATA);
        Usuario u3=new Usuario("natalio","dei",40293567,new Fecha(),"natalio@gmail.com",new HashSet<>(),Membresia.ORO);
        HashSet<Usuario>users=new HashSet<>();
        HashSet<Libro>librs=new HashSet<>();

        librs.add(l1);
        librs.add(l2);
        librs.add(l3);

        users.add(u1);
        users.add(u2);
        users.add(u3);

        Sistema s1=new Sistema(librs,users);

        s1.prestamo(u1,l1);
        s1.prestamo(u1,l2);
        s1.prestamo(u1,l3);
        s1.prestamo(u2,l1);



    }
}

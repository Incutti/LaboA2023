package ConsumoBebidas;

import tiempo.Fecha;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Sistema {

    private HashSet<Usuario>usuarios;
    private HashMap<Bebida,Integer>stock;

    public Sistema(){
        usuarios=new HashSet<>();
        stock=new HashMap<>();
    }
    public HashMap<Bebida, Integer> getStock() {
        return stock;
    }
    public void setStock(HashMap<Bebida, Integer> stock) {
        this.stock = stock;
    }
    public HashSet<Usuario> getUsuarios() {
        return usuarios;
    }
    public void setUsuarios(HashSet<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public void agregarUsuario(Usuario usuario)throws DniRepetidoException{
        for (Usuario usuarioActual :usuarios) {
            if (usuarioActual.getDNI() == usuario.getDNI()){
                throw new DniRepetidoException();
            }
        }
        usuarios.add(usuario);
    }

    public void consumicion(Usuario usuario, Bebida bebida, int cantidad) throws StockFaltanteException {
        verificarStock(cantidad, bebida);
        if(usuarios.contains(usuario)){
            if(usuario.getListaBebidasConsumidas().containsKey(bebida)){
                usuario.getListaBebidasConsumidas().put(bebida,usuario.getListaBebidasConsumidas().get(bebida)+cantidad);
            }else{
                usuario.getListaBebidasConsumidas().put(bebida,cantidad);
            }
        }else{
            try {
                agregarUsuario(usuario);
            } catch (DniRepetidoException e) {
                e.getMessage();
            }
        }
        stock.put(bebida,stock.get(bebida)-cantidad);

    }

    public void verificarStock(int cantidad, Bebida bebida) throws StockFaltanteException {
        if(!stock.containsKey(bebida) || stock.get(bebida)<cantidad){
            throw new StockFaltanteException();
        }
    }

    public void verificarExistenciaHidratacion()throws PersonasInexistentesException{
        Usuario usuarioActual=new Usuario();
        boolean primera=true;
        boolean usuariosDiff=false;
        for (Usuario usuario:usuarios){
            if(primera){
                usuarioActual=usuario;
                primera=false;
            }else if (usuarioActual.calcularCoeficienteHidratacion()!=usuario.calcularCoeficienteHidratacion()){
                usuariosDiff=true;
            }
        }
        if (!usuariosDiff){
            throw new PersonasInexistentesException();
        }
    }

    public Usuario usuarioConMayorHidratacion()throws PersonasInexistentesException{
        verificarExistenciaHidratacion();
        boolean primerVuelta =true;
        Usuario usuarioMayor = new Usuario();
        for (Usuario usuario:usuarios){
            if(primerVuelta){
                usuarioMayor=usuario;
                primerVuelta=false;
            }else if(usuarioMayor.calcularCoeficienteHidratacion()<usuario.calcularCoeficienteHidratacion()){
                usuarioMayor=usuario;
            }
        }
        return usuarioMayor;
    }

    public Usuario usuarioConMenorHidratacion()throws PersonasInexistentesException{
        verificarExistenciaHidratacion();
        boolean primerVuelta = true;
        Usuario usuarioMenor = new Usuario();
        for (Usuario usuario:usuarios){
            if(primerVuelta){
                usuarioMenor=usuario;
                primerVuelta=false;
            }else if(usuarioMenor.calcularCoeficienteHidratacion()>usuario.calcularCoeficienteHidratacion()){
                usuarioMenor=usuario;
            }
        }
        return usuarioMenor;
    }
    public static void main(String args[]){
        Usuario u1=new Usuario("franco","hernandez",46443145,new Fecha(),new HashMap<>());
        Usuario u2=new Usuario("julian","alvarez",32470145,new Fecha(),new HashMap<>());
        Usuario u3=new Usuario("ian","cuker",45103145,new Fecha(),new HashMap<>());

        BebidaAlcoholica bal1=new BebidaAlcoholica("vodka",45);
        BebidaAzucarada baz1=new BebidaAzucarada("Coca-cola",9);
        BebidaNeutra bn1=new BebidaNeutra("agua",20,0);

        Sistema s1=new Sistema();

        HashMap<Bebida, Integer> bebidasEnStock=new HashMap<>();
        bebidasEnStock.put(bal1,10);
        bebidasEnStock.put(baz1,15);
        bebidasEnStock.put(bn1,20);
        s1.setStock(bebidasEnStock);

        HashSet<Usuario> nuevosUsuarios=new HashSet<>();
        nuevosUsuarios.add(u1);
        nuevosUsuarios.add(u2);
        s1.setUsuarios(nuevosUsuarios);


        try {
            s1.agregarUsuario(u3);
            s1.agregarUsuario(u2);
        } catch (DniRepetidoException e) {
            System.out.println(e.getMessage());
        }


        try {
            s1.consumicion(u1,bn1,3);
            s1.consumicion(u2,bn1,2);
        } catch (StockFaltanteException e) {
            System.out.println(e.getMessage());
        }

        System.out.println();
        u1.conocerCoeficienteHidratacion();


        try {
            System.out.println();
            System.out.println("El usuario " + s1.usuarioConMayorHidratacion().getNombre() + " es el que mayor hidratacion tiene con un valor de: "+ s1.usuarioConMayorHidratacion().calcularCoeficienteHidratacion());
            System.out.println();
            System.out.println("El usuario " + s1.usuarioConMenorHidratacion().getNombre() + " es el que menor hidratacion tiene con un valor de: "+ s1.usuarioConMenorHidratacion().calcularCoeficienteHidratacion());
        } catch (PersonasInexistentesException e) {
            System.out.println(e.getMessage());
        }
    }
}


package IntercambioObjetos;

import Enums.Color;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;

public class Sistema {
    private HashSet<Prestable>listaElementos;
    private HashSet<Trader>usuarios;

    public Sistema(){
        listaElementos=new HashSet<>();
        usuarios=new HashSet<>();
    }
    public Sistema(HashSet<Prestable> listaElementos,HashSet<Trader> usuarios) {
        this.listaElementos = listaElementos;
        this.usuarios=usuarios;
    }

    public HashSet<Prestable> getListaElementos() {
        return listaElementos;
    }

    public void setListaElementos(HashSet<Prestable> listaElementos) {
        this.listaElementos = listaElementos;
    }

    public HashSet<Trader> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(HashSet<Trader> usuarios) {
        this.usuarios = usuarios;
    }

    public void agregarElemento(Prestable elemento){
        if (elemento.agregarElemento()){
            listaElementos.add(elemento);
        }
    }
    public Boolean dar(Trader dador, Prestable objeto){
        usuarios.add(dador);
        if (dador.getPertenencias().contains(objeto) && objeto.prestar()){
            return true;
        } else if(!dador.getPertenencias().contains(objeto) && objeto.prestar()){
            System.out.println("Usted no tiene lo que quiere prestar");
            return false;
        } else {
            System.out.println("El objeto no puede ser prestado.");
            return false;
        }
    }
    public void recibir(Trader recibidor, Prestable objeto){
        usuarios.add(recibidor);
        recibidor.getPertenencias().add(objeto);
        System.out.println("Intercambio exitoso!!!!!!!");
    }
    public void ejecutarPrestamo(Trader prestador, Trader recibidor, Prestable objeto){
        if(dar(prestador,objeto)){
            prestador.getPertenencias().remove(objeto);
            recibir(recibidor,objeto);
        }
    }


    public static void main(String[] args){

        Sistema s1 = new Sistema();

        Remera remera1=new Remera(Color.AZUL,Material.SEDA,"Zara",false,true,34,65,90);
        Remera remera2=new Remera(Color.ROJO,Material.POLIESTER,"Zara",false,false,34,65,90);
        Pantalon pantalon1=new Pantalon(Color.AZUL,Material.SEDA,"Zara",false,true,34,65,90);
        Pantalon pantalon2=new Pantalon(Color.ROJO,Material.POLIESTER,"Zara",false,false,34,65,90);
        Revista revista1=new Revista(111111,"FashionHoy",2023, LocalDate.now());
        Revista revista2=new Revista(222222,"FashionEnero",2023, LocalDate.of(2023,1,31));
        HashMap<String,Integer> pagCapitulos=new HashMap<>();
        pagCapitulos.put("Capitulo1",20);

        Libro libro1=new Libro(0001,"LasCronicas",2000,pagCapitulos);
        libro1.agregarElemento();

        pagCapitulos.put("Capitulo2",20);
        Libro libro2=new Libro(0002,"LasCronicas2",2000,pagCapitulos);
        libro2.agregarElemento();

        pagCapitulos.put("Capitulo3",20);
        Libro libro3=new Libro(0003,"LasCronicas3",2000,pagCapitulos);
        libro3.agregarElemento();

        remera1.agregarElemento();
        System.out.println();
        remera2.agregarElemento();
        System.out.println();
        System.out.println();



        revista1.agregarElemento();
        revista2.agregarElemento();
    }
}

package ABMMascotas;

import java.util.HashSet;

public class Sistema {
    private HashSet<Animal> listadoMascotas;


    public Sistema() {
        listadoMascotas=new HashSet<>();
    }
    public Sistema(HashSet<Animal> listadoMascotas) {
        this.listadoMascotas = listadoMascotas;
    }

    public HashSet<Animal> getListadoMascotas() {
        return listadoMascotas;
    }

    public void setListadoMascotas(HashSet<Animal> listadoMascotas) {
        this.listadoMascotas = listadoMascotas;
    }

    public void altaMascota(String nombre, Duenio duenio, Tipo tipo){
        String aux= tipo.name();
        try {
            Class c=Class.forName(aux);
            Animal a=(Animal)c.newInstance();
            a.setNombre(nombre);
            a.setDuenio(duenio);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public void eliminarMascota(Animal mascota){
        listadoMascotas.remove(mascota);
    }
    public void modificarMascota(Animal nuevo, Animal viejo){
        listadoMascotas.remove(viejo);
        listadoMascotas.add(nuevo);
    }
    public void saludar(String nombreDuenio, String nombreMascota){
        for(Animal animal:listadoMascotas){
            if(animal.getNombre().equals(nombreMascota)){
                if(!(animal instanceof Pez)){
                    if(animal.getDuenio().getNombre().equals(nombreDuenio)){
                        animal.saludo();
                    }else if(!(animal instanceof Pajarito)){
                        String saludoExtranio=animal.saludo().toUpperCase()+"!";
                    }
                } else {

                }

            }
        }
    }
    
}

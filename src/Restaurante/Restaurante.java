package Restaurante;

import java.util.HashSet;

public class Restaurante implements Incorporaciones {
    private String nombre;
    private HashSet<Plato> menu;
    private Chef chef;

    public Restaurante(String nombre, HashSet<Plato> menu, Chef chef) {
        this.nombre=nombre;
        this.menu = menu;
        this.chef = chef;
    }

    public HashSet<Plato> getMenu() {
        return menu;
    }

    public void setMenu(HashSet<Plato> menu) {
        this.menu = menu;
    }

    public Chef getChef() {
        return chef;
    }

    public void setChef(Chef chef) {
        this.chef = chef;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void contratarChef(Chef chefNuevo) throws EdadException, ExperienciaException {
        if(chef.getEdad()<18) throw new EdadException();
        if(!chef.isExperienciaAnterior()) throw new ExperienciaException();
        System.out.println("El chef " + chefNuevo.getNombre() + " se unió al equipo de " + nombre);
        chef=chefNuevo;
    }

    @Override
    public void incorporarPlato(Plato plato) throws YaExisteException, ChefContratadoException {
        if(buscarPlato(plato)) throw new YaExisteException();
        if(!verificarHabilidadChef(plato)) throw new ChefContratadoException();
        System.out.println("El plato "+plato.getNombre()+"se agrego al menu de"+nombre);
    }
    public boolean buscarPlato(Plato platoNuevo){
        for(Plato plato:menu){
            if(plato.equals(platoNuevo)) return true;
        }
        return false;
    }
    public boolean verificarHabilidadChef(Plato platoNuevo){
        return platoNuevo.getChefACargo().equals(chef);
    }
}

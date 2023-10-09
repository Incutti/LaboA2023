package Restaurante;

import java.util.HashSet;

public class Restaurante implements Incorporaciones {
    private HashSet<Plato> menu;
    private Chef chef;

    public Restaurante(HashSet<Plato> menu, Chef chef) {
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

    @Override
    public void contratarChef(Chef chef) throws edadException {
        if(chef.getEdad()<18) throw new edadException();


    }

    @Override
    public void incorporarPlato(Plato plato) {

    }
}

package Restaurante;

public interface Incorporaciones {
    void contratarChef(Chef chef) throws EdadException, ExperienciaException;
    void incorporarPlato(Plato plato) throws YaExisteException, ChefContratadoException;
}

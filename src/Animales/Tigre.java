package Animales;

public class Tigre extends Felino{
    @Override
    public String getSonido(){
        return "Rugir";
    }
    @Override
    public String getAlimentacion(){
        return "Carnivoro";
    }
    @Override
    public String getHabitat(){
        return "Selva";
    }
    @Override
    public String getNombreCientifico(){
        return "Panthera tigris";
    }
}

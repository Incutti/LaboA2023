package Animales;

public class Lobo extends Canido {
    @Override
    public String getSonido(){
        return "Aullido";
    }
    @Override
    public String getAlimentacion(){
        return "Carnivoro";
    }
    @Override
    public String getHabitat(){
        return "Bosque";
    }
    @Override
    public  String getNombreCientifico(){
        return "Canis lupus";
    }
}

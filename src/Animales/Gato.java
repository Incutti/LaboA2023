package Animales;

public class Gato extends Felino{
    @Override
    public String getSonido(){
        return "Maullido";
    }
    @Override
    public String getAlimentacion(){
        return "Ratones";
    }
    @Override
    public String getHabitat(){
        return "Domestico";
    }
    @Override
    public  String getNombreCientifico(){
        return "Felis silvestris catus";
    }
}

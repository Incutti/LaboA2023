package ABMMascotas;

public class Gato extends Animal{
    public Gato(){
        super();
    }
    public Gato (String nombre, int alegria, Duenio duenio){
        super(nombre,alegria,duenio);
    }

    @Override
    public String saludo(boolean esDuenio){
        String sonido="";
        if(esDuenio){
            for(int i = 0; i <getAlegria() ; i++) {
                sonido=sonido+"miau ";
            }
        } else {
            for(int i = 0; i <getAlegria() ; i++) {
                sonido=sonido+"MIAU! ";
            }
        }
        if(getAlegria()>1) {
            setAlegria(getAlegria() - 1);
        }
        return sonido;
    }
    @Override
    public String tipo(){
        return "Gato";
    }

    @Override
    public void alimentar() {
        setAlegria(getAlegria()+1);
    }
}

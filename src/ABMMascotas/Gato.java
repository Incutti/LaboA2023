package ABMMascotas;

public class Gato extends Animal{
    public Gato(){
        super();
    }
    public Gato (String nombre, int alegria, Duenio duenio){
        super(nombre,alegria,duenio);
    }

    @Override
    public void saludo(){

        for (int i = 0; i <getAlegria() ; i++) {
            System.out.println("miau");
        }
        if(getAlegria()>1) {
            setAlegria(getAlegria() - 1);
        }
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

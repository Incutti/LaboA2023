package ABMMascotas;

public class Perro extends Animal{

    public Perro(java.lang.String nombre,Duenio duenio, int alegria) {
        super(nombre,alegria,duenio);
    }

    public Perro() {
        super();
    }

    @Override
    public String saludo(){
        String sonido="";
        for(int i = 0; i <getAlegria() ; i++) {
            sonido=sonido+"guau ";
        }
        if(getAlegria()>1) {
            setAlegria(getAlegria() - 1);
        }
        return sonido;
    }

    @Override
    public String tipo(){
        return "Perro";
    }

    @Override
    public void alimentar() {
        setAlegria(getAlegria()+1);
    }
}

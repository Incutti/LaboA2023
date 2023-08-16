package ABMMascotas;

public class Perro extends Animal{

    public Perro(String nombre,Duenio duenio, int alegria) {
        super(nombre,alegria,duenio);
    }

    public Perro() {
        super();
    }

    @Override
    public String saludo(boolean esDuenio){
        String sonido="";
        if(esDuenio){
            for(int i = 0; i <getAlegria() ; i++) {
                sonido=sonido+"guau ";
            }
        } else {
            for(int i = 0; i <getAlegria() ; i++) {
                sonido=sonido+"GUAU! ";
            }
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

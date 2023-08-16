package ABMMascotas;

public class Pajarito extends Animal{
    private boolean cantor;
    public Pajarito(){
        super();
        cantor=true;
    }

    public Pajarito(String nombre,boolean cantor,Duenio duenio, int alegria){
        super(nombre, alegria, duenio);
        this.cantor=cantor;
    }

    @Override
    public String saludo(boolean esDuenio) {
        String sonido="";
        if(esDuenio) {
            for (int i = 0; i < getAlegria(); i++) {
                if (cantor) {
                    sonido = sonido + "en la radio hay un pollito  ";
                } else {
                    sonido = sonido + "pio ";
                }
            }
        }
        if(getAlegria()>1) {
            setAlegria(getAlegria() - 1);
        }
        return sonido;
    }

    @Override
    public String tipo(){
        return "Pajarito";
    }
    @Override
    public void alimentar() {
        setAlegria(getAlegria()+1);
    }
}

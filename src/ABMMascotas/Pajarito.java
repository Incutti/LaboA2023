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
    public void saludo() {
        for (int i = 0; i <getAlegria() ; i++) {
            if (cantor){
                System.out.println("en la radio hay un pollito");
            }else{
                System.out.println("pio");
            }
        }
        if(getAlegria()>1) {
            setAlegria(getAlegria() - 1);
        }

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

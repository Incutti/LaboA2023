package EjercicioRepaso1;

public class CargadorPortatil extends SeccionCargadores{
    private int cantCargas;

    public int getCantCargas() {
        return cantCargas;
    }
    public void setCantCargas(int cantCargas) {
        this.cantCargas = cantCargas;
    }

    public CargadorPortatil() {
        super();
        cantCargas=10;
    }

    public CargadorPortatil(String nombre, double precio, int stock, int cantCargas) {
        super(nombre, precio, stock);
        this.cantCargas = cantCargas;
    }
}

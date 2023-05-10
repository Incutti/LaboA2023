package EjercicioRepaso1;

public class EquipoSonido extends SeccionMultimedia {
    private boolean moduloBluetooth;

    public boolean isModuloBluetooth(){
        return moduloBluetooth;
    }
    public void setModuloBluetooth(boolean moduloBluetooth){
        this.moduloBluetooth=moduloBluetooth;
    }
    public EquipoSonido(){
        super();
        moduloBluetooth=true;
    }
    public EquipoSonido(String nombre, double precio, int stock, boolean moduloBluetooth){
        super(nombre, precio, stock);
        this.moduloBluetooth=moduloBluetooth;
    }
}

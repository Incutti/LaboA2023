package Telefonia;
import java.util.ArrayList;

public class Sistema {
    private ArrayList<Llamada> registroLlamadas;
    private ArrayList<Empleado> empleadosRegistrados;
    public Sistema(){
        registroLlamadas= new ArrayList<Llamada>();
        empleadosRegistrados= new ArrayList<Empleado>();
    }

    public Sistema(ArrayList<Llamada> registroLlamadas, ArrayList<Empleado> empleadosRegistrados) {
        this.registroLlamadas = registroLlamadas;
        this.empleadosRegistrados = empleadosRegistrados;
    }

    public ArrayList<Llamada> getRegistroLlamadas() {
        return registroLlamadas;
    }

    public void setRegistroLlamadas(ArrayList<Llamada> registroLlamadas) {
        this.registroLlamadas = registroLlamadas;
    }

    public ArrayList<Empleado> getEmpleadosRegistrados() {
        return empleadosRegistrados;
    }

    public void setEmpleadosRegistrados(ArrayList<Empleado> empleadosRegistrados) {
        this.empleadosRegistrados = empleadosRegistrados;
    }

    public void registrarLlamada(Llamada llamada){
        registroLlamadas.add(llamada);
    }
    public ArrayList<Llamada> llamadaRealizadas(){
        ArrayList<Llamada> llamadasOrdenadas = new ArrayList<Llamada>();
        for(Empleado empleado:empleadosRegistrados){
            for(Llamada llamada:registroLlamadas){
                if(llamada.getEmpOrigen().equals(empleado)){
                    llamadasOrdenadas.add(llamada);
                }
            }
        }
        return llamadasOrdenadas;
    }
    public void rankingEmpleados(){
        int duracionTOP1 = 0, duracionTOP2 = 0, duracionTOP3 = 0;
        Empleado empleadoTOP1 = new Empleado(), empleadoTOP2 = new Empleado(), empleadoTOP3 = new Empleado();

        int duracionTemporal=0;
        for(Empleado empleado:empleadosRegistrados){
            for(Llamada llamada:registroLlamadas){
                if(llamada.getEmpOrigen().equals(empleado) && !llamada.getEmpDestino().getPais().equals(empleado.getPais())){
                    duracionTemporal+=llamada.getDuracion();
                }
            }
            if (duracionTemporal>duracionTOP1){
                duracionTOP3=duracionTOP2;
                duracionTOP2=duracionTOP1;
                empleadoTOP3=empleadoTOP2;
                empleadoTOP2=empleadoTOP1;
                duracionTOP1=duracionTemporal;
                empleadoTOP1=empleado;
            }else if(duracionTemporal>duracionTOP2){
                duracionTOP3=duracionTOP2;
                empleadoTOP3=empleadoTOP2;
                duracionTOP2=duracionTemporal;
                empleadoTOP2=empleado;
            } else if (duracionTemporal>duracionTOP3) {
                duracionTOP3=duracionTemporal;
                empleadoTOP3=empleado;
            }
            duracionTemporal=0;
        }
        System.out.println("Puesto 1: "+empleadoTOP1.getNombre()+" "+empleadoTOP1.getApellido()+" con "+duracionTOP1+" minutos");
        System.out.println("Puesto 2: "+empleadoTOP2.getNombre()+" "+empleadoTOP2.getApellido()+" con "+duracionTOP2+" minutos");
        System.out.println("Puesto 3: "+empleadoTOP3.getNombre()+" "+empleadoTOP3.getApellido()+" con "+duracionTOP3+" minutos");
    }
}

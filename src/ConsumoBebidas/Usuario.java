package ConsumoBebidas;

import Humanos.Persona;
import tiempo.Fecha;
import java.util.HashMap;
import java.util.Map;

public class Usuario extends Persona {
    private HashMap<Bebida, Integer>listaBebidasConsumidas;

    public Usuario(){
        listaBebidasConsumidas=new HashMap<>();
    }
    public Usuario(String nombre, String apellido, int dni, Fecha fechaNacimiento, HashMap<Bebida, Integer> listaBebidasConsumidas) {
        super(nombre, apellido, dni, fechaNacimiento);
        this.listaBebidasConsumidas = listaBebidasConsumidas;
    }

    public HashMap<Bebida, Integer> getListaBebidasConsumidas() {
        return listaBebidasConsumidas;
    }

    public void setListaBebidasConsumidas(HashMap<Bebida, Integer> listaBebidasConsumidas) {
        this.listaBebidasConsumidas = listaBebidasConsumidas;
    }

    public int calcularCoeficienteHidratacion(){
        int aux=0;
        for(Map.Entry<Bebida, Integer>bebida : listaBebidasConsumidas.entrySet()){
            aux=aux + bebida.getValue() * (bebida.getKey().getCoeficientePositividad() - bebida.getKey().getCoeficienteNegatividad());
        }

        return aux;
    }
    public void conocerCoeficienteHidratacion(){
        System.out.println(super.getNombre() + " tiene un coeficiente de hidratacion de: " + calcularCoeficienteHidratacion());
    }
}

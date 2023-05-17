package GuiaComplejidad;

import java.util.ArrayList;

public class Ejercicio3 {

    private ArrayList<Integer>listaMesetas;

    public ArrayList<Integer> getListaMesetas() {
        return listaMesetas;
    }

    public void setListaMesetas(ArrayList<Integer> listaMesetas) {
        this.listaMesetas = listaMesetas;
    }

    
    public Ejercicio3() {
        listaMesetas = new ArrayList<Integer>();
    }
    
    public int mesetaMasLarga () {
        int i = 0;
        int maxMeseta = 0;
        int contador=0;
        while ( i < listaMesetas.size () ) {
            int siguiente = i + 1;
            if(siguiente< listaMesetas.size() && listaMesetas.get(i).equals(listaMesetas.get(siguiente))){
                contador++;
            }
            if (contador>maxMeseta){
                maxMeseta = contador;
            }
            if(!listaMesetas.get(siguiente).equals(listaMesetas.get(i))){
                contador=0;
            }
        }
        return maxMeseta;
    }

}

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
        listaMesetas = new ArrayList<>();
    }



    public int mesetaMasLarga () {
        int i = 0;
        int maxMeseta = 0;
        int meseta;
        int anterior=0;
        int contador=0;
        while ( i < listaMesetas.size () ) {
            int j = i + 1;
            anterior=i-1;
            if(j< listaMesetas.size() && listaMesetas.get(i).equals(listaMesetas.get(j))){ // q la sgte sea igual y q exista sgte
                contador++;
            }
            meseta = j-i; // lo q dura
            i = j;
            if (meseta>maxMeseta){
                maxMeseta = meseta; // actualiza meseta mas grande
            }
        }
        return maxMeseta;
    }

}

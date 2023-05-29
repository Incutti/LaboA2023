package GuiaComplejidad;

public class Main {
    public static void main(String[] args) {
/*
// EJERCICIO 3 de guia complejidad

        ArrayList<Integer> listaMesetas= new ArrayList<Integer>();
        listaMesetas.add(1);
        listaMesetas.add(1);
        listaMesetas.add(2);
        listaMesetas.add(2);
        listaMesetas.add(2);
        listaMesetas.add(4);
        listaMesetas.add(3);

        int i = 0;
        int maxMeseta = 0;
        int contador=1;
        while ( i < listaMesetas.size () ) {
            int siguiente = i + 1;

            if(siguiente< listaMesetas.size()){
                if(listaMesetas.get(i).equals(listaMesetas.get(siguiente))){
                    contador++;
                } else{
                    if (contador>maxMeseta){
                        maxMeseta = contador;
                    }
                    contador=1;
                }
            }
            i++;
        }
        System.out.println(maxMeseta);


// EJERCICIO 6 de la guia de complejidad


        ArrayList<Integer> listaEnteros= new ArrayList<Integer>();
        listaEnteros.add(2);
        listaEnteros.add(6);
        listaEnteros.add(4);
        listaEnteros.add(2);
        listaEnteros.add(2);
        listaEnteros.add(4);
        listaEnteros.add(2);

        int i = 0;
        int maxMeseta = 0;
        int contador=0;
        while ( i < listaEnteros.size () ) {
            int siguiente = i + 1;
            if(siguiente< listaEnteros.size()){
                if(contador==0 && listaEnteros.get(i)%2!=0){
                    contador++;
                }
                if(listaEnteros.get(i).equals(listaEnteros.get(siguiente)) && listaEnteros.get(i)%2 !=0){
                    contador++;
                     else if (contador==1){
                        contador++;
                    }

                } else{
                    if (contador>maxMeseta){
                        maxMeseta = contador;

                    }
                    contador=0;
                }
            }
            i++;
        }
        System.out.println(maxMeseta);

// EJERCICIO 7 A de la guia de complejidad


        ArrayList<Boolean>columna = new ArrayList<Boolean>();
        ArrayList<ArrayList<Boolean>> matrizBooleana= new ArrayList<ArrayList<Boolean>>();

        columna.add(true);
        columna.add(false);
        columna.add(false);
        columna.add(true);
        columna.add(true);
        matrizBooleana.add(columna);

        boolean seRepite=false;
        for(int i = 0; i<matrizBooleana.size(); i++){
            for(int j=0; j<matrizBooleana.get(i).size(); j++){
                if(matrizBooleana.get(i)==matrizBooleana.get(j) && i!=j){
                    seRepite=true;
                }
            }
            if(!seRepite){
                System.out.println(matrizBooleana.get(i) + " es la fila que no se repite.");
            } else {
                seRepite=false;
            }
        }
        //tiempo de ejecucion de peor caso es: O(n²)


// EJERCICIO 7 B y C de la guia de complejidad

        ArrayList<Boolean>columna = new ArrayList<Boolean>();
        ArrayList<ArrayList<Boolean>> matrizBooleana= new ArrayList<ArrayList<Boolean>>();

        columna.add(true);
        columna.add(false);
        columna.add(false);
        columna.add(true);
        columna.add(true);
        matrizBooleana.add(columna);

        int contadorTrue=0;
        ArrayList<Boolean>vectorUnico=new ArrayList<Boolean>();

        for(int i=0; i<matrizBooleana.get(i).size(); i++){
            for (int j=0; j<matrizBooleana.size(); j++){
                if(matrizBooleana.get(j).get(i)){
                    contadorTrue++;
                }
            }
            if(contadorTrue%2==0){
                vectorUnico.add(false);
            } else {
                vectorUnico.add(true);
            }
        }
        //tiempo de ejecucion de peor caso es: O(n*m)
*/
// 8


        ArrayList<Integer>v1= new ArrayList<Integer>();
        ArrayList<Integer>v2= new ArrayList<Integer>();
        ArrayList<Integer>nuevoArray= new ArrayList<Integer>();

        int j=0, i=0;
        while(i<v1.size()){
            if(j<v2.size() && v1.get(i)>=v2.get(j)){
                nuevoArray.add(v2.get(j));
                j++;
            } else {
                nuevoArray.add(v1.get(i));
                i++;
            }
        }
        if(i<j){
            int diferencia=j-i;
            for(int k=0; k<diferencia;k++){
                nuevoArray.add(v2.get(v1.size()+k));
            }
        }
/*
// ej 9 guia complejidad

        ArrayList<Integer>v1= new ArrayList<Integer>();
        ArrayList<Integer>v2= new ArrayList<Integer>();
        ArrayList<Integer>v3= new ArrayList<Integer>();
        ArrayList<Integer>posicionesArray= new ArrayList<Integer>();

        int i=0, j=0, k=0;
        while(i<v1.size()){

            if(v1.get(i)<v2.get(j) && v1.get(i)<v3.get(k)){
                i++;
            } else if(j<v2.size() && v1.get(i)>v2.get(j) && v2.get(i)<v3.get(k)){
                j++;
            } else if(k<v3.size() && v3.get(i)<v1.get(j) && v1.get(i)>v3.get(k)){
                k++;
            } else if(v1.get(i)==v2.get(j) && v1.get(i)==v3.get(k)){
                posicionesArray.add(i);
                posicionesArray.add(j);
                posicionesArray.add(k);
            }
        }

// ej10 guia complejidad (use counting sort indirectamente)


        ArrayList<Integer>listaDe1a3= new ArrayList<Integer>();
        ArrayList<Integer>listaNueva= new ArrayList<Integer>();

        int cantidad=0;
        for(int i=1;i<=3;i++){
            for (int j=0;j<listaDe1a3.size();j++){
                if(i==listaDe1a3.get(j)){
                    cantidad++;
                }
            }
            for(int k=0; k<cantidad;k++){
                listaNueva.add(i);
            }
            cantidad=0;
        }
*/
    }
}

package unidad0;

public class DivisibleFor {
    public static void main(String[] args) {
        for(int contador=1; contador<=100;contador++){
            if(contador%2==0 && contador%3==0){
                System.out.println(contador);
            }
        }
    }
}
package Calculadora;

public abstract class Operacion {
    public static double sumar(double num1, double num2){
        return num1+num2;
    }
    public static double restar(double num1, double num2){
        return num1-num2;
    }

    public static void main(String args[]){
        System.out.print("La suma de 2+4 es ");
        System.out.println(Operacion.sumar(2, 4));
        System.out.print("La resta de 6-2 es ");
        System.out.println(Operacion.restar(6, 2));
    }
}

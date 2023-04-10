package Formitas;

public class Rectangulo extends FiguraGeometrica {
    private float base;
    private float altura;

    public Rectangulo() {
        this.base = 1;
        this.altura = 5;
    }
    public Rectangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public float getAltura() {
        return altura;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public double area(){
        return base*altura;
    }

    @Override
    public double perimetro (){
        return base*2+altura*2;
    }
}


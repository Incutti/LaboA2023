public class Circulo {

    private float radio;

    public Circulo() {
        this.radio=2;
    }

    public Circulo(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public double area(float radio){
        double area=Math.PI * Math.pow(radio, 2);
        return area;
    }
    public double perimetro(float radio){
        double perimetro=2*Math.PI*radio;
        return perimetro;
    }
}

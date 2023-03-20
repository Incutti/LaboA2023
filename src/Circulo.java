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

    public double area(){
        return Math.PI * Math.pow(radio, 2);
    }
    public double perimetro(){
        return 2*Math.PI*radio;
    }
}

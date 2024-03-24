public class Circulo implements FigurasGeometrica {
    private double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public Circulo() {
    }

    @Override
    public double calcularArea(){
        return Math.PI*Math.pow(radio,2);
    }

    @Override
    public double calcularPerimetro() {
      return 2*Math.PI*radio;
    }


}

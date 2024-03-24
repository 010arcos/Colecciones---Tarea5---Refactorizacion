public class Rectangulo implements FigurasGeometrica {
    private double largo;
    private double ancho;

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public Rectangulo(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    public Rectangulo() {
    }

    @Override
    public double calcularArea(){
        return this.ancho*this.largo;
    }

    @Override
    public double calcularPerimetro() {
        return (this.largo*2)+(this.ancho*2);
    }
}

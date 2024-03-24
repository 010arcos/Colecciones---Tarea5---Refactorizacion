public class FigurasFactory {

    public FigurasGeometrica crearFigura(TipoFigura tipoFigura, double... args){
        return switch (tipoFigura){
            case Triangulo -> new Triangulo(args[0], args[1], args[2]);
            case Rectangulo -> new Rectangulo(args[0], args[1]);
            case Circulo -> new Circulo(args[0]);


        };
    }


}

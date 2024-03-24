import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FigurasFactory figurasFactory = new FigurasFactory();
        boolean continuar = true;

        do {
            try {
                System.out.println("-------------------------------------");
                System.out.println(" ");
                System.out.println("Selecciona el Tipo de figura:\n 1: Triangulo.\n 2: " +
                        "Rectangulo.\n 3: Circulo.\n 0: Salir del programa.");
                int tipo = sc.nextInt();
                sc.nextLine();

                switch (tipo) {
                    case 1:


                        double lado1, lado2, lado3;
                        boolean ladosValidos;



                        do {
                            System.out.println("Introduce el lado 1:");
                            lado1 = sc.nextDouble();

                            System.out.println("Introduce el lado 2:");
                            lado2 = sc.nextDouble();

                            System.out.println("Introduce el lado 3:");
                            lado3 = sc.nextDouble();

                            // Validar para que tome las medidas de un triangulo real
                            ladosValidos = lado1 > 0 && lado2 > 0 && lado3 > 0 && lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1;

                            if (!ladosValidos) {
                                System.out.println("Los lados no forman un triángulo válido. Inténtalo de nuevo.");
                            }
                        } while (!ladosValidos);
                        FigurasGeometrica triangulo = new Triangulo(lado1, lado2, lado3);

                        System.out.println("¿Qué deseas calcular?\n 1: Área.\n 2: Perímetro.\n 3: Área y Perímetro.");
                        int opcionTriangulo = sc.nextInt();
                        sc.nextLine();

                        if (opcionTriangulo == 1 || opcionTriangulo == 3) {
                            System.out.println("El área del Triángulo es " + triangulo.calcularArea());
                        }
                        if (opcionTriangulo == 2 || opcionTriangulo == 3) {
                            System.out.println("El perímetro del Triángulo es " + triangulo.calcularPerimetro());
                        }
                        break;

                    case 2:
                        System.out.println("Introduce el largo");
                        double largo = sc.nextDouble();
                        System.out.println("Introduce el ancho");
                        double ancho = sc.nextDouble();
                        FigurasGeometrica rectangulo = figurasFactory.crearFigura(TipoFigura.Rectangulo, ancho, largo);

                        System.out.println("¿Qué deseas calcular?\n 1: Área.\n 2: Perímetro.\n 3: Área y Perímetro..");
                        int opcionRectangulo = sc.nextInt();
                        sc.nextLine();

                        if (opcionRectangulo == 1 || opcionRectangulo == 3) {
                            System.out.println("El área del Rectángulo es " + rectangulo.calcularArea());
                        }
                        if (opcionRectangulo == 2 || opcionRectangulo == 3) {
                            System.out.println("El perímetro del Rectángulo es " + rectangulo.calcularPerimetro());
                        }
                        break;

                    case 3:
                        System.out.println("Introduce el radio");
                        double radio = sc.nextDouble();
                        FigurasGeometrica circulo = figurasFactory.crearFigura(TipoFigura.Circulo, radio);

                        System.out.println("¿Qué deseas calcular?\n 1: Área.\n 2: Perímetro.\n 3: Área y Perímetro.");
                        int opcionCirculo = sc.nextInt();
                        sc.nextLine();

                        if (opcionCirculo == 1 || opcionCirculo == 3) {
                            System.out.println("El área del Círculo es " + circulo.calcularArea());
                        }
                        if (opcionCirculo == 2 || opcionCirculo == 3) {
                            System.out.println("El perímetro del Círculo es " + circulo.calcularPerimetro());
                        }
                        break;

                    case 0:
                        System.out.println("¡Hasta Luego!");
                        continuar = false;
                        break;

                    default:
                        System.out.println("Opción no válida. Inténtalo de nuevo.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Se ha introducido un tipo de dato incorrecto. Por favor, intenta nuevamente.");
                sc.nextLine();
            }
        } while (continuar);
    }
}

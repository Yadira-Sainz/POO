import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        int opcion;
        Scanner lector = new Scanner(System.in);


        do {
            System.out.println("***** MENÚ PRINCIPAL *****");
            System.out.println("1.- Circulo");
            System.out.println("2.- Triángulo (rectangulo)");
            System.out.println("3.- Cuadrado");
            System.out.println("4.- Elipse");
            System.out.println("0.- Salir");
            opcion = lector.nextInt();

            switch (opcion){
                case 0:
                    System.out.println("Fin del programa...");
                    break;
                case 1:
                    System.out.println("***** CALCULAR ÁREA Y PERÍMETRO DE UN CÍRCULO *****");
                    System.out.println("Ingresa el radio del circulo");
                    int r = lector.nextInt();
                    Circulo circulo = new Circulo(r);
                    int opcCirculo;
                    do {
                        System.out.println("Elige la opción que deseas calcular");
                        System.out.println("1.- Calcular área del circulo");
                        System.out.println("2.- Calcular perímetro del circulo");
                        System.out.println("0.- Regresar al menú principal");
                        opcCirculo = lector.nextInt();
                        switch (opcCirculo) {
                            case 0:
                                break;
                            case 1:
                                System.out.println("El área del circulo es: " + circulo.calcularArea());
                                break;
                            case 2:
                                System.out.println("El perímetro del circulo es: " + circulo.calcularPerimetro());
                                break;
                        }
                        System.out.println("Presiona enter para regresar al menú anterior...");
                        try {
                            System.in.read();
                        } catch (Exception e) {
                        }

                    } while (opcCirculo != 0);
                    break;

                case 2:
                    System.out.println("***** CALCULAR ÁREA Y PERÍMETRO DE UN TRIÁNGULO *****");
                    System.out.println("Ingresa la base del triángulo: ");
                    double base = lector.nextDouble();
                    System.out.println("Ingresa la altura del trángulo: ");
                    double altura = lector.nextDouble();
                    Triangulo triangulo = new Triangulo(base, altura);

                    int opcTriangulo;
                    do {
                        System.out.println("Elige la opción que deseas calcular");
                        System.out.println("1.- Calcular área del triángulo");
                        System.out.println("2.- Calcular perímetro del triángulo");
                        System.out.println("0.- Regresar al menú principal");
                        opcTriangulo = lector.nextInt();
                        switch (opcTriangulo) {
                            case 0:
                                break;
                            case 1:
                                System.out.println("El área del triángulo es: " + triangulo.calcularArea());
                                break;
                            case 2:
                                System.out.println("El perímetro del triángulo es : " + triangulo.calcularPerimetro());
                                break;
                        }
                        System.out.println("Presiona enter para regresar al menú anterior...");
                        try {
                            System.in.read();
                        } catch (Exception e) {
                        }

                    } while (opcTriangulo != 0);
                    break;

                case 3:
                    System.out.println("***** CALCULAR ÁREA Y PERÍMETRO DE UN CUADRADO *****");
                    System.out.println("Ingresa el lado del cuadrado: ");
                    double lado = lector.nextDouble();
                    Cuadrado cuadrado = new Cuadrado(lado);

                    int opcCuadrado;
                    do {
                        System.out.println("Elige la opción que deseas calcular");
                        System.out.println("1.- Calcular área del cuadrado");
                        System.out.println("2.- Calcular perímetro del cuadrado");
                        System.out.println("0.- Regresar al menú principal");
                        opcCuadrado = lector.nextInt();
                        switch (opcCuadrado) {
                            case 0:
                                break;
                            case 1:
                                System.out.println("El área del cuadrado es: " + cuadrado.calcularArea());
                                break;
                            case 2:
                                System.out.println("El perímetro del cuadrado es: " + cuadrado.calcularPerimetro());
                                break;
                        }
                        System.out.println("Presiona enter para regresar al menú anterior...");
                        try {
                            System.in.read();
                        } catch (Exception e) {
                        }

                    } while (opcCuadrado != 0);
                    break;

                case 4:
                    System.out.println("***** CALCULAR ÁREA Y PERÍMETRO DE UN ELIPSE *****");
                    System.out.println("Ingresa el lado A del elipse: ");
                    double ladoA = lector.nextDouble();
                    System.out.println("Ingresa el lado B del elipse: ");
                    double ladoB = lector.nextDouble();
                    Elipse elipse = new Elipse(ladoA, ladoB);

                    int opcElipse;
                    do {
                        System.out.println("Elige la opción que deseas calcular");
                        System.out.println("1.- Calcular área del elipse");
                        System.out.println("2.- Calcular perímetro del elipse");
                        System.out.println("0.- Regresar al menú principal");
                        opcElipse = lector.nextInt();
                        switch (opcElipse) {
                            case 0:
                                break;
                            case 1:
                                System.out.println("El área del elipse es: " + elipse.calcularArea());
                                break;
                            case 2:
                                System.out.println("El perímetro del elipse es: " + elipse.calcularPerimetro());
                                break;
                        }
                        System.out.println("Presiona enter para regresar al menú anterior...");
                        try {
                            System.in.read();
                        } catch (Exception e) {
                        }

                    } while (opcElipse != 0);
                    break;

            }

        }while(opcion != 0);
        }

}

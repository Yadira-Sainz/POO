import java.util.Scanner;

public class TestCalculadora {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int opcion;
        Scanner lector = new Scanner(System.in);
        do {
            System.out.println("1.- Número Perfecto");
            System.out.println("2.- Numeros Amigos");
            System.out.println("3.- Suma");
            System.out.println("4.- Resta");
            System.out.println("5.- División");
            System.out.println("6.- Multiplicación");
            System.out.println("7.- Número par");
            System.out.println("8.- Número primo");
            System.out.println("9.- Factorial");
            System.out.println("Opcion: ");
            opcion = lector.nextInt();
            switch (opcion) {
                case 0:
                    System.out.println("Fin del programa...");
                    break;
                case 1:
                    double n;
                    System.out.println("Ingresa el número: ");
                    n = lector.nextDouble();
                    if (calculadora.numeroPerfecto(n))
                        System.out.println(n + " es un número perfecto");
                    else
                        System.out.println(n + " no es un número perfecto");
                    break;
                case 2:
                    double n1, n2;
                    System.out.println("Ingresa un número: ");
                    n1 = lector.nextDouble();
                    System.out.println("Ingresa otro número: ");
                    n2 = lector.nextDouble();
                    if (calculadora.numerosAmigos(n1, n2))
                        System.out.println("Es un número amigo");
                    else
                        System.out.println("No es un número amigo");
                    break;
                case 3:
                    double s1, s2;
                    System.out.println("Ingresa el primer número: ");
                    s1 = lector.nextDouble();
                    System.out.println("Ingresa el segundo número");
                    s2 = lector.nextDouble();
                    System.out.println("La suma es: " + calculadora.sumar(s1, s2));
                    break;
                case 4:
                    double r1, r2;
                    System.out.println("Ingresa el primer número: ");
                    r1 = lector.nextDouble();
                    System.out.println("Ingresa el segundo número: ");
                    r2 = lector.nextDouble();
                    System.out.println("La resta es: " + calculadora.restar(r1, r2));
                    break;
                case 5:
                    double d1, d2;
                    System.out.println("Ingresa el primer número: ");
                    d1 = lector.nextDouble();
                    System.out.println("Ingresa el segundo número: ");
                    d2 = lector.nextDouble();
                    System.out.println("La división es: " + calculadora.dividir(d1, d2));
                    break;
                case 6:
                    double m1, m2;
                    System.out.println("Ingresa el primer número: ");
                    m1 = lector.nextDouble();
                    System.out.println("Ingresa el segundo número: ");
                    m2 = lector.nextDouble();
                    System.out.println("La multiplicación es: " + calculadora.multiplicar(m1, m2));
                    break;
                case 7:
                    int p1;
                    System.out.println("Ingresa un número: ");
                    p1 = lector.nextInt();
                    if (calculadora.par(p1))
                        System.out.println(p1 + " es par");
                    else
                        System.out.println(p1 + " es impar");
                    break;
                case 8:
                    int primo;
                    System.out.println("Ingresa un número: ");
                    primo = lector.nextInt();
                    if (calculadora.numeroPrimo(primo))
                        System.out.println(primo + " es primo");
                    else
                        System.out.println(primo + " no es primo");
                    break;
                case 9:
                    double f1;
                    System.out.println("Ingresa un número: ");
                    f1 = lector.nextDouble();
                    System.out.println("El factorial es: " + calculadora.factorial(f1));
                    break;
            }
        } while (opcion != 0);
    }
}

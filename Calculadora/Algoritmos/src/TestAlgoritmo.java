import java.util.Scanner;

public class TestAlgoritmo {
    public static void main(String[] args) {
        Algoritmos algoritmos = new Algoritmos();
        int opc;
        Scanner lector = new Scanner(System.in);
        do {
            System.out.println("1.- Área de un Triangulo");
            System.out.println("2.- Área de un círculo");
            System.out.println("3.- Promedio de un alumno");
            System.out.println("4.- Conversión de temperatura Grados a Fahrenheit");
            System.out.println("5.- Calcular la tasa de interes del prestamo");
            System.out.println("6.- Calcular salario neto");
            System.out.println("7.- Calcular el salario ordinario más las horas extras");
            System.out.println("8.- Calcular dias, horas y minutos");
            System.out.println(("9.- Conversor de metros a centimetros, kilometros, pulgadas y pies"));
            System.out.println("10.- Consumo de gasolina");
            opc = lector.nextInt();
            switch (opc){
                case 0:
                    System.out.println("Fin del programa.");
                    break;

                case 1:
                    double base, altura;
                    System.out.println("Ingresa la base del triangulo: ");
                    base = lector.nextDouble();
                    System.out.println("Ingresa la altura del triangulo: ");
                    altura = lector.nextDouble();
                    System.out.println("El área del triangulo es: " + algoritmos.areaTriangulo(base, altura));
                    break;
                case 2:
                    double radio;
                    System.out.println("Ingresa el radio del circulo: ");
                    radio = lector.nextDouble();
                    System.out.println("El área del circulo es igual a: " + algoritmos.areaCirculo(radio));
                    break;
                case 3:
                    int p1, p2, p3, p4, p5;
                    System.out.println("Ingresa la calificación 1:");
                    p1 = lector.nextInt();
                    System.out.println("Ingresa la calificación 2:");
                    p2 = lector.nextInt();
                    System.out.println("Ingresa la calificación 3:");
                    p3 = lector.nextInt();
                    System.out.println("Ingresa la calificación 4:");
                    p4 = lector.nextInt();
                    System.out.println("Ingresa la calificación 5:");
                    p5 = lector.nextInt();
                    System.out.println("El promedio del alumno es: " + algoritmos.promedio(p1,p2,p3,p4,p5));
                    break;
                case 4:
                    float celsius;
                    System.out.println("Ingresa los grados celsius:");
                    celsius = lector.nextFloat();
                    System.out.println("La conversión a grados Fahrenheit es: " + algoritmos.gradosCentigrados(celsius));
                    break;
                case 5:
                    float tasa;
                    System.out.println("Ingresa la cantidad de la cual quieres saber la tasa de interes:");
                    tasa = lector.nextFloat();
                    System.out.println("La tasa de interés es: " + algoritmos.prestamoBanco(tasa));
                    break;
                case 6:
                    double horas, tarifa, isr;
                    System.out.println("Ingresa el número de horas trabajadas:");
                    horas = lector.nextDouble();
                    System.out.println("Ingresa el pago por hora:");
                    tarifa = lector.nextDouble();
                    System.out.println("Ingresa la tasa de impuestos:");
                    isr = lector.nextDouble();
                    System.out.println("El sueldo neto es: " + algoritmos.salarioNeto(horas, tarifa, isr));
                    break;
                case 7:
                    double hrs, pagoHora;
                    System.out.println("Ingresa el número de horas trabajadas:");
                    hrs = lector.nextDouble();
                    System.out.println("Ingresa el pago por hora:");
                    pagoHora = lector.nextDouble();
                    System.out.println("El sueldo con las horas extras es: " + algoritmos.salarioConHrsExtras(hrs, pagoHora));
                    break;
                case 8:
                    int minutos;
                    System.out.println("Ingresa los minutos:");
                    minutos = lector.nextInt();
                    algoritmos.tiempo(minutos);
                    break;
                case 9:
                    float metros;
                    System.out.println("Ingresa los metros: ");
                    metros = lector.nextFloat();
                    algoritmos.conversorMetros(metros);
                    break;
                case 10:
                    int kms, precio, dineroGastado, tiempoHora = 0, tiempoMinutos = 0;
                    System.out.println("Ingresa el total de kilometros recorridos:");
                    kms = lector.nextInt();
                    System.out.println("Ingresa el precio de la gasolina por litro:");
                    precio = lector.nextInt();
                    System.out.println("Ingresa el dinero gastado en el viaje");
                    dineroGastado = lector.nextInt();
                    System.out.println("Ingresa el tiempo que se tardo en HORAS");
                    tiempoHora = lector.nextInt();
                    System.out.println("Ingresa el tiempo que se tardo en MINUTOS");
                    tiempoMinutos = lector.nextInt();
                    algoritmos.consumoGasolina(kms, precio, dineroGastado, tiempoHora, tiempoMinutos);
            }
        } while (opc != 0);
    }
}

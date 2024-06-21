import java.util.Scanner;

public class TestCondicionales {
    public static void main(String[] args) {
        Condicionales condicionales = new Condicionales();
        int opc;
        Scanner lector = new Scanner(System.in);
        do {
            System.out.println("1.- Determinar si eres mayor de edad o no");
            System.out.println("2.- Determinar en que etapa de la vida se encuentra");
            System.out.println("3.- Determinar el número mayor");
            System.out.println("4.- Determinar si el número es positivo, negativo o neutro");
            System.out.println("5.- Determinar si el número es par o impar");
            System.out.println("6.- Determinar el incremente al salario por la categoria en la que esta");
            System.out.println("7.- Determinar si es apto para el servicio militar");
            System.out.println("8.- Comisión correspondiente a una venta");
            System.out.println("9.- Aumento salarial por categoria");
            System.out.println("10.- Calcular el valor x y de y segun la función");
            opc = lector.nextInt();

            switch (opc) {
                case 0:
                    System.out.println("Fin del programa.");
                    break;
                case 1:
                    condicionales.mayorDeEdad();
                    break;
                case 2:
                    condicionales.etapaDeVida();
                    break;
                case 3:
                    condicionales.numeroMayor();
                    break;
                case 4:
                    condicionales.numeroPositivo();
                    break;
                case 5:
                    condicionales.parImpar();
                    break;
                case 6:
                    condicionales.incrementoSueldo();
                    break;
                case 7:
                    condicionales.servicioMilitar();
                    break;
                case 8:
                    condicionales.comisionVenta();
                    break;
                case 9:
                    condicionales.aumentoSalarial();
                    break;
                case 10:
                    condicionales.calcularFuncion();
                    break;
            }
            System.out.println();
            System.out.println("Presiona enter para continuar...");
            try {
                System.in.read();
            } catch (Exception e) {
            }
        } while (opc != 0);
    }
}

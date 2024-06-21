import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Holis");
        MoldeCuadrado pastelDeChocolate = new MoldeCuadrado();
        pastelDeChocolate.alto = 10;
        pastelDeChocolate.ancho = 5;
        pastelDeChocolate.largo = 20;
        pastelDeChocolate.imprimirVolumen();
        MoldeCuadrado pastelZanahoria = new MoldeCuadrado();
        pastelZanahoria.alto = 5;
        pastelZanahoria.ancho = 5;
        pastelZanahoria.largo = 5;
        pastelZanahoria.imprimirVolumen();
        pastelDeChocolate.imprimirVolumen();
        Scanner leer = new Scanner(System.in);
        System.out.println("Introce un numero");
        int num = leer.nextInt();
        System.out.println(num);
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opc;
        Scanner lector = new Scanner(System.in);
        Archivos archivo = new Archivos();

        do{
            System.out.println("##### MENÚ PRINCIPAL #####");
            System.out.println("1.- Agregar");
            System.out.println("2.- Calcular");
            System.out.println("0.- Salir");
            opc = lector.nextInt();

            switch (opc){
                case 0:
                    System.out.println("Fin del programa...");
                    break;
                case 1:
                    System.out.println("##### AGREGAR NÚMERO #####");
                    System.out.println("Ingresa el número");
                    int num = lector.nextInt();
                    archivo.agregar(num);
                    break;
                case 2:
                    System.out.println("##### IMPRIMIR ESTRELLAS #####");
                    archivo.calcular();
                    break;

            }

        }while (opc != 0);
    }
}

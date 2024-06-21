import java.util.Scanner;

public class TestFecha {
    public static void main(String[] args) {
        Fecha fechaUno = new Fecha();
        int dia, mes, anio;
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingresa el dia: ");
        dia = lector.nextInt();
        System.out.println("Ingresa el mes: ");
        mes = lector.nextInt();
        System.out.println("Ingresa el año: ");
        anio = lector.nextInt();
        Fecha fechaDos = new Fecha(dia, mes, anio);


        System.out.println("Fecha por default");
        System.out.println(fechaUno.getDia() + "/" + fechaUno.getMes() + "/" + fechaUno.getAnio());
        System.out.println("Fecha ingresada por el usuario");
        System.out.println(fechaDos.getDia() + "/" + fechaDos.getMes() + "/" + fechaDos.getAnio());
    }
}

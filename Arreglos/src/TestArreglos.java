import java.util.Scanner;

public class TestArreglos {

    public static void main(String[] args){
        Arreglos arreglos = new Arreglos();
        Scanner lector = new Scanner(System.in);

        int opc;

        do{
            System.out.println("1.- Sumar elementos de un vector");
            System.out.println("2.- Sumar elementos de una matriz");
            System.out.println("3.- Sumar dos matrices");
            System.out.println("4.- Restar dos matrices");
            System.out.println("5.- Sumar columna");
            System.out.println("6.- Sumar renglón");
            opc= lector.nextInt();

            switch (opc){
                case 0:
                    System.out.println("Fin del programa...");
                    break;
                case 1:
                    System.out.println("*****Suma de elementos de vector*****");
                    System.out.println("Tamaño del arreglo:");
                    arreglos.setCol(lector.nextInt());
                    arreglos.setVector(arreglos.crearArreglo(arreglos.getCol()));
                    int suma = arreglos.sumar(arreglos.getVector());
                    System.out.println("La suma del arreglo: ");
                    arreglos.imprimir(arreglos.getVector());
                    System.out.println();
                    System.out.println("es: " + suma);
                    break;
                case 2:
                    System.out.println("*****Suma de elementos de matriz*****");
                    System.out.println("Tamaño de la dimensión 1:");
                    arreglos.setCol(lector.nextInt());
                    System.out.println("Tamaño de la dimensión 2:");
                    arreglos.setRen(lector.nextInt());
                    arreglos.setMatriz1(arreglos.crearArreglo(arreglos.getCol(), arreglos.getRen()));
                    int sum = arreglos.sumar(arreglos.getMatriz1());
                    System.out.println("La suma de los elementos de la matriz: ");
                    arreglos.imprimir(arreglos.getMatriz1());
                    System.out.println();
                    System.out.println("es: " + sum);
                    break;
                case 3:
                    System.out.println("*****Suma de dos matrices*****");
                    System.out.println("Tamaño de la dimensión 1:");
                    arreglos.setCol(lector.nextInt());
                    System.out.println("Tamaño de la dimensión 2:");
                    arreglos.setRen(lector.nextInt());
                    System.out.println("Ingresa los valores de la matriz 1:");
                    arreglos.setMatriz1(arreglos.crearArreglo(arreglos.getCol(), arreglos.getRen()));
                    System.out.println("Ingresa los valores de la matriz 2:");
                    arreglos.setMatriz2(arreglos.crearArreglo(arreglos.getCol(), arreglos.getRen()));
                    System.out.println("Matriz 1:");
                    arreglos.imprimir(arreglos.getMatriz1());
                    System.out.println("Matriz 2:");
                    arreglos.imprimir(arreglos.getMatriz2());
                    System.out.println("La suma resultante de las matries es:");
                    arreglos.setMatrizResultante(arreglos.sumar(arreglos.getMatriz1(), arreglos.getMatriz2()));
                    arreglos.imprimir(arreglos.getMatrizResultante());
                    break;
                case 4:
                    System.out.println("*****Resta de dos matrices*****");
                    System.out.println("Tamaño de la dimensión 1:");
                    arreglos.setCol(lector.nextInt());
                    System.out.println("Tamaño de la dimensión 2:");
                    arreglos.setRen(lector.nextInt());
                    System.out.println("Ingresa los valores de la matriz 1:");
                    arreglos.setMatriz1(arreglos.crearArreglo(arreglos.getCol(), arreglos.getRen()));
                    System.out.println("Ingresa los valores de la matriz 2:");
                    arreglos.setMatriz2(arreglos.crearArreglo(arreglos.getCol(), arreglos.getRen()));
                    System.out.println("Matriz 1:");
                    arreglos.imprimir(arreglos.getMatriz1());
                    System.out.println("Matriz 2:");
                    arreglos.imprimir(arreglos.getMatriz2());
                    System.out.println("La resta resultante de las matrices es:");
                    arreglos.setMatrizResultante(arreglos.restar(arreglos.getMatriz1(), arreglos.getMatriz2()));
                    arreglos.imprimir(arreglos.getMatrizResultante());
                    break;
                case 5:
                    System.out.println("*****Suma de elementos de la columna deseada*****");
                    System.out.println("Tamaño de la dimensión 1:");
                    arreglos.setCol(lector.nextInt());
                    System.out.println("Tamaño de la dimensión 2:");
                    arreglos.setRen(lector.nextInt());
                    arreglos.setMatriz1(arreglos.crearArreglo(arreglos.getCol(), arreglos.getRen()));
                    arreglos.imprimir(arreglos.getMatriz1());
                    System.out.println("Ingrese el índice de la columna que desea sumar:");
                    int columnaDeseada = lector.nextInt();
                    int sumaColumna = arreglos.sumar(columnaDeseada, arreglos.getMatriz1());
                    System.out.println("La suma de los elementos de la columna " + columnaDeseada + " es: " + sumaColumna);
                    break;
                case 6:
                    System.out.println("*****Suma de elementos del renglón deseado*****");
                    System.out.println("Tamaño de la dimensión 1:");
                    arreglos.setCol(lector.nextInt());
                    System.out.println("Tamaño de la dimensión 2:");
                    arreglos.setRen(lector.nextInt());
                    arreglos.setMatriz1(arreglos.crearArreglo(arreglos.getCol(), arreglos.getRen()));
                    arreglos.imprimir(arreglos.getMatriz1());
                    System.out.println("Ingrese el índice del renglón que desea sumar:");
                    int renglonDeseado = lector.nextInt();
                    int sumaRenglon = arreglos.sumar(arreglos.getMatriz1(),renglonDeseado);
                    System.out.println("La suma de los elementos del renglón " + renglonDeseado + " es: " + sumaRenglon);
                    break;
            }
            System.out.println("Presiona enter para continuar...");
            try {
                System.in.read();
            }catch (Exception e){
            }
        } while (opc != 0);
    }
}

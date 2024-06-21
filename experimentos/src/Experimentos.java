import java.util.Scanner;

public class Experimentos {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

       /* System.out.println("Valor: ");
        int i = lector.nextInt();
        int miArra[] = new int[i];
        miArra[0]=0;
        miArra[1]=0;
        miArra[2]=0;
        miArra[3]=0;
        miArra[4]=0;
        System.out.println("Donde va");
        int p = lector.nextInt(); //p= posicion
        System.out.println("que valor");
        int v = lector.nextInt(); //v= valor
        miArra[p] = v;
        for (int d = 0; d < i; d++ ){
            System.out.println(miArra[d]);
        }*/
        //System.out.println(miArra[0]);
        //System.out.println(miArra[1]);
        //System.out.println(miArra[2]);
        //System.out.println(miArra[3]);
        //System.out.println(miArra[4]);

//Vector dimensional
    /*    System.out.println("Tamaño del array");
        int tamanio = lector.nextInt();
        int array[] = new int[tamanio];{
            for(int valorParaLaPosicion = 0; valorParaLaPosicion < tamanio; valorParaLaPosicion++){
                System.out.println((valorParaLaPosicion + 1) + " cuales son los valor");
                array[valorParaLaPosicion] = lector.nextInt();
            }
        }
        for(int i = 0; i < tamanio; i++){
            System.out.println(array[i]);
        }

        int vector[];
        vector = new int[5];*/

    /*    System.out.println("tamaño del renglon");
        int y = lector.nextInt();
        System.out.println("tamaño de la columna");
        int x = lector.nextInt();
        int dobleArray[][] = new int [y][x];
        for(int valorPosicion = 0; valorPosicion < y; valorPosicion++){
            System.out.println((valorPosicion + 1) + " valor renglones");
            dobleArray[valorPosicion][valorPosicion] = lector.nextInt();
        }
        for(int columna = 0; columna < x; columna++){
            System.out.println((columna + 1) + " valor columna");
            dobleArray[columna][columna] = lector.nextInt();
        }

        for(int impresion = 0; impresion < y; impresion++) {
            System.out.println(dobleArray[impresion]);
        }
            for(int impresion2 = 0; impresion2 < x; impresion2++){
                    System.out.println(dobleArray[impresion2]);
            }
*/
     /*   int x = 3;
        int y = 3;
        int arrayBidimen[][] = new int[x][y];
        arrayBidimen[0][0]= 10;
        arrayBidimen[1][0]= 20;
        arrayBidimen[2][0]= 30;
        arrayBidimen[0][1]= 100;
        arrayBidimen[1][1]= 200;
        arrayBidimen[2][1]= 300;
        arrayBidimen[0][2]= 1000;
        arrayBidimen[1][2]= 2000;
        arrayBidimen[2][2]= 3000;

        for (int d = 0; d < 3; d++ ) {
            System.out.println(arrayBidimen[d][0]); //posicion 
        }
        for (int d1 = 0; d1 < 3; d1++ ) {
            System.out.println(arrayBidimen[d1][1]);
        }
        for (int d2 = 0; d2 < 3; d2++ ) {
            System.out.println(arrayBidimen[d2][2]);
        }

      */

// leer Imprimir
        int x = 3;
        int y = 3;
        int bidi[][] = new int[x][y];

        for(y = 0; y < 3; y++) {
            for (x = 0; x < 3; x++) {
                System.out.println("Ingresa el valor en la posición x:" + x + " y:" + y);
                bidi[x][y] = lector.nextInt();
            }

            }
            for (y = 0; y < 3; y++) {
                for (x = 0; x < 3; x++) {
                    System.out.print(bidi[x][y] + "  ");
                }
                System.out.println();
            }
        int suma = 0;
        for (y = 0; y < 3; y++) {
            for (x = 0; x < 3; x++) {
                suma += bidi[x][y];
            }
        }
        System.out.println("La sumas es: " + suma);

     /*
        // suma acumulativa
        int suma = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("ingresa el numero " + i);
            int num = lector.nextInt();
            suma += num;
        }
        System.out.println(suma);
        */

    }
}

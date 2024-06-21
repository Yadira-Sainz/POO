import java.util.Scanner;

public class Arreglos {
    Scanner lector = new Scanner(System.in);

    private int ren;
    private int col;
    private int vector[];
    private int matriz1[][];
    private int matriz2[][];
    private int matrizResultante[][];

    public void setRen(int ren) {
        this.ren = ren;
    }

    public int getRen() {
        return this.ren;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getCol() {
        return this.col;
    }

    public void setVector(int[] vector) {
        this.vector = vector;
    }

    public int[] getVector() {
        return this.vector;
    }

    public void setMatriz1(int[][] matriz1) {
        this.matriz1 = matriz1;
    }

    public int[][] getMatriz1() {
        return this.matriz1;
    }

    public void setMatriz2(int[][] matriz2) {
        this.matriz2 = matriz2;
    }

    public int[][] getMatriz2() {
        return this.matriz2;
    }

    public void setMatrizResultante(int[][] matrizResultante) {
        this.matrizResultante = matrizResultante;
    }

    public int[][] getMatrizResultante() {
        return this.matrizResultante;
    }


    public int[] crearArreglo(int l) {
        int[] arreglo = new int[l];
        for (int x = 0; x < arreglo.length; x++) {
            System.out.println("Ingresa el valor: " + x);
            arreglo[x] = lector.nextInt();
        }
        return arreglo;
    }

    public int[][] crearArreglo(int l, int l2) {
        int[][] arreglo = new int[l][l2];
        for (int y = 0; y < arreglo[0].length; y++) {
            for (int x = 0; x < arreglo.length; x++) {
                System.out.println("Ingresa el valor de x:" + x + " y:" + y);
                arreglo[x][y] = lector.nextInt();
            }
        }
        return arreglo;
    }

    public void imprimir(int[] v) {
        for (int x = 0; x < v.length; x++) {
            System.out.print(v[x] + "    ");
        }
    }


    public void imprimir(int[][] m) {
        for (int y = 0; y < m[0].length; y++) { // m en la posicion 0 de la dimensión en x
            for (int x = 0; x < m.length; x++) {
                System.out.print(m[x][y] + "    ");
            }
            System.out.println();
        }
    }

    public int sumar(int[] v) {
        int suma = 0;
        for (int x = 0; x < v.length; x++) {
            suma += v[x];
        }
        return suma;
    }

    public int sumar(int[][] m) {
        int suma = 0;
        for (int y = 0; y < m[0].length; y++) {
            for (int x = 0; x < m.length; x++) {
                suma += m[x][y];
            }
        }
        return suma;
    }

    public int[][] sumar(int[][] m1, int[][] m2) {
        int[][] m3 = new int[m1.length][m1[0].length];
        for (int y = 0; y < m1[0].length; y++) {
            for (int x = 0; x < m1.length; x++) {
                m3[x][y] = m1[x][y] + m2[x][y];
            }
        }
        return m3;
    }

    public int[][] restar(int[][] m1, int[][] m2) {
        int[][] m3 = new int[m1.length][m1[0].length];
        for (int y = 0; y < m1[0].length; y++) {
            for (int x = 0; x < m1.length; x++) {
                m3[x][y] = m1[x][y] - m2[x][y];
            }
        }
        return m3;
    }

    public int sumar(int col, int[][] arreglo) {
        int suma = 0;
        for (int y = 0; y < arreglo[0].length; y++) {
            suma += arreglo[col][y];
        }
        return suma;
    }

    public int sumar(int[][] arreglo, int ren) {
        int suma = 0;
        for (int x = 0; x < arreglo.length; x++) {
            suma += arreglo[x][ren];
        }
        return suma;
    }

}
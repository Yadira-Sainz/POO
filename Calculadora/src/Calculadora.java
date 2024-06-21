public class Calculadora {
    public double numero1;
    public double numero2;
    public double resultado;

    private int sumarDivisores(double n) {
        int suma = 0;
        for (int divisor = 1; divisor < n; divisor++) {
            if (n % divisor == 0)
                suma += divisor;
        }
        return suma;
    }

    public boolean numeroPerfecto(double n1) {
        if (n1 == sumarDivisores((int) n1))
            return true;
        else
            return false;
    }

    public boolean numerosAmigos(double n1, double n2) {
        if (n2 == sumarDivisores(n1) && n1 == sumarDivisores(n2))
            return true;
        else
            return false;
    }

    public double sumar(double n1, double n2) {
        return n1 + n2;
    }

    public double restar(double n1, double n2) {
        return n1 - n2;
    }

    public double dividir(double n1, double n2) {
        return n1 / n2;
    }

    public double multiplicar(double n1, double n2) {
        return n1 * n2;
    }

    public boolean par(int n1) {
        if (n1 % 2 == 0)
            return true;
        else
            return false;
    }

    public boolean numeroPrimo(int n1) {
        for (int i = 2; i < n1; i++) {
            if (n1 % i == 0) {
                return false;
            }
        }
        return true;
    }

    public double factorial(double n1) {
        double fac = 1;
        for (double i = 1; i <= n1; i++) {
            fac *= i;
        }
        return fac;
    }
}

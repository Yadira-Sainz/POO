import java.util.Scanner;

public class Condicionales {
    Scanner lector = new Scanner(System.in);

    public void mayorDeEdad() {
        int edad;
        System.out.println("Ingresa tu edad:");
        edad = lector.nextInt();
        if (edad >= 0) {
            if (edad >= 18) {
                System.out.println("Eres mayor de edad");
            } else
                System.out.println("Eres menor de edad");
        } else
            System.out.println("Te falta para nacer");
    }

    public void etapaDeVida() {
        int edad = 0;
        System.out.println("Ingresa tu edad:");
        edad = lector.nextInt();

        if (edad >= 0) {
            if (edad <= 5) {
                System.out.println("Estas en la estapa de primera infancia");
            } else if (edad <= 11) {
                System.out.println("Estas en la etapa de infancia");
            } else if (edad <= 18) {
                System.out.println("Estas en la etapa de la adolecencia");
            } else if (edad <= 26) {
                System.out.println("Estas en la etapa de la juventud");
            } else if (edad <= 59) {
                System.out.println("Estas en la etapa de la adultes");
            } else {
                System.out.println("Estas en la etapa de la vejez");
            }
        } else {
            System.out.println("valor invalido");
        }
    }

    public void numeroMayor() {

        int n1, n2, n3;
        System.out.println("Ingresa el primer valor:");
        n1 = lector.nextInt();
        System.out.println("Ingresa el segundo valor:");
        n2 = lector.nextInt();
        System.out.println("Ingresa el tercer valor:");
        n3 = lector.nextInt();

        int mayor = n1;
        if (n2 > mayor) {
            mayor = n2;
        }
        if (n3 > mayor) {
            mayor = n3;
        }
        System.out.println("El número mayor es: " + mayor);
    }

    public void numeroPositivo() {
        System.out.println("Ingresa un número");
        int num = lector.nextInt();
        if (num > 0) {
            System.out.println("El número es positivo");
        } else if (num < 0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es neutro");
        }
    }

    public void parImpar() {
        int numero;
        System.out.println("Ingresa un número:");
        numero = lector.nextInt();
        if (numero % 2 == 0) {
            System.out.println(numero + " es par");
        } else {
            System.out.println(numero + " es impar");
        }
    }

    public void incrementoSueldo() {
        int categoria, sueldo;
        System.out.println("Ingresa la categoria (1, 2, 3, 4):");
        categoria = lector.nextInt();
        System.out.println("Ingresa el sueldo:");
        sueldo = lector.nextInt();
        double incremento = 0;
        if (categoria == 1) {
            incremento = sueldo * .15;
        } else if (categoria == 2) {
            incremento = sueldo * .10;
        } else if (categoria == 3) {
            incremento = sueldo * .08;
        } else if (categoria == 4) {
            incremento = sueldo * .07;
        }
        double salarioNeto = sueldo + incremento;
        System.out.println("El incremento es de: " + incremento);
        System.out.println("El salario neto es de: " + salarioNeto);
    }

    public void servicioMilitar() {
        int edad;
        System.out.println("Ingresa tu edad:");
        edad = lector.nextInt(); // nextInt no toma el caracter del enter, es necesario agregar nextLine despues
        lector.nextLine(); // Esta linea solo toma el caracter de enter
        if (edad < 18 || edad > 25) {
            System.out.println("No cumples con el requisito de edad para ingresar ");
            return;
        }
        System.out.println("¿Eres de nacionalidad mexicana? Introduce si o no");
        String respuesta = lector.next();
        if (respuesta.equals("no")) { //Para comparar un String no se utiliza == si no .equals
            System.out.println("No cumples con el requisito de nacionalidad para ingresar");
            return;
        }
        System.out.println("¿Eres de sexo masculino? Introduce si o no");
        String respuesta2 = lector.next();
        if (respuesta.equals("no")) {
            System.out.println("No cumples con el requisito de genero para ingresar");
        } else {
            System.out.println("Cumples con todos los requisitos para ingresar al servicio militar");
        }
    /*    if(edad>17 && edad<26 && respuesta.equalsIgnoreCase("si") && respuesta2.equalsIgnoreCase("si")){

        }*/
    }

    public void comisionVenta() {
        int venta;
        System.out.println("Ingresa el monto de la venta:");
        venta = lector.nextInt();
        double comision = 0;
        if (venta < 1000) {
            comision = venta * .03;
        } else {
            comision = venta * .05;
        }
        System.out.println("La comisión por la ventas es: " + comision);
    }

    public void aumentoSalarial() {
        double salario;
        System.out.println("Ingresa el salario:");
        salario = lector.nextDouble();
        int opcion = 0;
        double aumento = 0;
        System.out.println("1.- Sindicalizado");
        System.out.println("2.- De confianza");
        System.out.println("3.- Alto directivo");
        System.out.println("4.- Ejecutivo");
        opcion = lector.nextInt();

        switch (opcion) {
            case 1:
                aumento = salario * .20;
                break;
            case 2:
                aumento = salario * .10;
                break;
            case 3:
                aumento = salario * .05;
                break;
            case 4:
                aumento = salario * .02;
                break;
        }
        System.out.println("El sueldo neto es: " + (salario + aumento));
    }

    public void calcularFuncion() {
        String formula = "";
        int resultado = 0;
        System.out.println("Ingresa el valor de x: ");
        int x = lector.nextInt();
        if (x <= 11) {
            resultado = (3 * x) + 36;
            formula = "3x+36= ";
        } else if (11 < x && x <= 33) {
            resultado = (int) (Math.pow(x, 2) - 10);
            formula = "x^2-10= ";
        } else if (33 < x && x <= 64) {
            resultado = x + 6;
            formula = "x+6= ";
        }
        System.out.println("y= f(x)= " + formula + " " + resultado);
    }
}

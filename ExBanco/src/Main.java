import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opc;
        List<CuentaBancaria> cuentas = new ArrayList<>();
        Scanner lector = new Scanner(System.in);

        do {
            System.out.println("***** MENÚ PRINCIPAL *****");
            System.out.println("1.- Dar de alta una cuenta de nomina");
            System.out.println("2.- Dar de alta una cuenta de inversión");
            System.out.println("3.- Buscar cuenta por su número de cuenta");
            System.out.println("4.- Listar cuentas de nómina");
            System.out.println("5.- Listar cuentas de inversión");
            System.out.println("0.- Salir");
            opc = lector.nextInt();

            switch (opc) {
                case 0:
                    System.out.println("Fin del programa....");
                    break;
                case 1:
                    System.out.println("Ingresa el número de cuenta: ");
                    long numeroCuenta = lector.nextLong();
                    if(!cuentas.contains(new CuentaNomina(numeroCuenta,0,null,null))){//crea un objeto temporal con solo el numero de cuenta que es el que se utiliza en equals
                        System.out.println("Introduce el nombre: ");
                        String nombre = lector.next();
                        System.out.println("Introduce los apellidos: ");
                        String apellidos = lector.next();
                        System.out.println("Introduce el domicilio: ");
                        String domicilo = lector.next();
                        System.out.println("Introduce la ciudad: ");
                        String ciudad = lector.next();
                        System.out.println("Introduce el número de telefono: ");
                        String telefono = lector.next();
                        Cliente cliente = new Cliente(nombre, apellidos, domicilo, ciudad, telefono);
                        System.out.println("Introduce el saldo: ");
                        double saldo = lector.nextDouble();
                        LocalDate fecha = LocalDate.now();
                        System.out.println("Fecha de alta: " + fecha);
                        cuentas.add(new CuentaNomina(numeroCuenta, saldo, fecha, cliente));
                    }else{
                        System.out.println("Error, este número de cuenta ya existe...");
                    }
                    break;
                case 2:
                    System.out.println("Ingresa el número de cuenta: ");
                    long numeroCuentaI = lector.nextLong();
                    if(!cuentas.contains(new CuentaInversion(numeroCuentaI,0,null,null, 0,0))) {
                        System.out.println("Introduce el nombre: ");
                        String nombreI = lector.next();
                        System.out.println("Introduce los apellidos: ");
                        String apellidosI = lector.next();
                        System.out.println("Introduce el domicilio: ");
                        String domiciloI = lector.next();
                        System.out.println("Introduce la ciudad: ");
                        String ciudadI = lector.next();
                        System.out.println("Introduce el número de telefono: ");
                        String telefonoI = lector.next();
                        Cliente clienteI = new Cliente(nombreI, apellidosI, domiciloI, ciudadI, telefonoI);
                        System.out.println("Introduce el saldo: ");
                        double saldoI = lector.nextDouble();
                        System.out.println("Introduce el plazo en meses: ");
                        int plazo = lector.nextInt();
                        System.out.println("Introduce el procentaje de intereses: ");
                        int intereses = lector.nextInt();
                        LocalDate fechaI = LocalDate.now();
                        System.out.println("Fecha de alta: " + fechaI);
                        cuentas.add(new CuentaInversion(numeroCuentaI, saldoI, fechaI, clienteI, plazo, intereses));
                    }else{
                        System.out.println("Error, este número de cuenta ya existe...");
                    }
                    break;
                case 3:
                    System.out.println("Ingresa la cuenta que deseas encontrar: ");
                    int cuentaBuscada = lector.nextInt();
                    boolean cuentaEncontrado = false;
                    for (CuentaBancaria c : cuentas) {
                        if (c.getNumeroCuenta() == cuentaBuscada) {
                            cuentaEncontrado = true;
                            if (c instanceof CuentaNomina) {
                                int opcion;
                                do {
                                    System.out.println("##### CUENTA BANCARIA NóMINA: " + cuentaBuscada + " #####");
                                    System.out.println("1.- Depositar");
                                    System.out.println("2.- Retirar");
                                    System.out.println("3.- Consultar saldo");
                                    System.out.println("4.- Imprimir movimientos");
                                    System.out.println("0.- Regresar al menú principal");
                                    opcion = lector.nextInt();
                                    switch (opcion) {
                                        case 0:
                                            break;
                                        case 1:
                                            System.out.println("Ingresa el depósito: ");
                                            double deposito = lector.nextDouble();
                                            ((CuentaNomina) c).depositar(deposito);
                                            break;
                                        case 2:
                                            System.out.println("Cúanto deseas retirar: ");
                                            double retiro = lector.nextDouble();
                                            ((CuentaNomina) c).retirar(retiro);
                                            break;
                                        case 3:
                                            System.out.println("El saldo de su cuentas es: $" + c.getSaldo());
                                            break;
                                        case 4:
                                            ArrayList<Movimientos> movimientos = ((CuentaNomina) c).getMovimientos();
                                            for (Movimientos m: movimientos) {
                                                System.out.println("------------------------------------------");
                                                System.out.println(m.toString());
                                            }
                                            break;
                                    }

                                } while (opcion != 0);

                            }else if (c instanceof CuentaInversion){
                                System.out.println("##### CUENTA BANCARIA DE INVERSIóN : " + cuentaBuscada + " #####");
                                System.out.println(c.toString());
                                ((CuentaInversion) c).proyectarInversion();
                                System.out.println("Presiona enter para continuar...");
                                try {
                                    System.in.read();
                                } catch (Exception e) {
                                }
                            }

                        }
                    }
                    if(cuentaEncontrado == false){
                        System.out.println("Cuenta no encontrada");
                    }
                    break;
                case 4:
                    System.out.println("***** CUENTAS DE NÓMINA *****");
                    for (CuentaBancaria c: cuentas){
                        if(c instanceof CuentaNomina){
                            System.out.println(c.toString());
                        }
                    }
                    break;
                case 5:
                    System.out.println("***** CUENTAS DE INVERSIÓN *****");
                    for (CuentaBancaria c: cuentas){
                        if(c instanceof CuentaInversion){
                            System.out.println(c.toString());
                        }
                    }
                    break;
            }
        }while (opc != 0) ;
    }
}
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int opc;
        ArrayList<Persona> personas = new ArrayList<>();
        Scanner lector = new Scanner(System.in);

        do {
            System.out.println("##### MENÚ PRINCIPAL #####");
            System.out.println("1.- Registrar estudiante");
            System.out.println("2.- Registrar empleado");
            System.out.println("3.- Registrar empleado por Comisión");
            System.out.println("4.- Buscar");
            System.out.println("0.- Salir");
            opc = lector.nextInt();

            switch (opc) {
                case 0:
                    System.out.println("Fin del programa...");
                    break;
                case 1:
                    System.out.println("Introduce el nombre del estudiante: ");
                    String nombre = lector.next();
                    System.out.println("Introduce el dia de nacimiento del estudiante, " + nombre);
                    int dia = lector.nextInt();
                    System.out.println("Introduce el mes de nacimiento del estudiante, " + nombre);
                    int mes = lector.nextInt();
                    System.out.println("Introduce el año de nacimiento del estudiante, " + nombre);
                    int anio = lector.nextInt();
                    Fecha fechaNacimiento = new Fecha(dia, mes, anio);
                    System.out.println("Introduce el DNI de, " + nombre);
                    int dniEstudiante = lector.nextInt();
                    Estudiante estudiante = new Estudiante(nombre, fechaNacimiento, dniEstudiante);
                    personas.add(estudiante);
                    break;
                case 2:
                    System.out.println("Introduce el nombre del empleado: ");
                    String nombreEmpleado = lector.next();
                    System.out.println("Introduce el dia de nacimiento del empleado, " + nombreEmpleado);
                    int diaNacEmpleado = lector.nextInt();
                    System.out.println("Introduce el mes de nacimiento del empleado, " + nombreEmpleado);
                    int mesNacEmpleado = lector.nextInt();
                    System.out.println("Introduce el año de nacimiento del empleado, " + nombreEmpleado);
                    int anioNacEmpleado = lector.nextInt();
                    Fecha fechaNacEmpleado = new Fecha(diaNacEmpleado, mesNacEmpleado, anioNacEmpleado);
                    System.out.println("Introduce el DNI del empleado, " + nombreEmpleado);
                    int dniEmpleado = lector.nextInt();
                    System.out.println("Introduce el sueldo base del empleado, " + nombreEmpleado);
                    int sueldoBase = lector.nextInt();
                    Empleado empleado = new Empleado(nombreEmpleado, fechaNacEmpleado, dniEmpleado, sueldoBase);
                    personas.add(empleado);
                    break;
                case 3:
                    System.out.println("Introduce el nombre del empleado por comisión: ");
                    String nombreEmplComision = lector.next();
                    System.out.println("Introduce el día de nacimiento del empleado comisión, " + nombreEmplComision);
                    int diaNacEmplComision = lector.nextInt();
                    System.out.println("Introduce el mes de nacimiento del empleado comisión, " + nombreEmplComision);
                    int mesNacEmplComision = lector.nextInt();
                    System.out.println("Introduce el año de nacimiento del empleado comisión, " + nombreEmplComision);
                    int anioNacEmplComision = lector.nextInt();
                    Fecha fechaNacEmplComision = new Fecha(diaNacEmplComision, mesNacEmplComision, anioNacEmplComision);
                    System.out.println("Introduce el DNI del empleado comisión, " + nombreEmplComision);
                    int dniEmplComision = lector.nextInt();
                    System.out.println("Introduce el sueldo base del empleado comisión, " + nombreEmplComision);
                    int sueldoBaseEmplComision = lector.nextInt();
                    System.out.println("Introduce el porcentaje de comisión del empleado, " + nombreEmplComision);
                    double porcentajeComision = lector.nextDouble();
                    EmpleadoComision empleadoComision = new EmpleadoComision(nombreEmplComision, fechaNacEmplComision, dniEmplComision, sueldoBaseEmplComision, porcentajeComision);
                    personas.add(empleadoComision);
                    break;
                case 4:
                    System.out.println("Ingresa el DNI que deseas encontrar: ");
                    int dniBuscado = lector.nextInt();
                    boolean dniEncontrado = false;
                    for (Persona p : personas) {
                        if (p.getDni() == dniBuscado) {
                            dniEncontrado = true;
                            if (p instanceof Estudiante) {
                                int opcion;
                                do {
                                    System.out.println("##### MENÚ ESTUDIANTE, DNI: " + dniBuscado + " #####");
                                    System.out.println("1.- Agregar calificación");
                                    System.out.println("2.- Mostrar datos");
                                    System.out.println("0.- Regresar al menú principal");
                                    opcion = lector.nextInt();
                                    switch (opcion) {
                                        case 0:
                                            break;
                                        case 1:
                                            System.out.println("Ingresa la calificación: ");
                                            int calificacion = lector.nextInt();
                                            ((Estudiante) p).nuevaCalificacion(calificacion);
                                            break;
                                        case 2:
                                            ((Estudiante) p).imprimirDatos();
                                            System.out.println("Presiona enter para regresar al menú anterior...");
                                            try {
                                                System.in.read();
                                            } catch (Exception e) {
                                            }
                                            break;
                                    }

                                } while (opcion != 0);
                            } else if (p instanceof EmpleadoComision) {
                                int opcion2;
                                do {
                                    System.out.println("##### MENÚ EMPLEADO COMISIÓN, DNI: " + dniBuscado + " #####");
                                    System.out.println("1.- Agregar venta");
                                    System.out.println("2.- Mostrar datos");
                                    System.out.println("0.- Regresar al menú principal");
                                    opcion2 = lector.nextInt();
                                    switch (opcion2) {
                                        case 0:
                                            break;
                                        case 1:
                                            System.out.println("Ingresa la cantidad de la venta: ");
                                            int venta = lector.nextInt();
                                            ((EmpleadoComision) p).vender(venta);
                                            break;
                                        case 2:
                                            ((EmpleadoComision) p).imprimirDatos();
                                            System.out.println("Presiona enter para regresar al menú anterior...");
                                            try {
                                                System.in.read();
                                            } catch (Exception e) {
                                            }
                                            break;
                                    }

                                } while (opcion2 != 0);
                            } else if (p instanceof Empleado) {
                                System.out.println("##### DATOS DEL EMPLEADO, DNI: " + dniBuscado + " #####");
                                ((Empleado) p).imprimirDatos();
                                System.out.println("Presiona enter para regresar al menú anterior...");
                                try {
                                    System.in.read();
                                } catch (Exception e) {
                                }
                            }
                        }
                    }
                    if (dniEncontrado == false) {
                        System.out.println("DNI no encontrado");
                    }
                    break;
            }

        } while (opc != 0);
    }
}

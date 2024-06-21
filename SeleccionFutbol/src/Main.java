import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opc;
        ArrayList<SeleccionFutbol> integrantes = new ArrayList<>();
        Scanner lector = new Scanner(System.in);

        do {
            System.out.println("1.- Agregar Futbolista");
            System.out.println("2.- Agregar Entrenador");
            System.out.println("3.- Agregar Masajista");
            System.out.println("4.- Buscar");
            System.out.println("0.- Salir");
            opc = lector.nextInt();

            switch (opc) {
                case 0:
                    System.out.println("Salir del programa...");
                    break;
                case 1:
                    System.out.println("Introduce el ID del jugador: ");
                    int idFutbolista = lector.nextInt();
                    System.out.println("Introduce el nombre del jugador: ");
                    String nombreFut = lector.next();
                    System.out.println("Introduce los apellidos del jugador: ");
                    String apellidosFut = lector.next();
                    System.out.println("Introduce la edad del jugador: ");
                    int edadFut = lector.nextInt();
                    System.out.println("Introduce el dorsal del jugador: ");
                    int dorsal = lector.nextInt();
                    System.out.println("Introduce la demarcacion del jugador: ");
                    String demarcacion = lector.next();
                    Futbolista futbolista = new Futbolista(idFutbolista, nombreFut, apellidosFut, edadFut, dorsal, demarcacion);
                    integrantes.add(futbolista);
                    break;
                case 2:
                    System.out.println("Introduce el ID del entrenador: ");
                    int idEntrenador = lector.nextInt();
                    System.out.println("Introduce el nombre del entrenador: ");
                    String nombreEntr = lector.next();
                    System.out.println("Introduce los apellidos del entrenador: ");
                    String apellidosEntr = lector.next();
                    System.out.println("Introduce la edad del entrenador: ");
                    int edadEntr = lector.nextInt();
                    System.out.println("Introduce el ID Federación del entrenador: ");
                    String idFederacion = lector.next();
                    Entrenador entrenador = new Entrenador(idEntrenador, nombreEntr, apellidosEntr, edadEntr, idFederacion);
                    integrantes.add(entrenador);
                    break;
                case 3:
                    System.out.println("Introduce el ID del masajista: ");
                    int idMasajista = lector.nextInt();
                    System.out.println("Introduce el nombre del masajista: ");
                    String nombreMasaj = lector.next();
                    System.out.println("Introduce los apellidos del masajista: ");
                    String apellidosMasaj = lector.next();
                    System.out.println("Introduce la edad del masajista: ");
                    int edadMasaj = lector.nextInt();
                    System.out.println("Introduce la titulación del masajista: ");
                    String titulacion = lector.next();
                    System.out.println("Introduce los años de experiencia del masajista: ");
                    int aniosExperiencia = lector.nextInt();
                    Masajista masajista = new Masajista(idMasajista, nombreMasaj, apellidosMasaj, edadMasaj, titulacion, aniosExperiencia);
                    integrantes.add(masajista);
                    break;
                case 4:
                    System.out.println("Introduce el ID que deseas encontrar: ");
                    int idBuscado = lector.nextInt();
                    boolean idEncontrado = false;
                    for (SeleccionFutbol sF : integrantes) {
                        if (sF.getId() == idBuscado) {
                            idEncontrado = true;
                            if (sF instanceof Futbolista) {
                                int opcion;
                                do {
                                    System.out.println("##### MENÚ FUTBOLISTA, ID: " + idBuscado + " #####");
                                    System.out.println("1.- Mostrar datos");
                                    System.out.println("2.- Concentrarse");
                                    System.out.println("3.- Viajar");
                                    System.out.println("4.- Jugar partido");
                                    System.out.println("5.- Entrenar");
                                    System.out.println("0.- Regresar al menú principal");
                                    opcion = lector.nextInt();
                                    switch (opcion) {
                                        case 0:
                                            break;
                                        case 1:
                                            ((Futbolista) sF).imprimirDatos();
                                            break;
                                        case 2:
                                            ((Futbolista) sF).concentrarse();
                                            break;
                                        case 3:
                                            ((Futbolista) sF).viajar();
                                            break;
                                        case 4:
                                            ((Futbolista) sF).jugarPartido();
                                            break;
                                        case 5:
                                            ((Futbolista) sF).entrenar();
                                            break;
                                    }
                                    System.out.println("Presiona enter para regresar al menú anterior...");
                                    try {
                                        System.in.read();
                                    } catch (Exception e) {
                                    }
                                } while (opcion != 0);
                            } else if (sF instanceof Entrenador) {
                                int opcion2;
                                do {
                                    System.out.println("##### MENÚ ENTRENADOR, ID: " + idBuscado + " #####");
                                    System.out.println("1.- Mostrar datos");
                                    System.out.println("2.- Concentrarse");
                                    System.out.println("3.- Viajar");
                                    System.out.println("4.- Dirigir partido");
                                    System.out.println("5.- Dirigir entrenamiento");

                                    System.out.println("0.- Regresar al menú principal");
                                    opcion2 = lector.nextInt();
                                    switch (opcion2) {
                                        case 0:
                                            break;
                                        case 1:
                                            ((Entrenador) sF).imprimirDatos();
                                            break;
                                        case 2:
                                            ((Entrenador) sF).concentrarse();
                                            break;
                                        case 3:
                                            ((Entrenador) sF).viajar();
                                            break;
                                        case 4:
                                            ((Entrenador) sF).dirigirPartido();
                                            break;
                                        case 5:
                                            ((Entrenador) sF).dirigirEntrenamiento();
                                            break;
                                    }
                                    System.out.println("Presiona enter para regresar al menú anterior...");
                                    try {
                                        System.in.read();
                                    } catch (Exception e) {
                                    }
                                } while (opcion2 != 0);
                            } else if (sF instanceof Masajista) {
                                int opcion3;
                                do {
                                    System.out.println("##### MENÚ MASAJISTA, ID: " + idBuscado + " #####");
                                    System.out.println("1.- Mostrar datos");
                                    System.out.println("2.- Concentrarse");
                                    System.out.println("3.- Viajar");
                                    System.out.println("4.- Dar masaje");
                                    System.out.println("0.- Regresar al menú principal");
                                    opcion3 = lector.nextInt();
                                    switch (opcion3) {
                                        case 0:
                                            break;
                                        case 1:
                                            ((Masajista) sF).imprimirDatos();
                                            break;
                                        case 2:
                                            ((Masajista) sF).concentrarse();
                                            break;
                                        case 3:
                                            ((Masajista) sF).viajar();
                                            break;
                                        case 4:
                                            ((Masajista) sF).darMasaje();
                                            break;
                                    }
                                    System.out.println("Presiona enter para regresar al menú anterior...");
                                    try {
                                        System.in.read();
                                    } catch (Exception e) {
                                    }

                                } while (opcion3 != 0);
                            }

                            if (idEncontrado == false) {
                                System.out.println("ID no encontrado");
                            }
                            break;
                        }
                    }
            }
        } while (opc != 0);
    }
}


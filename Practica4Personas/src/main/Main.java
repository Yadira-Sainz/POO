import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opc;
        Scanner lector = new Scanner(System.in);
        ArrayList<Persona> personas = Archivos.leerPersonas();
        do{
            System.out.println("##### MENÚ PRINCIPAL #####");
            System.out.println("1.- Registrar persona");
            System.out.println("2.- Buscar persona");
            System.out.println("3.- Modificar persona");
            System.out.println("4.- Eliminar persona");
            System.out.println("0.- Salir");
            opc = lector.nextInt();
            lector.nextLine();

            switch (opc){
                case 0:
                    Archivos.escribirPersonas(personas);
                    System.out.println("Fin del programa...");
                    break;
                case 1:
                    System.out.println("##### REGISTRAR PERSONA #####");
                    System.out.println("Nombre:");
                    String nombre = lector.nextLine();
                    System.out.println("Apellidos:");
                    String apellidos = lector.nextLine();
                    System.out.println("Ingresa la fecha de nacimiento");
                    System.out.println("Día:");
                    int dia = lector.nextInt();
                    System.out.println("Mes:");
                    int mes = lector.nextInt();
                    System.out.println("Año:");
                    int anio = lector.nextInt();
                    LocalDate fechaNacimiento = LocalDate.of(anio, mes, dia);
                    System.out.println("Ingresa el DNI de la persona:");
                    int dni = lector.nextInt();
                    Persona persona = new Persona(nombre, apellidos, fechaNacimiento, dni);
                    personas.add(persona);
                    break;
                case 2:
                    System.out.println("##### BUSCAR PERSONA #####");
                    System.out.println("Introdusca el DNI que desea buscar:");
                    int dniBuscado = lector.nextInt();
                    Persona personaBuscada = new Persona(dniBuscado);
                    int index = personas.indexOf(personaBuscada);
                    if(index != -1){
                        System.out.println(personas.get(index).toString());
                    }else{
                        System.out.println("Persona no encontrada.");
                    }
                    break;

                case 3:
                    System.out.println("##### MODIFICAR PERSONA #####");
                    System.out.println("Introdusca el DNI que desea buscar:");
                    int dniAModificar = lector.nextInt();
                    lector.nextLine();
                    Persona personaBuscadaParaModificar = new Persona(dniAModificar);
                    int indexModificar = personas.indexOf(personaBuscadaParaModificar);
                    if(indexModificar != -1){
                        System.out.println(personas.get(indexModificar).toString());
                        System.out.println("Introduce los nuevos datos:");
                        System.out.println("Nombre:");
                        String nombreNuevo = lector.nextLine();
                        System.out.println("Apellidos:");
                        String apellidosNuevo = lector.nextLine();
                        System.out.println("Ingresa la fecha de nacimiento");
                        System.out.println("Día:");
                        int diaNuevo = lector.nextInt();
                        System.out.println("Mes:");
                        int mesNuevo = lector.nextInt();
                        System.out.println("Año:");
                        int anioNuevo = lector.nextInt();
                        LocalDate fechaNacimientoNueva = LocalDate.of(anioNuevo, mesNuevo, diaNuevo);
                        Persona personaEditada = personas.get(indexModificar);
                        personaEditada.setNombre(nombreNuevo);
                        personaEditada.setApellidos(apellidosNuevo);
                        personaEditada.setFechaNacimiento(fechaNacimientoNueva);
                        personas.set(indexModificar, personaEditada);

                    }else{
                        System.out.println("Persona no encontrada.");
                    }
                    break;

                case 4:
                    System.out.println("##### ELIMINAR PERSONA #####");
                    System.out.println("Introdusca el DNI que desea buscar:");
                    int dniAEliminar = lector.nextInt();
                    Persona personaBuscadaParaEliminar = new Persona(dniAEliminar);
                    int indexEliminar = personas.indexOf(personaBuscadaParaEliminar);
                    if(indexEliminar != -1){
                        System.out.println(personas.get(indexEliminar).toString());
                        System.out.println("¿Esta seguro que desea eliminar esta persona?");
                        String respuesta = lector.next();
                        if(respuesta.equalsIgnoreCase("SI")){
                            personas.remove(indexEliminar);
                            System.out.println("Persona eliminada");
                        }
                    }else{
                        System.out.println("Persona no encontrada.");
                    }
                    break;

            }

        }while (opc != 0);
    }
}

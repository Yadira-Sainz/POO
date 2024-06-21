import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class Archivos {
    static String file_obj_path = "personas_obj.txt";
    static String file_path = "personas.csv";

    public static ArrayList<Persona> leerPersonas() {
        ArrayList<Persona> personas;
        try {
            BufferedReader br = new BufferedReader(new FileReader(file_obj_path));
            if (br.readLine() == null) {
                personas = new ArrayList<Persona>();
            } else {
                try {
                    FileInputStream fis = new FileInputStream(file_obj_path);
                    ObjectInputStream ois = new ObjectInputStream(fis);
                    personas = (ArrayList<Persona>) ois.readObject();
                    ois.close();
                } catch (IOException | ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return personas;
    }

    public static void escribirPersonas(ArrayList<Persona> personas) {
        try {
            FileOutputStream fos = new FileOutputStream(file_obj_path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(personas);
            oos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static ArrayList<Persona> leerPersonasCsv() {
        ArrayList<Persona> personas = new ArrayList<>();
        try {
            FileReader fr = new FileReader(file_path);
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while (line != null) {
                String[] valores = line.split(","); // Toma el valor hasta la coma
                personas.add(new Persona(valores[0], valores[1], LocalDate.parse(valores[2]), Integer.parseInt(valores[3])));
                line = br.readLine();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return personas;
    }

    public static void escribirPersonasCsv(ArrayList<Persona> personas) {
        try {
            FileWriter fw = new FileWriter(file_path); //Abrir
            PrintWriter pw = new PrintWriter(fw); //Crear objeto que me va ayudar a escribir
            for (Persona p : personas) {
                pw.println(p.valores());
            }
            fw.close();
        } catch (IOException e) {
            System.out.println("Dato invalido...");
        }
    }

}

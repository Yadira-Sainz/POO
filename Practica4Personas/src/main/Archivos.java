package main;
import java.io.*;
import java.util.ArrayList;

public class Archivos {
    static String file = "personas.txt";

    public static ArrayList<Persona> leerPersonas(){
        ArrayList<Persona> personas;
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            if(br.readLine() == null){
                personas = new ArrayList<Persona>();
            }else {
                try {
                    FileInputStream fis = new FileInputStream(file);
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

    public static void escribirPersonas(ArrayList<Persona> personas){
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(personas);
            oos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}

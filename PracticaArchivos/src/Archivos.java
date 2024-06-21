import java.io.*;

public class Archivos {
    File f = new File("practica_archivos_caracteres.txt"); //Especifica ruta
    File f2 = new File("archivos_caracteres.txt");

    public void agregar(int num) {
        try {
            FileWriter fw = new FileWriter(f, true); //Abrir
            PrintWriter pw = new PrintWriter(fw); //Crear objeto que me va ayudar a escribir
            pw.println(num);
            fw.close();
        } catch (IOException e) {
            System.out.println("Dato invalido...");
        }

    }

    public void calcular() {
        try {
            FileWriter fw = new FileWriter(f2, true);
            FileReader fr = new FileReader(f);
            PrintWriter pw = new PrintWriter(fw);
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while (line != null) {
                pw.println("*".repeat(Integer.parseInt(line)));
                line = br.readLine();
            }
            fr.close();
            fw.close();
        } catch (Exception e) {
            System.out.println("Dato invalido...");
        }

    }

}

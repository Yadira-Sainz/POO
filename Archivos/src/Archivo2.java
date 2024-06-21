import java.io.*;

public class Archivo2 {
    public static void main(String[] args) {
        File f = new File("numeros.txt"); //f carga el archivo
        try{
            FileWriter fw = new FileWriter(f, true); //fw el flujo hacia f
            PrintWriter pw = new PrintWriter(fw); //pw permite la escritura en el archivo
            for (int i = 1; i <= 20; i++ ){
                pw.println(i); // se introduce el valor de i en el archivo
            }
            fw.close(); // se cierra el flujo del archivo
        }catch (IOException e){
            System.out.println("error");
        }
    }
}

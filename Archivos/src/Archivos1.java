import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Archivos1 {

    public static void main(String[] args) {
        File f = new File("/Users/yadira/numeros.txt"); // f = carga de archivo
        try{
            FileReader fr = new FileReader(f); //fr = crea el flujo hacia f
            BufferedReader br = new BufferedReader(fr); //br = permite la lectura
            String linea = br.readLine(); // linea toma el valor de la primera linea
            while(linea != null) { //mientras haya datos en el archivo
                System.out.println(linea);
                linea = br.readLine();
            }
            fr.close(); // cierra el archivo
        }
        catch(IOException e){
            System.out.println("error"); //si no se pudo accede al archivo
        }
    }
}

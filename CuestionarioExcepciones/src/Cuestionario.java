import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class Cuestionario {
    /*
    public static double acceso_por_indice (double [] v, int j) throws RuntimeException {
        try{
            if ((0 <= j) && (j <= v.length)){
                return v[j];
            }
            else {
                //throw new Exception ("El indice " + j + " no existe en el vector");
            }
        }
        catch (RuntimeException exc){
            throw exc;
        }

    }*/


    public static char caracterEn(String cadena, int index) throws Exception {
        if(index >= 0 && index < cadena.length()){
            return cadena.charAt(index);
        }else{
            throw new Exception("Index fuera de rango");
        }
    }


    public void readFile() {
        String fileName = "file does not exist";
        File file = new File(fileName);
        try {
            FileInputStream stream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}

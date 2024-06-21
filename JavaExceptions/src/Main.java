
public class Main {

    public static void main (String[] args) {
        int a=5;
        int b=0;
        String c = null;
        String d = "HOLA"; // new String("HOLA");
        try{
            //System.out.println(a/b);
            System.out.println(d.toLowerCase());
            System.out.println(c.toLowerCase());
            System.out.println("Otro codigo");
        }
        catch(Exception e){
            System.out.println("Datos invalidos.");
            e.printStackTrace();
        }
        System.out.println("Proceando otras cosas muy importantes...");
    }
}

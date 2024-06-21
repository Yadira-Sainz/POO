public class Main2 {
    public static void main(String[] args) throws YadiraException {
        YadiraException crisis = new YadiraException();
        //throw crisis;

        try{
            System.out.println("Introduce un dato mayor que 10");
            int dato = 5;
            if(dato<=10){
                throw crisis;
            }
        }
        catch(YadiraException y){
            System.out.println("Tirando excepciones,dato in valido");
        }
    }

}

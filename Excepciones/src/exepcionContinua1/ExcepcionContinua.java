package exepcionContinua1;

public class ExcepcionContinua {
    static void divide(){
        int num[] = {4,8,16,32,64,128,256};     //256 esta de más
        int den[] = {2,0,4,4,0,8};          //16

        for (int i = 0; i < num.length + 1; i++){         //Se agrego + 1  despues de length y por eso muestra el error 2 veces
            try{
                System.out.println(num[i] + "/" + den[i] + "=" + num[i]/den[i]);
            }
            catch(java.lang.ArithmeticException excepcion){
                System.out.println("Dividiendo por cero");
            }
            catch(java.lang.ArrayIndexOutOfBoundsException exception){     //Se agrego esta excepción
                System.out.println("Error al acceder el vector");
            }
        }
    }

}

package excepcionContinua2;

public class ExcepcionContinua {
    static void divide(){
        int num[] = {4,8,16,32,64,128,256,512};
        int den[] = {2,0,4,4,0,8};

        for (int i = 0; i < num.length; i++){
            try{
                System.out.println(num[i] + "/" + den[i] + "=" + num[i]/den[i]);
            }

            catch(ArrayIndexOutOfBoundsException Except){
                System.out.println("Fuera de limite" + i);
            }
            catch(Throwable Excep){
                System.out.println("Ocurrio una excepcion generica");
            }
        }
    }

}

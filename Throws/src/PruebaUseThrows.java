public class PruebaUseThrows {
        public static void main(String[] args) {
            char ch;
            try{
                ch= UseThrows.prompt("Escriba ubna letra");
            }
            catch(java.io.IOException excepcion){
                System.out.println("Excepcion de entrada - salida");
                ch = 'X';
            }
        }
    }


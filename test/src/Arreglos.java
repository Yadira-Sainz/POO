public class Arreglos {
    public static void main(String[] args) {
        String[] pasteles = new String[50];
        String[] gelatinas = {"guayba","manzana", "natural",null,null};
        gelatinas[4] = "Fresa";
        gelatinas[3] = "rompope";
        System.out.println(gelatinas.length);
        System.out.println(gelatinas[3]);

        for(int i = 0; i < gelatinas.length; i++){
            System.out.println(gelatinas[i]);
        }
        MoldeCuadrado[] misMoldes = new MoldeCuadrado[4];
        misMoldes[0].ancho= 1;
        misMoldes[0].alto= 2;
        misMoldes[0].largo= 3;


        /*
        System.out.println(pasteles[0]);
        for(int i= 0; i < pasteles.length;i++){
            pasteles[i] = "Pastel " + i;
        }

        pasteles[3]="pastel de zanahoria";
        System.out.println("Largo del arreglo:" + pasteles.length);

        for(int i= 0; i < pasteles.length;i++){
            System.out.println(pasteles[i]);
        }
        */
    }

}

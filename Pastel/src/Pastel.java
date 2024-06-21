public class Pastel {
    String sabor;
    int altura;
    int largo;

    public Pastel(String sabor, int altura, int largo) {
        this.sabor = sabor;
        this.altura = altura;
        this.largo = largo;
        System.out.println("El sabor es: " + sabor + " La altura es: " + altura + " El largo es: " + largo);
    }

    public Pastel(String sabor){
        System.out.println("El sabor es: " + sabor);
    }

     void hornear(){
        System.out.println("Estoy horneando...");
    }
}

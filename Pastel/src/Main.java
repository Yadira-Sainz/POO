public class Main {
    public static void main(String[] args){
        Pastel pastel = new Pastel("Chocolate", 5, 10);
        Pastel pastel1 = new Pastel("Vainilla");

        Perro tobi = new Perro();
        Gato michi = new Gato();
        Pez doris = new Pez();
        //System.out.println(michi.toString());
        tobi.hacerSonido();
        michi.hacerSonido();
        doris.hacerSonido();
        doris.edad = 5; // Asignarle un valor al atributo edad en pez
        System.out.println(doris.edad);

        Hyundai i10 = new Hyundai();
        i10.color = "negro";
        Mercedes pickUp = new Mercedes();
        pickUp.modelo = 12;
    }
}

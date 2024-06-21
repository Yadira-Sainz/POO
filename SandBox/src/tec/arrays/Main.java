package tec.arrays;

public class Main {
    public static void main(String[] args) {
        Persona[] misPersonasFavoritas = new Persona[2];
        Persona yadi = new Persona();
        yadi.nombre = "Yadira";
        misPersonasFavoritas[0] = yadi;
        Persona mario = new Persona();
        mario.nombre = "Mario";
        misPersonasFavoritas[1] = mario;
        System.out.println(misPersonasFavoritas.length);


    }
}

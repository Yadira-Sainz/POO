public abstract class Carro { //No te permite crear objetos
    String color;
    int modelo;

    public void correr(){
        System.out.println("run run");
    }
    public abstract void frenar(); // metodo abstracto, te obliga a implementar el codigo en la clase que herada
}

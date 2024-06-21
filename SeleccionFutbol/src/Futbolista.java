public class Futbolista extends SeleccionFutbol {

    private int dorsal;
    private String demarcacion;


    public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }


    public void jugarPartido() {
        System.out.println("Jugando un partido...");
    }

    public void entrenar() {
        System.out.println("En el entrenamiento...");
    }

    @Override
    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("Número de dorsal: " + this.dorsal);
        System.out.println("Demarcación: " + this.demarcacion);
    }
}

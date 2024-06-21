public class Entrenador extends SeleccionFutbol{

    private String idFederacion;

    public Entrenador(int id, String nombre, String apellidos, int edad, String idFederacion){
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }

    public void dirigirPartido(){
        System.out.println("Dirigiendo el partido...");
    }

    public void dirigirEntrenamiento(){
        System.out.println("Dirigiendo el entrenamiento...");
    }

    @Override
    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("ID Federación: " + idFederacion);
    }
}

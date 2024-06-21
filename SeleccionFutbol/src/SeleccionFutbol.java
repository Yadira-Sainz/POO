public class SeleccionFutbol {
    protected int id;
    protected String nombre;
    protected String apellidos;
    protected int edad;

    public int getId(){
        return this.id;
    }

    public SeleccionFutbol(int id, String nombre, String apellidos, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public void concentrarse() {
        System.out.println("En concentración...");
    }

    public void viajar() {
        System.out.println("Viajando...");
    }

    public void imprimirDatos() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println(" Apellidos: " + apellidos);
        System.out.println("Edad: " + edad);
    }
}

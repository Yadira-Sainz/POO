public class Persona {
    private String nombre;
    private Fecha fechaNacimiento;
    private int dni;

    public int getDni() {
        return this.dni;
    }

    public Persona(String nombre, Fecha fechaNacimiento, int dni) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.dni = dni;
    }

    public void imprimirDatos() {
        System.out.println("DNI: ");
        System.out.println(dni);
        System.out.println("Nombre: " + nombre);
        System.out.println("Fecha de nacimiento: ");
        fechaNacimiento.imprimir();
        System.out.println();
    }

}

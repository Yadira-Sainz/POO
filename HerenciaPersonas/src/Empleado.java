public class Empleado extends Persona {
    private int sueldoBase;

    public Empleado(String nombre, Fecha fechaNacimiento, int dni, int sueldoBase) { //constructor en el mismo orden que
        super(nombre, fechaNacimiento, dni); //Es el método que invoca el constructor de la clase padre
        this.sueldoBase = sueldoBase;
    }

    public int getSueldo() {
        return sueldoBase;
    }

    @Override
    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("Sueldo base: ");
        System.out.println(this.getSueldo());
    }
}

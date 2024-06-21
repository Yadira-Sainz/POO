public class Estudiante extends Persona {
    private int puntuacionTotal;
    private int numeroCalificaciones;

    public Estudiante(String nombre, Fecha fechaNacimiento, int dni) {
        super(nombre, fechaNacimiento, dni);
        this.puntuacionTotal = 0;
        this.numeroCalificaciones = 0;
    }

    public void nuevaCalificacion(int puntos) {
        puntuacionTotal += puntos;
        numeroCalificaciones++;
    }

    public double getNotaMedia() {
        return ((double) puntuacionTotal) / numeroCalificaciones;
    }

    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("Nota media: ");
        System.out.println(getNotaMedia());
    }
}

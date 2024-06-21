import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class Persona implements Serializable {
    public String nombre;
    public String apellidos;
    public LocalDate fechaNacimiento;
    private int dni;


    public int getDni() {
        return dni;
    }

    public Persona(int dni) {
        this.dni = dni;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }


    public Persona(String nombre, String apellidos, LocalDate fechaNacimiento, int dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", dni=" + dni +
                '}';
    }

    public String valores() {
        return nombre + "," +
                apellidos + "," +
                fechaNacimiento + "," +
                dni;
    }

    @Override
    public boolean equals(Object o) { //Es para poder utilizar el contains y lo que hace es comparar el dato
        Persona that = (Persona) o;
        return this.dni == that.dni;
    }

    @Override
    public int hashCode() { //Le manda a equals el dato especifico que se quiere comparar
        return Objects.hash(dni);
    }


}

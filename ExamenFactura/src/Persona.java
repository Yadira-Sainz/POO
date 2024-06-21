import java.io.Serializable;
import java.time.LocalDate;

public class Persona implements Serializable {
    public String nombre;
    public String apellidoPaterno;
    public String apellidoMaterno;
    public LocalDate fechaNacimiento;

    public Persona(String nombre, String apellidoPaterno, String apellidoMaterno, LocalDate fechaNacimiento){
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.fechaNacimiento = fechaNacimiento;
    }
    public Persona(){}
}

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class Vendedor extends Persona implements Serializable {
    private int idVendedor;
    private String area;
    private float porcentajeComision;
    private int sueldoBase;


    public Vendedor(int idVendedor, String area, float porcentajeComision, int sueldoBase, String nombre, String apellidoPaterno, String apellidoMaterno, LocalDate fechaNacimiento){
        super(nombre, apellidoPaterno, apellidoMaterno, fechaNacimiento);
        this.idVendedor = idVendedor;
        this.area = area;
        this.porcentajeComision = porcentajeComision;
        this.sueldoBase = sueldoBase;
    }

    public Vendedor(int idVendedor) {
        super();
        this.idVendedor = idVendedor;
    }

    public float getPorcentajeComision() {
        return porcentajeComision;
    }

    public int getSueldoBase() {
        return sueldoBase;
    }

    public double calcularComision(double venta){
        return venta * porcentajeComision / 100;
    }


    @Override
    public String toString() {
        return "Vendedor{" +
                "idVendedor=" + idVendedor + '\'' +
                ", area='" + area + '\'' +
                ", porcentajeComision=" + porcentajeComision + '\'' +
                ", sueldoBase=" + sueldoBase + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidoPaterno='" + apellidoPaterno + '\'' +
                ", apellidoMaterno='" + apellidoMaterno + '\'' +
                ", fechaNacimiento=" + fechaNacimiento + '\'' +
                '}';
    }

    public boolean equals(Object o) {
        Vendedor that = (Vendedor) o;
        return this.idVendedor == that.idVendedor;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idVendedor);
    }

    public String valores(){
        return this.idVendedor + "," + this.area + "," + this.porcentajeComision + "," + this.sueldoBase + ","
                + super.nombre + "," + super.apellidoPaterno + "," + super.apellidoMaterno + "," + super.fechaNacimiento;
    }

}

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public class Cliente extends Persona implements Serializable {
    private String rfc;
    private String domicilio;
    private ArrayList<Factura> compras;

    public ArrayList<Factura> getCompras() {
        return compras;
    }

    public Cliente(String rfc, String domicilio, String nombre, String apellidoPaterno, String apellidoMaterno, LocalDate fechaNacimiento){
        super(nombre, apellidoPaterno, apellidoMaterno, fechaNacimiento);
        this.rfc = rfc;
        this.domicilio = domicilio;
        this.compras = new ArrayList<Factura>();
    }

    public Cliente(String rfc) {
        super();
        this.rfc = rfc;
    }

    public void comprar(Factura carrito){
        int id=0;
        if(this.compras != null){
             id = compras.size() + 1;
        }
        carrito.setAutoIncrementableId(id);
        compras.add(carrito);
    }

    public boolean equals(Object o) {
        Cliente that = (Cliente) o;
        return this.rfc.equals(that.rfc);
    }

    @Override
    public int hashCode() { //Le manda a equals el dato especifico que se quiere comparar
        return Objects.hash(rfc);
    }

    public String valores(){
        return this.rfc + "," + this.domicilio + "," + super.nombre + "," + super.apellidoPaterno + "," + super.apellidoMaterno + "," + super.fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "rfc='" + rfc + '\'' +
                ", domicilio='" + domicilio + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidoPaterno='" + apellidoPaterno + '\'' +
                ", apellidoMaterno='" + apellidoMaterno + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }
}

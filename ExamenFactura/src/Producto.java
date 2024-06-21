import java.io.Serializable;
import java.util.Objects;

public class Producto implements Serializable {
    private int id;
    private String descripcion;
    private float precio;

    public float getPrecio() {
        return precio;
    }

    public Producto(int id, String descripcion, float precio){
        this.id = id;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public Producto(int id) {
        this.id = id;
    }

    public String valores(){
        return this.id + "," + this.descripcion + "," + this.precio;
    }

    public boolean equals(Object o) {
        Producto that = (Producto) o;
        return this.id == that.id;
    }

    @Override
    public int hashCode() { //Le manda a equals el dato especifico que se quiere comparar
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Productos{" +
                "id=" + id +
                ", descripcion='" + descripcion + '\'' +
                ", precio=" + precio +
                '}';
    }

}

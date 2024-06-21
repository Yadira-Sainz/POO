import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public class Factura implements Serializable {
    private int id;
    private LocalDate fechaFactura;
    private   double iva;
    private   double total;

    private double subtotal;
    private ArrayList<Producto> productos;
    private Vendedor vendedor;

    ArrayList<Producto> listaProductos = Archivos.leerProductosCsv();

    public Factura(LocalDate fechaFactura,Vendedor vendedor){
        this.fechaFactura = fechaFactura;
        this.vendedor = vendedor;
        this.productos = new ArrayList<>();
    }

    public double getIva() {
        return iva;
    }

    public double getTotal() {
        return total;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public int getId() {
        return id;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setAutoIncrementableId(int id){
        this.id = id;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "id=" + id + "\n" +
                ", fechaFactura=" + fechaFactura + "\n" +
                ", subtotal=" + subtotal + "\n" +
                ", iva=" + iva + "\n" +
                ", total=" + total + "\n" +
                ", productos=" + productos + "\n" +
                ", vendedor=" + vendedor + "\n" +
                '}';
    }

    public boolean equals(Object o) {
        Factura that = (Factura) o;
        return this.id == that.id;
    }

    @Override
    public int hashCode() { //Le manda a equals el dato especifico que se quiere comparar
        return Objects.hash(id);
    }


     public void agregarProducto(int id){
         Producto productoBuscado = new Producto(id);
         int indexProducto = listaProductos.indexOf(productoBuscado);
         if(indexProducto != -1){
             System.out.println(listaProductos.get(indexProducto).toString());
             this.productos.add(listaProductos.get(indexProducto));
             System.out.println("Producto agregado al carrito de compra.");
         }else{
             System.out.println("Producto no encontrado.");
         }
    }

    public void eliminarProducto(int id){
        Producto productoBuscado = new Producto(id);
        int indexProducto = listaProductos.indexOf(productoBuscado);
        if(indexProducto != -1){
            System.out.println(listaProductos.get(indexProducto).toString());
            this.productos.remove(indexProducto);
            System.out.println("Producto eliminado del carrito de compra.");
        }else{
            System.out.println("Producto no encontrado.");
        }
    }

    public void calcular(){
        double subtotal= 0;
        for (Producto p: productos) {
            subtotal+=p.getPrecio();
        }
        this.subtotal = subtotal;
        this.iva = subtotal * 0.16;
        this.total = this.subtotal + this.iva;
    }


}

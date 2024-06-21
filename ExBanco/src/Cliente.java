public class Cliente {

    private String nombre;
    private String apellidos;
    private String domicilio;
    private String ciudad;

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre= '" + nombre + '\'' +
                ", apellidos= '" + apellidos + '\'' +
                ", domicilio= '" + domicilio + '\'' +
                ", ciudad= '" + ciudad + '\'' +
                ", telefono= '" + telefono + '\'' +
                '}';
    }

    private String telefono;

    public Cliente(String nombre, String apellidos, String domicilio, String ciudad, String telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.domicilio = domicilio;
        this.ciudad = ciudad;
        this.telefono = telefono;
    }

}
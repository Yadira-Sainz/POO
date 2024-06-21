public class EmpleadoComision extends Empleado {
    private double pocentajeComision;
    private int dineroVentas;

    public EmpleadoComision(String nombre, Fecha fechaNacimiento, int dni, int sueldoBase, double porcentajeComision) {
        super(nombre, fechaNacimiento, dni, sueldoBase);
        this.pocentajeComision = porcentajeComision;
        this.dineroVentas = 0;
    }

    public void vender(int dineroVenta) {
        this.dineroVentas += dineroVenta;
    }

    public int getSueldo() {
        return super.getSueldo() + (int) (dineroVentas * pocentajeComision / 100.0);
    }
}

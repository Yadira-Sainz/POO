import java.time.LocalDate;

public class Movimientos {
    private String tipo;
    private LocalDate fecha;
    private double monto;
    private double saldoAnterior;
    private double saldoActual;

    public Movimientos(String tipo, LocalDate fecha, double monto, double saldoAnterior, double saldoActual) {
        this.tipo = tipo;
        this.fecha = fecha;
        this.monto = monto;
        this.saldoAnterior = saldoAnterior;
        this.saldoActual = saldoActual;
    }

    @Override
    public String toString() {
        return "Movimientos{" +
                "tipo= '" + tipo + '\'' +
                ", fecha= " + fecha +
                ", monto= " + monto +
                ", saldoAnterior= " + saldoAnterior +
                ", saldoActual= " + saldoActual +
                '}';
    }
}

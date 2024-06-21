public class Movimientos {
    private String tipo;
    private Date fecha;
    private double monto;
    private double saldoAnterior;
    public double saldoActual;

    public Movimientos(String tipo, Date fecha, double monto, double saldoAnterior, double saldoActual){
        this.tipo = tipo;
        this.fecha = fecha;
        this.monto = monto;
        this.saldoAnterior = saldoAnterior;
        this.saldoActual = saldoActual;
    }
}

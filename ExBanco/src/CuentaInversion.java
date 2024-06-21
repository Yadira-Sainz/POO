import java.time.LocalDate;

public class CuentaInversion extends CuentaBancaria{
    private int plazo;
    private int intereses;

    public CuentaInversion(long numeroCuenta, double saldo, LocalDate fechaAlta, Cliente cliente, int plazo, int intereses) {
        super(numeroCuenta, saldo, fechaAlta, cliente);
        this.plazo = plazo;
        this.intereses = intereses;
    }

    public void proyectarInversion(){
        System.out.println("Proyección de Inversión:");
        System.out.println("plazo(meses): " + this.plazo);
        System.out.println("Intereses(%): " + this.intereses);
        System.out.println("Saldo inicial: $" + super.getSaldo());
        double saldoConIntereses = super.getSaldo() + ((super.getSaldo() * this.intereses) / 100);
        System.out.println("El saldo al terminar el plazo será de: $" + saldoConIntereses);
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

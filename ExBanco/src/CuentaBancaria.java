import java.time.LocalDate;
import java.util.Objects;

public class CuentaBancaria {
    private long numeroCuenta;
    private double saldo;
    private LocalDate fechaAlta;
    private Cliente cliente;


    public long getNumeroCuenta() {
        return numeroCuenta;
    }

    public CuentaBancaria(long numeroCuenta, double saldo, LocalDate fechaAlta, Cliente cliente) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.fechaAlta = fechaAlta;
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public boolean equals(Object o) { //Es par poder utilizar el contains y lo que hace es comparar el dato
        CuentaBancaria that = (CuentaBancaria) o;
        return this.numeroCuenta == that.numeroCuenta;
    }

    @Override
    public int hashCode() { //Le manda a equals el dato especifico que se quiere comparar
        return Objects.hash(numeroCuenta);
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "numero de cuenta= " + numeroCuenta +
                ", saldo= " + saldo +  //Posiblemente se podria ocultar esta información por motivos de seguridad
                ", fecha de alta= " + fechaAlta +
                ", cliente= " + cliente +
                '}';
    }
}


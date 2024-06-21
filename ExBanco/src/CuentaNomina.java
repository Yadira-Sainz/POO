import java.time.LocalDate;
import java.util.ArrayList;

public class CuentaNomina extends CuentaBancaria {

    public ArrayList<Movimientos> getMovimientos() {
        return movimientos;
    }

    private ArrayList<Movimientos> movimientos = new ArrayList<>();

    public CuentaNomina(long numeroCuenta, double saldo, LocalDate fechaAlta, Cliente cliente) {
        super(numeroCuenta, saldo, fechaAlta, cliente);
    }


    public double depositar(double cantidad) {
        movimientos.add(new Movimientos("Deposito", LocalDate.now(), cantidad, super.getSaldo(), super.getSaldo() + cantidad));
        super.setSaldo(super.getSaldo() + cantidad);
        return super.getSaldo();
    }

    public double retirar(double cantidad) {
        if (cantidad <= super.getSaldo()) {
            movimientos.add(new Movimientos("Retiro", LocalDate.now(), cantidad, super.getSaldo(), super.getSaldo() - cantidad));
            super.setSaldo(super.getSaldo() - cantidad);
        } else {
            System.out.println("Error, Saldo insuficiente.");
        }
        return super.getSaldo();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

}

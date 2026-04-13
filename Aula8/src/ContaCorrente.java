import javax.management.RuntimeErrorException;

public class ContaCorrente implements Conta {
    private int numero;
    private String titular;
    private double saldo;

    public ContaCorrente(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public boolean saque(double valor) {
      if ( valor > saldo) {
        throw new ContaException("Valor superior a saldo.");
      }
      saldo -= valor;
      return true;
    }

    @Override
    public boolean depositod(double valor) {
        if (valor <= saldo) {
            throw new ContaException("Valor de depósito inválido");
        }
        saldo += valor;
        return true;
    }

    @Override
    public String toString() {
        return "ContaCorrente [numero=" + numero + ", titular=" + titular + ", saldo=" + saldo + "]";
    }


}


public class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(double saldo, double valorSaque) {
        super("Saldo insuficiente! Saldo atual: " + saldo + ", Valor do saque: " + valorSaque);
    }
}


public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException(saldo, valor);
        }
        saldo -= valor;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("João", 500);

        try {
            conta.sacar(600);  
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }
    }
}

public class ContaBancaria {
   
    private String titular;
    private double saldo;

    
    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }

    
    public double getSaldo() {
        return saldo;
    }

    public static void main(String[] args) {
        
        ContaBancaria conta = new ContaBancaria("João", 500);

        
        conta.depositar(200);
        conta.sacar(100);
        System.out.println("Saldo atual: R$" + conta.getSaldo());
        conta.sacar(700);  
    }
}

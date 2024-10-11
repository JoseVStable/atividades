
abstract class Funcionario {
    protected String nome;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    
    public abstract double calcularSalario();
}


class FuncionarioHorista extends Funcionario {
    private int horasTrabalhadas;
    private double salarioHora;

    public FuncionarioHorista(String nome, int horasTrabalhadas, double salarioHora) {
        super(nome);
        this.horasTrabalhadas = horasTrabalhadas;
        this.salarioHora = salarioHora;
    }

    @Override
    public double calcularSalario() {
        return horasTrabalhadas * salarioHora;
    }
}


class FuncionarioAssalariado extends Funcionario {
    private double salarioFixo;

    public FuncionarioAssalariado(String nome, double salarioFixo) {
        super(nome);
        this.salarioFixo = salarioFixo;
    }

    @Override
    public double calcularSalario() {
        return salarioFixo;
    }
}

public class Main {
    public static void main(String[] args) {
        Funcionario horista = new FuncionarioHorista("Jose", 160, 50);  
        Funcionario assalariado = new FuncionarioAssalariado("ROBERTA", 5000);  

        System.out.println("Salário de " + horista.nome + ": R$" + horista.calcularSalario());
        System.out.println("Salário de " + assalariado.nome + ": R$" + assalariado.calcularSalario());
    }
}

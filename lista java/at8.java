import java.util.ArrayList;
import java.util.List;


class Empregado {
    private String nome;
    private String cargo;
    private double salario;

    
    public Empregado(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    
    public void exibirDetalhes() {
        System.out.println("Nome: " + nome + ", Cargo: " + cargo + ", Salário: R$ " + salario);
    }

    public String getNome() {
        return nome;
    }
}


class Empresa {
    private String nome;
    private List<Empregado> empregados;  

    
    public Empresa(String nome) {
        this.nome = nome;
        this.empregados = new ArrayList<>();
    }

    
    public void adicionarEmpregado(Empregado empregado) {
        empregados.add(empregado);
    }

    
    public void exibirEmpregados() {
        System.out.println("Empresa: " + nome + " possui os seguintes empregados:");
        for (Empregado empregado : empregados) {
            empregado.exibirDetalhes();
        }
    }
    
    public static void main(String[] args) {
        
        Empregado empregado1 = new Empregado("Carlos", "Engenheiro de Software", 8000.00);
        Empregado empregado2 = new Empregado("Maria", "Gerente de Projetos", 12000.00);

        
        Empresa empresa = new Empresa("Tech Solutions");

        
        empresa.adicionarEmpregado(empregado1);
        empresa.adicionarEmpregado(empregado2);

       
        empresa.exibirEmpregados();
    }
}

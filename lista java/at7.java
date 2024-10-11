import java.util.ArrayList;
import java.util.List;


class Professor {
    private String nome;
    private List<Escola> escolas = new ArrayList<>();  

   
    public Professor(String nome) {
        this.nome = nome;
    }

    
    public void adicionarEscola(Escola escola) {
        escolas.add(escola);
    }

    
    public void exibirEscolas() {
        System.out.println("Professor " + nome + " leciona nas escolas:");
        for (Escola escola : escolas) {
            System.out.println(" - " + escola.getNome());
        }
    }

    public String getNome() {
        return nome;
    }
}


class Escola {
    private String nome;
    private List<Professor> professores = new ArrayList<>();  

    
    public Escola(String nome) {
        this.nome = nome;
    }

    
    public void adicionarProfessor(Professor professor) {
        professores.add(professor);
    }

   
    public void exibirProfessores() {
        System.out.println("Escola " + nome + " tem os professores:");
        for (Professor professor : professores) {
            System.out.println(" - " + professor.getNome());
        }
    }

    public String getNome() {
        return nome;
    }
}

public class Main {
    public static void main(String[] args) {
        
        Professor professor1 = new Professor("Carlos");
        Professor professor2 = new Professor("Maria");

        
        Escola escola1 = new Escola("Escola A");
        Escola escola2 = new Escola("Escola B");

        escola1.adicionarProfessor(professor1);
        escola1.adicionarProfessor(professor2);
        escola2.adicionarProfessor(professor2);

        
        professor1.adicionarEscola(escola1);
        professor2.adicionarEscola(escola1);
        professor2.adicionarEscola(escola2);

        
        escola1.exibirProfessores();
        escola2.exibirProfessores();

        
        professor1.exibirEscolas();
        professor2.exibirEscolas();
    }
}

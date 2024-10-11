
interface Imprimivel {
    void imprimir();
}


class Relatorio implements Imprimivel {
    private String titulo;
    private String conteudo;

    public Relatorio(String titulo, String conteudo) {
        this.titulo = titulo;
        this.conteudo = conteudo;
    }

    @Override
    public void imprimir() {
        System.out.println("Relatório: " + titulo);
        System.out.println("Conteúdo: " + conteudo + "\n");
    }
}


class Contrato implements Imprimivel {
    private String parte1;
    private String parte2;
    private String termos;

    public Contrato(String parte1, String parte2, String termos) {
        this.parte1 = parte1;
        this.parte2 = parte2;
        this.termos = termos;
    }

    @Override
    public void imprimir() {
        System.out.println("Contrato entre " + parte1 + " e " + parte2);
        System.out.println("Termos: " + termos + "\n");
    }
}


public class Main {
    public static void main(String[] args) {
        Relatorio relatorio = new Relatorio("Relatório Financeiro", "Detalhes do relatório financeiro do Q3.");
        Contrato contrato = new Contrato("Empresa A", "Empresa B", "Termos e condições do acordo.");

        relatorio.imprimir();
        contrato.imprimir();
    }
}

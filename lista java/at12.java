public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

 
    public double somarPreco(Produto outroProduto) {
        return this.preco + outroProduto.preco;
    }

    @Override
    public String toString() {
        return nome + " - R$" + String.format("%.2f", preco);
    }

    public static void main(String[] args) {
        Produto produto1 = new Produto("Produto A", 50.75);
        Produto produto2 = new Produto("Produto B", 100.25);

     
        double somaPrecos = produto1.somarPreco(produto2);

        System.out.println("Soma dos preços: R$" + String.format("%.2f", somaPrecos));
    }
}

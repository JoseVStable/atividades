public class Carro {
    
    private String marca;
    private String modelo;
    private int ano;

    
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    
    public void exibirDetalhes() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano);
    }

    public static void main(String[] args) {
        
        Carro carro1 = new Carro("Fiat", "Mobi", 2024);
        Carro carro2 = new Carro("Volkswagen", "Gol", 2024);
        Carro carro3 = new Carro("Hyundai", "HB20", 2024);

        
        carro1.exibirDetalhes();
        carro2.exibirDetalhes();
        carro3.exibirDetalhes();
    }
}

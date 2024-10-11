public class Carro {
    
    private String marca;
    private String modelo;
    private int ano;
    private int velocidade;

    
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = 0;  
    }

  
    public void acelerar(int incremento) {
        this.velocidade += incremento;
        System.out.println(modelo + " acelerou. Velocidade atual: " + velocidade + " km/h");
    }

    
    public void frear(int decremento) {
        this.velocidade -= decremento;
        if (velocidade < 0) {
            velocidade = 0;  
        }
        System.out.println(modelo + " freou. Velocidade atual: " + velocidade + " km/h");
    }

    
    public void exibirVelocidade() {
        System.out.println("Velocidade atual de " + modelo + ": " + velocidade + " km/h");
    }

    public static void main(String[] args) {
       
        Carro carro1 = new Carro("Toyota", "Corolla", 2020);

        
        carro1.acelerar(30);
        carro1.acelerar(50);
        carro1.frear(20);
        carro1.exibirVelocidade();
    }
}

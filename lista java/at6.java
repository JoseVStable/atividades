
class Motor {
    private String tipo;

    
    public Motor(String tipo) {
        this.tipo = tipo;
    }

    
    public String getTipo() {
        return tipo;
    }
}


class Carro {
    private String marca;
    private String modelo;
    private Motor motor;  

    
    public Carro(String marca, String modelo, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
    }

    
    public void exibirDetalhes() {
        System.out.println("Carro: " + marca + " " + modelo);
        System.out.println("Motor: " + motor.getTipo());
    }

    public static void main(String[] args) {
        
        Motor motorV8 = new Motor("V8");

        
        Carro carro = new Carro("Ford", "Mustang", motorV8);

        
        carro.exibirDetalhes();
    }
}

public class Calculadora {

    
    public int somar(int a, int b) {
        return a + b;
    }

    
    public int somar(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        
        System.out.println("Soma de 2 números: " + calculadora.somar(40, 70));
        System.out.println("Soma de 3 números: " + calculadora.somar(15, 20, 35));
    }
}

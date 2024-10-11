public class Configuracao {

    private static Configuracao instance;  
    private String valor;  

  
    private Configuracao() {}

    
    public static Configuracao getInstance() {
        if (instance == null) {
            instance = new Configuracao();
        }
        return instance;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public static void main(String[] args) {
        Configuracao config1 = Configuracao.getInstance();
        Configuracao config2 = Configuracao.getInstance();

        config1.setValor("Configuração 1");
        System.out.println("Config1: " + config1.getValor());
        System.out.println("Config2: " + config2.getValor());  

        System.out.println("São a mesma instância? " + (config1 == config2));
    }
}

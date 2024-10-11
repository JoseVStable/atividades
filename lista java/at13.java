public class Matematica {

    
    public static int fatorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * fatorial(n - 1);
        }
    }

    public static void main(String[] args) {
        
        System.out.println("Fatorial de 8: " + Matematica.fatorial(8));
        System.out.println("Fatorial de 3: " + Matematica.fatorial(3));
    }
}

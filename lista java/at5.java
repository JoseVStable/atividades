import java.util.ArrayList;
import java.util.List;


class Animal {
    public void som() {
        System.out.println("O animal faz um som.");
    }
}


class Cachorro extends Animal {
    @Override
    public void som() {
        System.out.println("O cachorro late: Au Au!");
    }
}


class Gato extends Animal {
    @Override
    public void som() {
        System.out.println("O gato mia: Miau!");
    }
}

public class Main {

    public static void emitirSonsDosAnimais(List<Animal> animais) {
        for (Animal animal : animais) {
            animal.som();  
        }
    }

    public static void main(String[] args) {
        
        List<Animal> animais = new ArrayList<>();
        animais.add(new Cachorro());
        animais.add(new Gato());

        
        emitirSonsDosAnimais(animais);
    }
}

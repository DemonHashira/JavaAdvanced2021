package trySth;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class TrySmth {

    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("fish",false,true));
        animals.add(new Animal("kangaroo",true,false));
        animals.add(new Animal("rabbit",false,true));
        animals.add(new Animal("turtle",true,false));
        System.out.println("All animals that can hop");
        print(animals,animal -> animal.isCanHop());
        System.out.println("All animals that can swim");
        print(animals,animal -> animal.isCanSwim());

        Supplier<Animal> random = () -> new Animal("Test",true,true);
        random.get();
    }

    private static void print(List<Animal> animals, CheckProperty checkProperty) {
        for (Animal animal:animals) {
            if (checkProperty.test(animal)) {
                System.out.println(animal.toString());
            }
        }
    }
}

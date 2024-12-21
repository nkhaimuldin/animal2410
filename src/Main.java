import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();

        Mammal mammal = new Mammal("Barsik", 3, 15, 25,
                false, "something");
        animals.add(mammal);
        Dog dog = new Dog("Rex", 2, 50, 25,
                true, "something", "anotherSomething");
        animals.add(dog);

        for (Animal animal : animals) {
            if(animal instanceof Dog) {
                ((Dog) animal).play();
            }
            System.out.println(animal);
        }
    }
}
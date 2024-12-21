public class Mammal extends Animal {
    private String something;

    public Mammal() {
        super(); //calls no arg constructor of the superclass
    }

    public Mammal(String name, int age, double height, double weight, boolean gender, String something) {
        super(name, age, height, weight, gender); //calls parametrized constructor of the superclass
        this.something = something;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nSomething: " + something;
    }
}

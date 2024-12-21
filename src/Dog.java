public class Dog extends Mammal {
    private String anotherSomething;


    public Dog(){
        super();
    }

    public Dog(String name, int age, int height, int weight,
               boolean gender, String something, String anotherSomething) {
        super(name, age, height, weight, gender, something);
        this.anotherSomething = anotherSomething;

    }

    @Override
    public void makeSound() {
        System.out.println("Woof-woof");
    }

    public void play(){
        System.out.println("play");
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nAnotherSomething: " + anotherSomething;
    }
}

public class Animal {
    private static int id = 1;
    private int id_Gen;
    private String name;
    private int age;
    private double height;
    private double weight;
    private boolean gender;

    public Animal() {
        this.id_Gen = id++;
    }

    public Animal(String name, int age, double height, double weight, boolean gender) {
        this();
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.gender = gender;
    }

    public int getId_Gen() {
        return id_Gen;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public void eat(){
        System.out.println("Animal eats unknown food");
    }

    public void sleep(){
        System.out.println("Animal sleeps");
    }

    public void makeSound(){
        System.out.println("Animal makes unknown sound");
    }


    @Override
    public String toString() {
        return "ID: " + id_Gen +
                "\nName: " + name +
                "\nAge: " + age +
                "\nGender: " + (gender ? "male" : "female") +
                "\nHeight: " + height +
                "\nWeight: " + weight;
    }
}

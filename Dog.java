public class Dog extends Animal {

    public Dog(String name, float age) {
        super(name, age);
    }

    @Override
    public String talk() {
        return "Bark";
    }
}

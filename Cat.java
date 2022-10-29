public class Cat extends Animal {
    public Cat(String name, float age) {
        super(name, age);
    }

    @Override
    public String talk() {
        return "Meow";
    }
}

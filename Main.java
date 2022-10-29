import java.util.List;

class Main {

    public static void main(String[] args) {
        Animal dog = new Dog("Sparky", 2f);
        Animal cat = new Cat("Garfield", 5f);

        List<Animal> myAnimals = List.of(dog, cat);

        for(Animal a : myAnimals) {
            System.out.println(a.getName() + " " + a.talk());
        }
    }
}
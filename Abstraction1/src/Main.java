import java.util.ArrayList;

public class Main {
    // We are working on learning about abstraction.
    // Abstraction in programming involves the idea of base classes from which other more specific classes inherit
    // For example, we may have an animal class that has basic functions like makeSound() or move() from which
    // classes like Dog, Cat, and Horse inherit some functionality/attributes which they then refine to be specific

    public static void main(String[] args) {
        // Animal is abstract, so even though it has a constructor, you can not make a new Animal, uncomment to see error
        // Animal animal = new Animal("animal", "big", 100);
        Dog goodDog = new Dog("Cattle Dog", "medium", 40);
        goodDog.makeNoise();
        doAnimalStuff(goodDog);

        Fish nemo = new Fish("Clown Fish", "small", 0.25);
        nemo.makeNoise();
        doAnimalStuff(nemo);

        // The useful this here is that by typing this ArrayList with Animal it can take any Animal including do or fish
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(goodDog);
        animals.add(new Dog("German Shepard", "Large", 95));
        animals.add(new Dog("Wolf", "Large", 100));
        animals.add(new Fish("Shark", "Large", 350));
        animals.add(new Fish("Tuna", "Medium", 55));
        animals.add(new Dog("Chihuahua", "Tiny", 11));

        for (Animal animal : animals) {
            doAnimalStuff(animal);
        }
    }

    private static void doAnimalStuff(Animal animal) {
        // We know we cant make an animal of type Animal but we can pass any class that extends from animal to this
        animal.makeNoise();
        animal.move("slow");

    }
}

public class Main {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal("Generic", "Huge", 400);
        doAnimalStuff(genericAnimal, "slow");

        Dog dog1 = new Dog();
        doAnimalStuff(dog1, "fast");

        Dog yorkie = new Dog("Yorkie", 14);
        doAnimalStuff(yorkie, "very fast");

        Dog dane = new Dog("Great Dane", 120, "floppy", "skinny");
        doAnimalStuff(dane, "slow");

        Dog blueHeeler = new Dog("Heeler", 44, "perky", "fluffy");
        doAnimalStuff(blueHeeler, "fast");
    }

    public static void doAnimalStuff(Animal animal, String speed) {
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_ _ _ _ _");

    }
}

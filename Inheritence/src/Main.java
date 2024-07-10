public class Main {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal("Generic", "Huge", 400);
        doAnimalStuff(genericAnimal, "slow");

        Dog dog1 = new Dog();
        doAnimalStuff(dog1, "fast");
    }

    public static void doAnimalStuff(Animal animal, String speed) {
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_ _ _ _ _");

    }
}

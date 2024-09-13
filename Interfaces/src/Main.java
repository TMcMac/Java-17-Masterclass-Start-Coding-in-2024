public class Main {
    // No we are working on interfaces
    // An interface is like an abstract class though it isn't a class. An interface is more like a contract that forces
    // The classes that extend it to implement the interface's abstract methods or the code won't compile
    // The inheriting class wants to be known as the type the interface specifies and this allows classes with little in
    // common to end up in things like the same ArrayList

    // An interface is usually named for what it does and ends in 'able' such as Comparable or Iterable meaning it is
    // something that does something or has an expected set of behaviors

    // Classes are associated with interfaces by using the implements label ie
    // public class Bird implements FlightEnabled {}


    public static void main(String[] args) {
        // Bird extends Animal and implements Trackable and FlightEnabled so it can be assigned to any of those.
        Bird newBird = new Bird();
        Animal animal = newBird;
        Trackable tracked = newBird;
        FlightEnabled flier = newBird;

        // Move is implemented on animal, not on Tracked or FlightEnabled so those wont work
        newBird.move();
        animal.move();
//        tracked.move();
//        flier.move;

        // These all work because Bird is our runtime object and we implemented the methods on Bird
        flier.takeOff();
        flier.fly();
        tracked.track();
        flier.land();
    }
}

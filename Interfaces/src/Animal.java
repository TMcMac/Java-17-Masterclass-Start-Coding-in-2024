interface FlightEnabled {
    // An method in an interface is abstract by default so all three of these are valid, public and abstract are redundant
    // Interface methods are implicitly public and can not be set to protected
    public abstract void takeOff();
    abstract void land();
    void fly();

    // Attributes declared on an interface are implicitly Public, Static, and Final meaning they are constants (all caps)
    double MILES_TO_KM = 1.60934;
    double KM_TO_MILES = 0.621371;

    default FlightStages transition(FlightStages stage) {
//        System.out.println("transition not implemented on " + getClass().getName());
//        return null;

        FlightStages nextStage = stage.getNextStage();
        System.out.println("Transitioning from " + stage + " to " + nextStage);
        return nextStage;
    }
}

interface Trackable {

    // Why have type methods that don't do anything? Having these forces any class the implements the interface to
    // implement these methods, so you guarantee some functionality or the code won't compile
    void track();
}

enum FlightStages implements Trackable {GROUNDED, LAUNCH, CRUISE, DATA_COLLECTION;

    @Override
    public void track() {

        if (this != GROUNDED) {
            System.out.println("Monitoring " + this);
        }
    }

    public FlightStages getNextStage() {

        FlightStages[] allStages = values();
        return allStages[(ordinal() + 1) % allStages.length];
    }
}

record DragonFly(String name, String type) implements FlightEnabled {

    @Override
    public void takeOff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }
}

class Satellite implements OrbitEarth {

    public void achieveOrbit() {
        System.out.println("Orbit achieved!");
    }

    @Override
    public void takeOff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }
}

interface OrbitEarth extends FlightEnabled {
    // Interfaces dont implement other interfacesso you need to use extends
    void achieveOrbit();
}

public abstract class Animal {
    public abstract void move();

}

interface FlightEnabled {
    // An method in an interface is abstract by default so all three of these are valid, public and abstract are redundant
    // Interface methods are implicitly public and can not be set to protected
    public abstract void takeOff();
    abstract void land();
    void fly();

    // Attributes declared on an interface are implicitly Public, Static, and Final meaning they are constants (all caps)
    double MILES_TO_KM = 1.60934;
    double KM_TO_MILES = 0.621371;
}

interface Trackable {

    // Why have type methods that don't do anything? Having these forces any class the implements the interface to
    // implement these methods, so you guarantee some functionality or the code won't compile
    void track();
}

public abstract class Animal {
    public abstract void move();

}
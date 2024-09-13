interface FlightEnabled {
    // An method in an interface is abstract by default so all three of these are valid, public and abstract are redundant
    // Interface methods are implicitly public and can not be set to protected
    public abstract void takeOff();
    abstract void land();
    void fly();
}

interface Trackable {

    // Why have type methods that don't do anything? Having these forces any class the implements the interface to
    // implement these methods, so you guarantee some functionality or the code won't compile
    void track();
}

public abstract class Animal {
    public abstract void move();

}

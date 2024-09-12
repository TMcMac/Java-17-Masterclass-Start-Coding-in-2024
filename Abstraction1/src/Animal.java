public abstract class Animal {
    // An  abstract class is never meant to be instantiated, only to provide a blueprint for concrete classes to inherit
    // Even functions can be writer, though empty, so other classes will have to institute a function like move
    protected String type;
    private String size;
    private double weight;

    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    // Concrete methods have to have functioning methods because concrete children that inherit from that concrete class
    // can override the function or just inherit it and use the parents version.
    // Abstract methods form a blueprint but have no functionality so children that inherit must institute a method
    // of that name but must also build out their unique functionality as the parent method is just an abstract
    // the subclass will not compile if it does not implement concrete versions of the abstract methods from parent
    public abstract void move(String Speed);
    public abstract void makeNoise();
}

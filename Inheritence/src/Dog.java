public class Dog extends Animal{
    private String earShape;
    private String tailShape;

    public Dog() {
        // super() calls the constructor on the parent class
        // If you use this it must be the first constructor
        // If you don't add this, java implicitly creates this
        super("Mutt", "Medium", 50);
    }

    public Dog(String type, double weight) {
        // Basic constructor that calls the 4 param constructor, which in turn calls animal constructor
        this(type, weight, "Perky", "Curled");
    }

    public Dog(String type, double weight, String earShape, String tailShape) {
        // Calls the parent constructor with a nice turnary for size
        super(type, (weight < 15 ? "small" : (weight < 45 ? "medium" : "large")), weight);
        // Then adds dog specific attributes
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        // Override decorator allows overriding the parent method of the same name
        // This adds features to toString while still calling the super method
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    @Override
    public void move(String speed) {
        super.move(speed);
//        System.out.println("Dogs walk, run, and wag their tails!");
        if(speed == "slow") {
            walk();
            wagTail();
        } else {
            run();
            bark();
        }
        System.out.println();
    }

    @Override
    public void makeNoise() {
        if(type == "Wolf") {
            System.out.print("Ow Woooooooo! ");
        }
        bark();
        System.out.println();
    }

    // These methods are only for dogs so it is private and will only be called
    // internally in the class from makeNoise();
    private void bark() {
        System.out.print("Woof! ");
    }
    private void run() {
        System.out.print("Dog running ");
    }
    private void walk() {
        System.out.print("Dog walking ");
    }
    private void wagTail() {
        System.out.print("Tail wagging ");
    }
}

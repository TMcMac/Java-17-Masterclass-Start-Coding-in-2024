public class Dog extends Animal{
    public Dog() {
        // super() calls the constructor on the parent class
        // If you use this it must be the first constructor
        // If you don't add this, java implicitly creates this
        super("Mutt", "Medium", 50);
    }
}

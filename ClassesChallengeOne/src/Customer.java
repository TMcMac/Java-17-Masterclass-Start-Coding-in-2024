public class Customer {
    // Attributes
    private String name;
    private double creditLimit;
    private String email;

    // Getters
    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }

    //Constructors

    // No Args constructor, can call the two ares constructor, which can call the full ars constructor (This is constructor chaining)
    public Customer() {
        this("John Doe", "test@localhost.com");
    }

    public Customer(String name, String email) {
        this(name, 1000, email);
    }

    public Customer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

}

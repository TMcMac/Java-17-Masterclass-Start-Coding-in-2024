public class Animal {
    // Top level class for animals

    // Attributes that theoretically all animals share
    // Changed type from private to protected so that dog can use type for a check
    protected String type;
    private String size;
    private double weight;

    public Animal() {}

    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", weight=" + weight +
                '}';
    }

    public void move(String speed) {
        System.out.println(type + " moves " + speed);
    }

    public void makeNoise() {
        System.out.println(type + " makes a noise");
    }
}

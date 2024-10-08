public class Fish extends Animal{

    public Fish(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        if (speed.equals("slow")) {
            System.out.println(getExplicitType() + " gentle swimming");
        } else {
            System.out.println(getExplicitType() + " rapid swimming");
        }
    }

    @Override
    public void makeNoise() {
        System.out.println("Bubble bubble...");
    }
}

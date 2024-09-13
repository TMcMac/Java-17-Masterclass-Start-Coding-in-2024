public class Dog extends Mammal{
    // We MUST have a constructor that calls super because we built a constructor on Animal so there is no default
    // no args constructor, the abstract parent is much stricter than normal parents and forces children to follow rules
    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    // We must declare and build these methods or our code wont compile, having abstract version on Animal forces us
    // to build these on each child with specific functionality to that child, no simple inheriting/using parent
    @Override
    public void move(String speed) {
        if (speed.equals("slow")) {
            System.out.println(getExplicitType() + " walking");
        } else {
            System.out.println(getExplicitType() + " running");
        }
    }

    @Override
    public void shedHair() {
        System.out.print(getExplicitType() + " sheds all the time.");
    }

    @Override
    public void makeNoise() {
        if (type == "Wolf") {
            System.out.println("Oooowwooooo! ");
        } else {
            System.out.println("Woof! ");
        }
    }
}

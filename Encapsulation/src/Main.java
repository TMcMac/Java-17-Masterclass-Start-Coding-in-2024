public class Main {
    public static void main(String[] args) {
        // We did not create a constructor in the player class but Java provides a default no params constructor
        Player player1 = new Player();

        // We are able to access these attributes because they are set to public
        player1.name = "Tim";
        player1.health = 20;
        player1.weapon = "Sword";

        int damage = 10;
        player1.loseHealth(damage);
        System.out.println("Remaining health = " + player1.getHealth());

        // Here we can override what should be the max health of 100
        player1.health = 2000;
        System.out.println("Remaining health = " + player1.getHealth());

        // Public access is bad bc it takes control away from the class itself, allowing classes like main to make changes
        // that might go against rules in the class itself, including logic and tests in the class's functions
        // It also means that changes for things like attribute names need to happen in multiple classes/locations
        // It can also mean that the calling code is responsible for all calls to initialize an object(player) creating
        // and interdependency between the calling code and the class.

        // Now lets work with our encapsulated player class
        EncapsulatedPlayer tim = new EncapsulatedPlayer("Tim");
        System.out.println("Initial health is: " + tim.getHealth());

        // Previous we could override max health, lets try that with a new player
        EncapsulatedPlayer jim = new EncapsulatedPlayer("Jim", 2000, "Battle Axe");
        System.out.println("Initial health for is: " + jim.getHealth());
        // With encapsulation our constructor keeps the health limited to 100, EncapsulatedPlayer class is in control

    }
}

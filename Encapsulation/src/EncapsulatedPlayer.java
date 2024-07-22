public class EncapsulatedPlayer {
    private String name;
    private int health;
    private String weapon;

    public EncapsulatedPlayer(String name) {
        this(name, 100, "Basic Sword");
    }

    public EncapsulatedPlayer(String name, int health, String weapon) {
        this.name = name;
        if (health < 1) {
            this.health = 1;
        } else if (health > 100) {
            this.health = 100;
        } else {
            this.health = health;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        health -= damage;
        if (health <= 0) {
            System.out.println("The player has been knocked out...");
        }
    }

    public int getHealth() {
        return health;
    }

    public void restoreHealth(int health) {
        this.health += health;
        if (this.health > 100) {
            this.health = 100;
            System.out.println("Player health restored to 100!");
        } else {
            System.out.printf("Player restored health to: %d\n", this.health);
        }
    }
}

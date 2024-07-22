public class Player {
    public String name;
    public int health;
    public String weapon;

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

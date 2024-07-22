public class Main {
    public static void main(String[] args) {
        CoffeeMaker brewer = new CoffeeMaker(false);
        DishWasher whirlpool = new DishWasher(false);
        Refrigerator samsung = new Refrigerator(false);

        SmartKitchen dreamKitchen = new SmartKitchen(brewer, whirlpool, samsung);
    }
}

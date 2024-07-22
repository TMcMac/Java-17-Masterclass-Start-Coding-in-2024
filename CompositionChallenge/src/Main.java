public class Main {
    public static void main(String[] args) {
        CoffeeMaker brewer = new CoffeeMaker(false);
        DishWasher whirlpool = new DishWasher(false);
        Refrigerator samsung = new Refrigerator(false);

        SmartKitchen dreamKitchen = new SmartKitchen(brewer, whirlpool, samsung);

        //Test one all set to false by default
        dreamKitchen.coffeeMaker.makeCoffee();
        dreamKitchen.dishWasher.doDishes();
        dreamKitchen.fridge.orderFood();
        System.out.println();

        // Set all to true and rerun
        dreamKitchen.addWater();
        dreamKitchen.loadDishwasher();
        dreamKitchen.pourMilk();
        dreamKitchen.doKitchenWork();
        System.out.println();

        //All should be false again
        dreamKitchen.coffeeMaker.makeCoffee();
        dreamKitchen.dishWasher.doDishes();
        dreamKitchen.fridge.orderFood();
        System.out.println();

        // Set all to true and rerun
        dreamKitchen.setKitchenState(true, true, true);
        dreamKitchen.doKitchenWork();
        System.out.println();

    }
}

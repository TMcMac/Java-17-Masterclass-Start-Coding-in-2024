import java.sql.Ref;

public class SmartKitchen {
    private CoffeeMaker coffeeMaker;
    private DishWasher dishWasher;
    private Refrigerator fridge;

    public SmartKitchen(CoffeeMaker coffeeMaker, DishWasher dishWasher, Refrigerator fridge) {
        this.coffeeMaker = coffeeMaker;
        this.dishWasher = dishWasher;
        this.fridge = fridge;
    }

    public void addWater() {
        coffeeMaker.hasWorkToDo = true;
    }

    public void pourMilk() {
        coffeeMaker.hasWorkToDo = true;
    }

    public void loadDishwasher() {
        dishWasher.hasWorkToDo = true;
    }

    public void setKitchenState(boolean coffeeStatus, boolean washerStatus, boolean fridgeStatus) {
        coffeeMaker.hasWorkToDo = coffeeStatus;
        dishWasher.hasWorkToDo = washerStatus;
        fridge.hasWorkToDo = fridgeStatus;
    }

    public void doKitchenWork() {
        fridge.orderFood();
        coffeeMaker.makeCoffee();
        dishWasher.doDishes();
    }
}

public class Main {
    public static void main(String[] args) {
//        Item coke = new Item("Coke", "drink", 1.50);
//        coke.printItem();
//        coke.setSize("LARGE");
//        coke.printItem();
//
//        Item avacado = new Item("Avacado", "topping", 1.00);
//        avacado.printItem();

//        Burger burger1 = new Burger("regular", 4.00);
//        burger1.addToppings("Bacon", "Cheese", "MAYO");
//        burger1.printItem();

        Meal regularMeal = new Meal();
        regularMeal.addBurgerToppings("Cheese", "Bacon", "Mayo");
        regularMeal.setDrinkSize("LARGE");
        regularMeal.printItemizedList();
    }
}

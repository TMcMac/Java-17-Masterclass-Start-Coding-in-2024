public class Appliance {
    protected boolean hasWorkToDo;

    public Appliance(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
}

class Refrigerator extends Appliance {
    public Refrigerator(boolean hasWorkToDo) {
        super(hasWorkToDo);
    }

    public void orderFood() {
        if(hasWorkToDo) {
            System.out.println("Ordering more food...");
            hasWorkToDo = false;
        } else {
            System.out.println("Fridge is full...");
        }
    }
}

class DishWasher extends Appliance {
    public DishWasher(boolean hasWorkToDo) {
        super(hasWorkToDo);
    }

    public void doDishes() {
        if(hasWorkToDo) {
            System.out.println("Washing the dishes...");
            hasWorkToDo = false;
        } else {
            System.out.println("Please load dishwasher...");
        }
    }
}

class CoffeeMaker extends Appliance {
    public CoffeeMaker(boolean hasWorkToDo) {
        super(hasWorkToDo);
    }

    public void makeCoffee() {
        if(hasWorkToDo) {
            System.out.println("Brewing fresh coffee...");
            hasWorkToDo = false;
        } else {
            System.out.println("Please prep the coffee maker...");
        }
    }
}
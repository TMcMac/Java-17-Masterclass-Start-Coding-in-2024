public class Car {
    private String make = "Ford";
    private String model = "F150 XLT";
    private String color = "Grey";
    private int doors = 4;
    private boolean convertible = false;

    public void describeCar() {
        System.out.println( doors + "-Door " + color + " " + make + " " + model + " " + (convertible ? "Convertible" : ""));
    }
}

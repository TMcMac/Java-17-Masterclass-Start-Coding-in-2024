public class Main {
    public static void main(String[] args) {

        // instantiate an object of type car or else get a null pointer reference
        Car car = new Car();

        // show the default values we have for car in the car class
        System.out.println("Default values: ");
        System.out.println("Make = " + car.getMake());
        System.out.println("Model = " + car.getModel());

        // now lets make a dream car
        System.out.println("\nDream car: ");
        car.setMake("Mercedes");
        car.setModel("Mclaren SLR");
        car.setDoors(2);
        car.setColor("Red");
        car.setConvertible(false);
        car.describeCar();

        // now lets test some validation in the make setter
        System.out.println("\nTest unsupported data: ");
        car.setMake("Hyundai");
        car.describeCar();
    }
}

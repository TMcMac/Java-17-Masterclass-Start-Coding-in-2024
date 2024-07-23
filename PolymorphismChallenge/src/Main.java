public class Main {
    public static void main(String[] args) {
        Car car = new Car("2024 Silver Honda Civic");
        runRace(car);

        Car f150 = new GasPoweredCar("Black F150 XLT", 15, 8);
        runRace(f150);

        Car tesla = new ElectricCar("2024 Tesla Model 3", 568, 75);
        runRace(tesla);

        Car ionic = new HybridCar("2024 Hyundai Ionic PiH", 90, 4, 75);
        runRace(ionic);
    }

    public static void runRace(Car car) {
        car.startEngine();
        car.drive();
        System.out.println("-".repeat(30));
    }
}

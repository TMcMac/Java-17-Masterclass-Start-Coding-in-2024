public class Car {
    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine() {
        System.out.println("Engine started");
    }

    public void drive() {
        System.out.println("Driving and type is " + getClass().getSimpleName());
        runEngine();
    }

    protected void runEngine() {
        System.out.println("Running");
    }
}

class GasPoweredCar extends Car {
    private double avgMPG;
    private int cylinders;

    public GasPoweredCar(String description) {
        super(description);
    }

    public GasPoweredCar(String description, double avgMPG, int cylinders) {
        super(description);
        this.avgMPG = avgMPG;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.printf("Gas -> %d cylinders are fired up and Ready!%n", cylinders);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Gas -> usage exceeds average: %.2f %n", avgMPG);
    }
}

class ElectricCar extends Car {
    private double avgMPcharge;
    private int batterySize;

    public ElectricCar(String description, double avgMPcharge, int batterySize) {
        super(description);
        this.avgMPcharge = avgMPcharge;
        this.batterySize = batterySize;
    }
    @Override
    public void startEngine() {
        System.out.printf("BEV -> switch %d kWh battery on and Ready!%n", batterySize);
    }

    @Override
    protected void runEngine() {
        System.out.printf("BEV -> usage exceeds average: %.2f %n", avgMPcharge);
    }
}

class HybridCar extends Car {
    private double avgMPG;
    private int cylinders = 4;
    private int batterySize;

    public HybridCar(String description, double avgMPG, int cylinders, int batterySize) {
        super(description);
        this.avgMPG = avgMPG;
        this.cylinders = cylinders;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.printf("HYB -> %d cylinders are fired up and Ready!%n", cylinders);
        System.out.printf("HYB -> switch %d kWh battery on and Ready!%n", batterySize);
    }

    @Override
    protected void runEngine() {
        System.out.printf("HYB -> usage exceeds average: %.2f %n", avgMPG);
    }
}

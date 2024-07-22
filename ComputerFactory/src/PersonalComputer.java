public class PersonalComputer extends Product{
    // A class can only extend one class but we can draw in attributes from other classes this way, composition rather than inheritence
    private Monitor monitor;
    private Motherboard motherboard;
    private ComputerCase computerCase;

    public PersonalComputer(String model, String manufacturer, Monitor monitor, Motherboard motherboard, ComputerCase computerCase) {
        super(model, manufacturer);
        this.monitor = monitor;
        this.motherboard = motherboard;
        this.computerCase = computerCase;
    }

    // These expose the parts directly to the calling code
//    public Monitor getMonitor() {
//        return monitor;
//    }
//
//    public Motherboard getMotherboard() {
//        return motherboard;
//    }
//
//    public ComputerCase getComputerCase() {
//        return computerCase;
//    }

    // Using better encapsulation we'll write functions to keep the computer parts hidden while restoring functionality
    private void drawLogo() {
        monitor.drawPixelAt(1200,50, "yellow");
    }
    public void powerUp() {
        computerCase.pressPowerButton();
        drawLogo();
    }
}

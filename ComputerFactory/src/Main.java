public class Main {
    public static void main(String[] args) {
        ComputerCase theCase = new ComputerCase("2208", "Dell", "240");
        Monitor theMonitor = new Monitor("32 inch curved", "Samsung", 32, "3840 x 2160");
        Motherboard theMotherBoard = new Motherboard("Z790", "ASUS", 4, 6, "v7.1");

        PersonalComputer thePC = new PersonalComputer("2208", "Dell", theMonitor, theMotherBoard, theCase);

        // Through function chaining we can access the functions on the classes, this is using composition
//        thePC.getMonitor().drawPixelAt(10,10,"red");
//        thePC.getMotherboard().loadProgram("Windows OS");
//        thePC.getComputerCase().pressPowerButton();

        // Through composition thePC is looking after its parts (including other objects) and main doesnt need to know about PC's parts
        thePC.powerUp();
    }
}

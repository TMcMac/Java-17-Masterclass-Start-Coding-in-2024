public class Main {
    public static void main(String[] args) {
        Printer printer1 = new Printer(50, true);
        System.out.println("Initial page count = " + printer1.getPagesPrinted());

        int workJob1 = printer1.printPages(51);
        System.out.println("Printing " + workJob1 + " pages");
        System.out.println("Page count = " + printer1.getPagesPrinted());

        int workJob2 = printer1.printPages(30);
        System.out.println("Printing " + workJob2 + " pages");
        System.out.println("Page count = " + printer1.getPagesPrinted());
    }
}

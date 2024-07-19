public class Main {
    public static void main(String[] args) {
        String helloWorld = "Hello World";
        printInformation(helloWorld);
        printInformation("");
        printInformation("                    ");

        String hellowWorldLower = helloWorld.toLowerCase();
        if (helloWorld.equals(hellowWorldLower)) {
            System.out.println("Values match exactly");
        }

        if (helloWorld.equalsIgnoreCase(hellowWorldLower)) {
            System.out.println("Values match when case ignored");
        }
    }

    public static void printInformation(String string) {
        if (string.isEmpty()) {
            System.out.println("String is empty.");
            return;
        }

        int length = string.length();

        if (string.isBlank()) {
            System.out.println("String is blank.");
            System.out.printf("Length = %d %n", length);
            return;
        }

        System.out.printf("Length = %d %n", length);
        System.out.printf("First char = %c %n", string.charAt(0));
        System.out.printf("Last char = %c %n", string.charAt(length - 1));

    }
}

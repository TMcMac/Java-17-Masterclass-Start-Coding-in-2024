public class StringOptions {
    public static void main(String[] args) {
        String helloWorld = "Hello" + " World!";
        // Strings are immutible so this wont work
        helloWorld.concat(" Welcome to here!");

        StringBuilder helloWorldBuilder = new StringBuilder("Hello" + " World!");
        // String builders are mutable so this will work
        helloWorldBuilder.append(" Welcome to here!");

        printInformation(helloWorld);
        printInformation(helloWorldBuilder);
    }

    public static void printInformation(String string) {
        System.out.println("String = " + string);
        System.out.println("Length = " + string.length());

    }

    public static void printInformation(StringBuilder builder) {
        System.out.println("String = " + builder);
        System.out.println("Length = " + builder.length());

    }
}

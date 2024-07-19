public class Main {
    public static void main(String[] args) {
        // Here is the old multiline string formating from before JDK15
        String bulletIt = "Print a Bulleted List:" +
                "\n\t\u2022 First Point" +
                "\n\t\u2022 Second Point" +
                "\n\t\u2022 Third Point";
        System.out.println(bulletIt);

        // New format using textblock in triple quotes
        String textBlock = """
                Print a New Bulleted List:
                    \u2022First Point
                    \u2022Second Point
                        \u2022 SubPoint""";
        System.out.println(textBlock);

        //Printing with a formatted string
        int age = 37;
        System.out.printf("Your age is %d\n", age);
    }
}

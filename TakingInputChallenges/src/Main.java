import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int currentYear = 2024;
        try {
            // This will work if run from terminal
            System.out.println(getInputFromConsole(currentYear));
        } catch (NullPointerException e) {
            // This will work with and IDE like IntelliJ
            System.out.println(getInputFromScanner(currentYear));
        }

    }
    public static String getInputFromConsole(int currentYear) {
        // Simple greeting and get line from console
        String name = System.console().readLine("Hi there, what is your name?  ");
        System.out.println("Hey " + name + ", it's nice to meet you!");
        String birthYear = System.console().readLine("What year were you born? (1899<= >=2024)  ");
        // Parse the string to an int using the Integer class built in so we can do math
        int age = currentYear - Integer.parseInt(birthYear);
        return "So you are " + age + " years old";
    }

    public static String getInputFromScanner(int currentYear) {
        // We need an instance of scanner (use new) and System.in to take input from console
        // Class name then lower camel instance name is best practice
        Scanner scanner = new Scanner(System.in);

        // Simple greeting and get line from console, scanner doesn't support a prompt
        System.out.println("Hi there, what is your name? ");
        String name = scanner.nextLine();
        System.out.println("Hey " + name + ", it's nice to meet you!");

        // Get birth year, again need println bc scanner doesn't have prompts
        int age = -1;
        // Oldest person alive is 117 so lets set up a test loop
        do {
            System.out.println("What year were you born? ");
            try {
                String birthYear = scanner.nextLine();
                age = checkData(currentYear, birthYear);
            } catch (NumberFormatException badUserData) {
                System.out.println("Please enter a valid year(YYYY) using only numbers.");
            }
        } while(age < 0);

        // Parse the string to an int using the Integer class built in so we can do math
        return "So you are " + age + " years old";
    }

    public static int checkData(int currentYear, String dateOfBirth) {
        int yob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear - 125;

        if((yob < minimumYear) || (yob > currentYear)) {
            return -1;
        }

        return (currentYear - yob);
    }
}

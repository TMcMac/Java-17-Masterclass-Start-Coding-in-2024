import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        try {
            System.out.println("You sum is: " + getInputFromConsole());
        } catch (NullPointerException e) {
            System.out.println("You sum is: " + getInputFromScanner());
        }
    }

    public static String getInputFromConsole() {

        // A sum for all the inputs and using a string to collect each input with concat
        int sum = 0;
        String summary = "Your enteries: ";

        // Nice Greeting
        String name = System.console().readLine("Hi there, what is your name?  ");
        System.out.println("Hey " + name + ", it's nice to meet you!");

        System.out.println("Let's do some basic math and sum five numbers!");
        // Keep count of 5 inputs
        int count = 1;
        do {
           String newNum =  System.console().readLine("Enter number #" + count + ": ");
           // Check number is a valid int
           int checkedNum = checkNumberValid(newNum);
           if(checkedNum < 0) {
               // If not a valid int say so and reprompt
               System.out.println("You entered " + newNum);
               System.out.println("Please enter a valid positive integer number");
           } else {
               // If valid int, increase count, add to sum, concatonate to final string
               count++;
               sum += checkedNum;
               summary = summary + newNum + " ";
           }
        } while(count <= 5);

        summary = summary + "= " + sum;
        return summary;
    }

    public static String getInputFromScanner() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        String summary = "Your enteries: ";
        System.out.println("Hi there, what is your name? ");
        String name = scanner.nextLine();
        System.out.println("Hey " + name + ", it's nice to meet you!");

        System.out.println("Let's do some basic math and sum five numbers!");
        int count = 1;
        do {
            System.out.println("Enter number #" + count + ": ");
            String newNum =  scanner.nextLine();
            int checkedNum = checkNumberValid(newNum);
            if(checkedNum < 0) {
                System.out.println("You entered " + newNum);
                System.out.println("Please enter a valid positive integer number");
            } else {
                count++;
                sum += checkedNum;
                summary = summary + newNum + " ";
            }
        } while(count <= 5);

        summary = summary + "= " + sum;
        return summary;
    }

    public static int checkNumberValid(String number) {
        int validNum = -1;
        try {
            validNum = Integer.parseInt(number);
        } catch (NumberFormatException badUserData) {
            return validNum;
        }
        return validNum;
    }
}

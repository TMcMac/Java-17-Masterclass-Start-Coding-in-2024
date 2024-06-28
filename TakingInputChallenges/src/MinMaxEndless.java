import java.util.Scanner;

public class MinMaxEndless {
    public static void main(String[] args) {

        // Code challenge to create an endless loop that tracks min number and max number entered, and breaks on any other key (non number)
        double min = 0;
        double max = 0;
        double validNum;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the endless min/max loop. Enter a number to continue or any other key to quit.");
        while(true) {
            String userEntered = scanner.nextLine();
            try {
                validNum = Double.parseDouble(userEntered);
            } catch (NumberFormatException badUserData) {
                System.out.println(userEntered + " entered, not a valid number, quitting...");
                System.out.println("Max was: " + max + " and Min was: " + min);
                break;
            }
            if(validNum < min) {
                min = validNum;
            } else if (validNum > max) {
                max = validNum;
            }
            System.out.println("Max is: " + max + " and Min is: " + min);
            System.out.println("Please enter your next number: ");
        }
    }
}

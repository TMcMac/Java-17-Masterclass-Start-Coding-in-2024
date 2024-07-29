import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] integers = new int[10];
        Scanner myScan = new Scanner(System.in);

        for(int i = 0; i < 10; i++) {
            int num;
            System.out.println((i + 1) + " of 10: Please enter an integer 1-999:");

            try {
                num = myScan.nextInt();
            }
            catch(Exception e) {
                System.out.println("Invalid entry, exiting");
                num = 0;
            }

            integers[i] = num;
        }

        System.out.println("The numbers you entered were: " + Arrays.toString(integers));
        int minNum = minArray(integers);
        System.out.println("The minimum value in your list is: " + minNum);

    }
    public static int minArray(int[] numbers) {
        int minNum = numbers[0];

        for (int num : numbers) {
            if (num < minNum) {
                minNum = num;
            }
        }
        return minNum;
    }
}

public class Main {
    public static void main(String[] args) {
        // simple first implementation of a for loop
//        for (int counter = 0; counter < 6; counter++) {
//            System.out.println(counter);
//        }

        // Test a few calls to calcInterest
        System.out.println("$100 at 5% interest -> $" + calcInterest(100, 5));
        System.out.println("$1000 at 15% interest -> $" + calcInterest(1000, 15));
        System.out.println("$25 at 95% interest -> $" + calcInterest(25, 95));
        System.out.println("$11 at 500% interest -> $" + calcInterest(11, 500));

        // Test a for loop for increasing interest
        for (double interest = 3.0; interest <= 8.0; interest++) {
            System.out.println("$100000 with " + interest + "% interests -> " + calcInterest(100000, interest));
        }


    }
    public static double calcInterest (double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}

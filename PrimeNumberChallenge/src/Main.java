public class Main {
    public static void main(String[] args) {

        // Test Cases
//        System.out.println("1 is " + (isPrime(1) ? "" : "NOT ") + "a prime number");
//        System.out.println("2 is " + (isPrime(2) ? "" : "NOT ") + "a prime number");
//        System.out.println("3 is " + (isPrime(3) ? "" : "NOT ") + "a prime number");
//        System.out.println("4 is " + (isPrime(4) ? "" : "NOT ") + "a prime number");
//        System.out.println("12 is " + (isPrime(12) ? "" : "NOT ") + "a prime number");
//        System.out.println("17 is " + (isPrime(17) ? "" : "NOT ") + "a prime number");
        int primesFound = 0;
        for (int num = 0; num <= 100; num++) {
            if (isPrime(num)) {
                System.out.println(num + " is a prime number!");
                primesFound++;
            }
        }
        System.out.println("From 0 to 100 there are " + primesFound + " prime numbers!");
    }

    public static boolean isPrime(int wholeNumber) {
        if (wholeNumber < 2) {
            return false;
        } else {
            for (int divisor = 2; divisor <= wholeNumber / 2; divisor++) {
                if (wholeNumber % divisor == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}

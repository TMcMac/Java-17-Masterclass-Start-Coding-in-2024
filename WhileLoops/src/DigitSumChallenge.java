public class DigitSumChallenge {
    public static void main(String[] args) {
        System.out.println("The sum of digits 123 is " + sumDigits(123));
        System.out.println("The sum of digits 555 is " + sumDigits(555));
        System.out.println("The sum of digits 10000 is " + sumDigits(10000));
        System.out.println("The sum of digits 999999999 is " + sumDigits(999999999));
        System.out.println("The sum of digits -1 is " + sumDigits(-1));
        System.out.println("In fact all negative numbers return " + sumDigits(-10129381));
    }
    public static int sumDigits(int number) {
        // a function to sum the individual digits of an int
        int sum = 0;

        if (number < 0) {
            return -1;
        }

        while(number > 0) {
            if(number < 10) {
                sum += number;
            } else {
                sum += number % 10;
            }
            number = (number /10);
        }
        return sum;
    }
}

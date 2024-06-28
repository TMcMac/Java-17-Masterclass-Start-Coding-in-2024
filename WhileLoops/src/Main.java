public class Main {
    public static void main(String[] args) {
        int number = 5;
        int countEven = 0;
        int countOdd = 0;

        while(number <= 20) {
            if(isEven(number)) {
                System.out.println(number + " is even!");
                countEven++;
            } else {
                countOdd++;
            }
            if (countEven >= 5) {
                break;
            }
            number++;
        }
        System.out.println("We found " + countOdd + " odd numbers and " + countEven + " even numbers");
    }
    public static boolean isEven(int number) {
        if(number % 2 == 0) {
            return true;
        }
        return false;
    }
}

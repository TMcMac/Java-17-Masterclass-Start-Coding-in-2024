public class Main {
    public static void main(String[] args) {
        int number = 5;
        
        while(number <= 20) {
            if(isEven(number)) {
                System.out.println(number + " is even!");
            }
            number++;
        }
    }
    public static boolean isEven(int number) {
        if(number % 2 == 0) {
            return true;
        }
        return false;
    }
}

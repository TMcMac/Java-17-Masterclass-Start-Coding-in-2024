public class Main {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 6000;
        int levelCompleted = 5;
        int bonus = 100;

        if (score < 5000 && score > 1000) {
            System.out.println("Your score was less than 5000 but greater than 1000");
        } else if (score >= 5000 && score < 9000){
            System.out.println("Your score was over 5000 but less than 9000");
        } else {
            System.out.println("Your score is over 9000!");
        }
    }
}

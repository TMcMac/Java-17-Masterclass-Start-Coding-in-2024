public class CopyClassMainChallenege {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = calculateScore(gameOver, score, levelCompleted,bonus);
        System.out.println("Your final score wad: " + finalScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        finalScore = calculateScore(gameOver, score, levelCompleted,bonus);
        System.out.println("Your final score wad: " + finalScore);


    }

    public static int calculateScore(boolean gameOver,int score,int levelCompleted,int bonus) {
        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus) + 1000;
        }
        return(finalScore);
    }
}

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

        // Testing calculatePosition and displayHigh
        int rankOne = calculateHighScorePosition(1500);
        int rankTwo = calculateHighScorePosition(999);
        int rankThree = calculateHighScorePosition(499);
        int rankFour = calculateHighScorePosition(5);

        displayHighScorePosition("Tim", rankOne);
        displayHighScorePosition("Joe", rankTwo);
        displayHighScorePosition("Megan", rankThree);
        displayHighScorePosition("Mike", rankFour);


    }

    public static int calculateScore(boolean gameOver,int score,int levelCompleted,int bonus) {
        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus) + 1000;
        }
        return(finalScore);
    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get to high score position " + position);
    }

    public static int calculateHighScorePosition(int score) {

        int position = 4;

        if (score >= 1000) {
            position = 1;
        } else if (score >= 500 && score < 1000 ) {
            position = 2;
        } else if (score >= 100 && score < 500) {
            position = 3;
        }

        return position;
    }
}

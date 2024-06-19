public class Main {
    public static void main(String args[]){

        double kilometers = (100 * 1.609344);

        int myVariable = 50;
        int highScore = 50;
        int health = 100;

        if (highScore > 50 ) {
            highScore = 1000 + highScore; // add the bonus points
        }

        if ((health < 25) && (highScore > 1000)) {
            System.out.println("Great score but gaurd your health more carefully!");
            highScore = highScore - 1000;
        }
    }
}

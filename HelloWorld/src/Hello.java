public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, Tim!");

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("Don't worry we're from here.");
        }

        int topScore = 80;
        if (topScore == 100) {
            System.out.println("You got the high school!");
        }

        int secondTopScord = 81;
        if ((secondTopScord < topScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScord <= 90)) {
            System.out.println("Atleast one condition is true");
        }

        String makeOfCar = "Toyota";
        boolean isDomestic = makeOfCar == "Toyota" ? false : true;

        double numOne = 20.00;
        double numTwo = 80.00;

        double sumOne = (numOne + numTwo) * 100.00;
        double sumTwo = sumOne % 40.0;

        System.out.println(sumTwo);

        boolean isZero = sumTwo == 0.0 ? true : false;

        if (!isZero) {
            System.out.println(isZero);
            System.out.println("We have some remainder");
        }
    }

}

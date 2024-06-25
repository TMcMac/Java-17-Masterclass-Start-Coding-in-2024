public class InchToCM {
    public static void main(String[] args) {
        double cmTestOne = convertToCM(68);
        double cmTestTwo = convertToCM(5, 8);

        System.out.println("68 inches = " + cmTestOne + " cm");
        System.out.println("5 feet 8 inches inches = " + cmTestTwo + " cm");

    }

    public static double convertToCM ( int inches){
        return (inches * 2.54);
    }

    public static double convertToCM ( int feet, int inches){
        int feetToInches = feet * 12;
        int totalInches = feetToInches + inches;

        return convertToCM(totalInches);
    }
}

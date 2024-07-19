public class StringMethods {
    public static void main(String[] args) {
        String birthDate = "01/01/1990";
        int startingIndex = birthDate.indexOf("1990");

        System.out.println("Starting index = " + startingIndex);
        System.out.println("Birth year = " + birthDate.substring(startingIndex));

        System.out.println("Birth month = " + birthDate.substring(3,5));

        String newDate = String.join("/", "12","31","1999");
        System.out.println("Make sure to set your clocks... " + newDate);

        System.out.println("Date with a dash: " + newDate.replaceFirst("/", "-"));
        System.out.println("Date with all dashes: " + newDate.replaceAll("/", "-"));


    }
}

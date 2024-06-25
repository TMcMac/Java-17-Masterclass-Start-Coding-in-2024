public class Main {
    public static void main(String[] args) {
        int value = 11;

        if (value ==1) {
            System.out.println("Value is one!");
        } else if (value ==2) {
            System.out.println("Value is two!");
        } else {
            System.out.println("Value was not one or two...");
        }

        switch (value) {
            case 1 -> System.out.print("The value is one");
            case 2 -> System.out.println("The value is two");
            case 3, 4, 5 -> System.out.println("The value is " + value);
            default -> System.out.println("The value is greater than 5");
        }

        String month = "MAY";
        System.out.println("The month of " + month + " is in " + getQuarter(month));


    }
    public static String getQuarter(String month) {
        switch (month) {
            case "JANUARY":
            case "February":
            case "MARCH":
                return ("quarter 1");
            case "APRIL":
            case "MAY":
            case "JUNE":
                return ("quarter 2");
            case "JULY":
            case "AUGUST":
            case "SEPTEMBER":
                return ("quarter 3");
            case "OCTOBER":
            case "NOVEMBER":
            case "DECEMBER":
                return ("quarter 4");
            default:
                return ("Unknown...");
        }
    }
}

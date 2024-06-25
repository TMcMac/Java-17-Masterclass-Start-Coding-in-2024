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

        String nato1 = natoAlphabet('A');
        String nato2 = natoAlphabet('b');
        String nato3 = natoAlphabet('C');
        String nato4 = natoAlphabet('l');
        String nato5 = natoAlphabet('o');
        String nato6 = natoAlphabet('w');
        String nato7 = natoAlphabet('t');
        String nato8 = natoAlphabet('F');


        System.out.println(nato1 + " " + nato2 + " " + nato3 + " easy as 123...");
        System.out.println(nato4 + " " + nato5 + " " + nato4);
        System.out.println(nato6 + " " + nato7 + " " + nato8);



    }
    public static String getQuarter(String month) {
        return switch (month) {
            case "JANUARY", "February", "MARCH" -> ("quarter 1");
            case "APRIL", "MAY", "JUNE" -> ("quarter 2");
            case "JULY", "AUGUST", "SEPTEMBER" -> ("quarter 3");
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> ("quarter 4");
            default -> ("Unknown...");
        };
    }

    public static String natoAlphabet(char letter) {
        return switch (letter) {
            case 'A', 'a' -> ("ALPHA");
            case 'B', 'b' -> ("BRAVO");
            case 'C', 'c' -> ("CHARLIE");
            case 'D', 'd' -> ("DELTA");
            case 'E', 'e' -> ("ECHO");
            case 'F', 'f' -> ("FOXTROT");
            case 'G', 'g' -> ("GULF");
            case 'H', 'h' -> ("HOTEL");
            case 'I', 'i' -> ("INDIA");
            case 'J', 'j' -> ("JULIET");
            case 'K', 'k' -> ("KILO");
            case 'L', 'l' -> ("LIMA");
            case 'M', 'm' -> ("MIKE");
            case 'N', 'n' -> ("NOVEMBER");
            case 'O', 'o' -> ("OSCAR");
            case 'P', 'p' -> ("PAPA");
            case 'Q', 'q' -> ("QUEBEC");
            case 'R', 'r' -> ("ROMEO");
            case 'S', 's' -> ("SIERRA");
            case 'T', 't' -> ("TANGO");
            case 'U', 'u' -> ("UNIFORM");
            case 'V', 'v' -> ("VICTOR");
            case 'W', 'w' -> ("WHISKEY");
            case 'X', 'x' -> ("XRAY");
            case 'Z', 'z' -> ("ZULU");
            default -> "Error, invalid letter...";
        };

    }
}

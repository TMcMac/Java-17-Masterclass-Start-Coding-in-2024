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
        switch (letter) {
            case 'A':
            case 'a':
                return ("ALPHA");
            case 'B':
            case 'b':
                return ("BRAVO");
            case 'C':
            case 'c':
                return ("CHARLIE");
            case 'D':
            case 'd':
                return ("DELTA");
            case 'E':
            case 'e':
                return ("ECHO");
            case 'F':
            case 'f':
                return ("FOXTROT");
            case 'G':
            case 'g':
                return ("GULF");
            case 'H':
            case 'h':
                return ("HOTEL");
            case 'I':
            case 'i':
                return ("INDIA");
            case 'J':
            case 'j':
                return ("JULIET");
            case 'K':
            case 'k':
                return ("KILO");
            case 'L':
            case 'l':
                return ("LIMA");
            case 'M':
            case 'm':
                return ("MIKE");
            case 'N':
            case 'n':
                return ("NOVEMBER");
            case 'O':
            case 'o':
                return ("OSCAR");
            case 'P':
            case 'p':
                return ("PAPA");
            case 'Q':
            case 'q':
                return ("QUEBEC");
            case 'R':
            case 'r':
                return ("ROMEO");
            case 'S':
            case 's':
                return ("SIERRA");
            case 'T':
            case 't':
                return ("TANGO");
            case 'U':
            case 'u':
                return ("UNIFORM");
            case 'V':
            case 'v':
                return ("VICTOR");
            case 'W':
            case 'w':
                return ("WHISKEY");
            case 'X':
            case 'x':
                return ("XRAY");
            case 'Z':
            case 'z':
                return ("ZULU");
            default:
                return "Error, invalid letter...";
        }

    }
}

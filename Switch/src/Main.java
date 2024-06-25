public class Main {
    public static void main(String[] args) {
        int value = 3;

        if (value ==1) {
            System.out.println("Value is one!");
        } else if (value ==2) {
            System.out.println("Value is two!");
        } else {
            System.out.println("Value was not one or two...");
        }

        switch (value) {
            case 1:
                System.out.print("The value is one");
                break;
            case 2:
                System.out.println("The value is two");
                break;
            default:
                System.out.println("The value is not one or two");
        }
    }
}

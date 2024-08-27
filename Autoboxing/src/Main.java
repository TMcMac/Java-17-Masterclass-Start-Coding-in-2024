import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer boxedInt = Integer.valueOf(15); //preferred but unnecessary
        Integer deprecatedBoxing = new Integer(21); // Deprecated as of JDK9
        int unBoxedInt = boxedInt.intValue(); // unnecessary

        //Automatic
        Integer autoBoxed = 15;
        int autoUnboxed = autoBoxed;
        System.out.println(autoBoxed.getClass().getName());

        // Auto boxing/unboxing is happening here as the functions return the opposite result but the return
        // values are being assigned to the opposite type
        Double resultBoxed = getLiteralDoublePrimitive();
        double resultUnboxed = getDoubleObject();

        Integer[] wrapperArray = new Integer[5];
        wrapperArray[0]  = 50;
        System.out.println(Arrays.toString(wrapperArray));
    }


    // demonstrating primitive vs class returns
    private static Double getDoubleObject() {
        return Double.valueOf(100.00);
    }

    private static double getLiteralDoublePrimitive() {
        return 100.00;
    }

    // Shows autoboxing with return, converts the param to the return
    public  static int returnAnInt(Integer i) {
        return i;
    }
    public  static Integer returnAnInteger(int i) {
        return i;
    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) {
        List<String> natoList = new ArrayList<>(List.of("alpha", "bravo", "charlie", "delta", "echo", "foxtrot"));

        // nice simple way that doesn't need indexing
        for (String s : natoList) {
            System.out.println(s);
        }
        System.out.println("_________");
        // Now with a lambda, the foreach method is really an enhanced for loop under the hood
        natoList.forEach((String s) -> System.out.println(s));

        System.out.println("_________");
        // If you want to use multiple statements in the lambda use {} and end each line with a ';'
        // You can also choose to specify type, var, or skip declaring and not use the extra '( )'
        natoList.forEach((var s) -> {
            char first = s.charAt(0);
            System.out.println(s + " means " + first);
        });
        System.out.println("_________");
        //Testing out our generic lambda Operation, we give it an operation to perform and two values
        int result = calculator((a, b) -> a + b, 5, 2);
        int result2 = calculator((a, b) -> a * b, 5, 2);
        var result3 = calculator((a, b) -> a / b, 5.0, 2.0);
        var result4 = calculator((a, b) -> a.toUpperCase() + " " + b.toUpperCase(), "Ralph", "Kramden");
        // Now with the Java built in version
        var result5 = calculatorDefualt((a, b) -> a.toUpperCase() + " " + b.toUpperCase(), "Ralph", "Kramden");

        // Nex lets work with some coordinates
        var coords = Arrays.asList(
                new double[]{47.2160, -95.2348},
                new double[]{29.1566, -89.2495},
                new double[]{35.1556, -90.0659}
        );
        coords.forEach(s -> System.out.println(Arrays.toString(s)));

        // Using the biConsumer function
        // Make a simple function to be executed and assign it to a variable
        BiConsumer<Double, Double> function1 = (lat, lon) -> System.out.printf("[lat: %.3f lon:%.3f]%n", lat, lon);

        // Get a coordinate pair
        var firstPoint = coords.getFirst();

        // Send the coordinate points and print function to our BiConsumer to be executed
        processPoint(firstPoint[0], firstPoint[1], function1);

        // Now we'll use a for each to print each coord pair nicely
        System.out.println("_________");
        coords.forEach(s -> processPoint(s[0], s[1], function1));
        // You could even skip the function1 assignment above and stick the lambda directly in this call, but that is
        // less reusable.


        // A predicate lambda expression - ie a boolean test
        // this expression takes list and removes an element, if it matches a case-insensitive string
        // Use cmd + click to view removeIf under the hood
        natoList.removeIf(s -> s.equalsIgnoreCase("bravo"));
        // Then print natoList to check
        System.out.println("_________");
        natoList.forEach(s -> System.out.println(s));

    }
    // This is a static generic method that uses our generic lambda Operation, overrides the method
    // and does something to the two generic type values (of same type)
    public static <T> T calculator(Operation<T> function, T value1, T value2) {
        T result = function.operate(value1, value2);
        System.out.println(result);
        return result;
    }

    // Now lets look at a builtin function from java.util.functions BinaryOperator
    // This is the exact same as the generic class and first calculator we made, turns out Java already had this
    public static <T> T calculatorDefualt(BinaryOperator<T> function, T value1, T value2) {
        T result = function.apply(value1, value2);
        System.out.println(result);
        return result;
    }

    // In java.util.function there are over 40 interfaces but the 4 main catagories and there most basic method are
    // Consumer - void accept(T t) - executes code without returning data
    // Function - R apply(T t) - return the result of an operation or function
    // Predicate - boolean test(T t) - test if a condition is true or false
    // Supplier - T get() - return an instance of something

    // we wrote a Function, a version of BinaryOperator (two arguments) that did a thing and returned a value
    // System.out.println(s) is an example of a consumer, executes and operation, no return


    // Using a java built in consumer that takes two parameters
    public static <T> void processPoint(T t1, T t2, BiConsumer<T, T> consumer) {
        consumer.accept(t1, t2);
    }
}

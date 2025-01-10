import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("alpha", "bravo", "charlie", "delta", "echo", "foxtrot"));

        // nice simple way that doesn't need indexing
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("_________");
        // Now with a lambda, the foreach method is really an enhanced for loop under the hood
        list.forEach((String s) -> System.out.println(s));

        System.out.println("_________");
        // If you want to use multiple statements in the lambda use {} and end each line with a ';'
        // You can also choose to specify type, var, or skip declaring and not use the extra '( )'
        list.forEach((var s) -> {
            char first = s.charAt(0);
            System.out.println(s + " means " + first);
        });
        System.out.println("_________");
        //Testing out our generic lambda Operation, we give it an operation to perform and two values
        int result = calculator((a, b) -> a + b, 5, 2);
        int result2 = calculator((a, b) -> a * b, 5, 2);
        var result3 = calculator((a, b) -> a / b, 5.0, 2.0);
        var result4 = calculator((a, b) -> a.toUpperCase() + " " + b.toUpperCase(), "Ralph", "Kramden");
    }
    // This is a static generic method that uses our generic lambda Operation, overrides the method
    // and does something to the two generic type values (of same type)
    public static <T> T calculator(Operation<T> function, T value1, T value2) {
        T result = function.operate(value1, value2);
        System.out.println(result);
        return result;
    }
}

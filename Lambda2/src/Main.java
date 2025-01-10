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
    }
}

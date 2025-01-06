import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    // Inner record, static by default so accessible on the main class
    record Person (String firstName, String lastName) {

        // Better to string method formatting
        @Override
        public String toString() {
            return firstName + ' ' + lastName;
        }
    }
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>(Arrays.asList(
                new Main.Person("Lucy", "Van Pelt"), // Demonstrates class qualifier on static nested class of Main
                new Person("Sally", "Brown"),
                new Person("Peppermint", "Patty"),
                new Person("Charlie", "Brown"),
                new Person("Linus", "Van Pelt")
        ));

        // using anonymous class
        var comparatorLastName = new Comparator<Person>() {

            @Override
            public int compare(Person o1, Person o2) {
                return o1.lastName().compareTo(o2.lastName());
            }
        };
        //people.sort(comparatorLastName); //original way of sorting

        people.sort((o1, o2) -> o1.lastName().compareTo(o2.lastName())); //sorting using a lambda
        System.out.println(people); // This one doesnt account for first name so some ordering is still needed


        interface EnhancedComparator<T> extends Comparator<T> {
            int secondLevel(T o1, T o2);
        }

        var comparatorMixed = new EnhancedComparator<Person>() {
            // Now we are using Enhanced comparator with second level which handles first name also
            @Override
            public int compare(Person o1, Person o2) {
                int result = o1.lastName().compareTo(o2.lastName());
                return (result == 0 ? secondLevel(o1, o2) : result);
            }

            @Override
            public int secondLevel(Person o1, Person o2) {
                return o1.firstName().compareTo(o2.firstName());
            }
        };

        people.sort(comparatorMixed);
        System.out.println(people);
    }
}

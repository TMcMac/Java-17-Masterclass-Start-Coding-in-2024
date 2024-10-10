import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    record Person (String firstName, String lastName) {

        @Override
        public String toString() {
            return "Person{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    '}';
        }
    }
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>(Arrays.asList(
                new Main.Person("Lucy", "Van Pelt"), // Demonstrates class qualifier on static nested class of Main
                new Person("Charlie",  "Brown"),
                new Person("Sally", "Brown"),
                new Person("Peppermint", "Patty")
        ));

        // using anonymous class
        var comparatorLastName = new Comparator<Person>() {

            @Override
            public int compare(Person o1, Person o2) {
                return o1.lastName().compareTo(o2.lastName());
            }
        };

        people.sort(comparatorLastName);
        for(Person person : people) {
            System.out.println(person);
        };
    }
}

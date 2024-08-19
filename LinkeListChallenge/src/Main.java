import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Build out itinerary of cities and distances
        LinkedList<Place> placesToVisit = cities();
        // We need a scanner to take input from the CLI
        Scanner scanner = new Scanner(System.in);
        // We'll use an iterator to move back and forth through the linked list placesToVisit
        ListIterator<Place> iterator = placesToVisit.listIterator(0);
        // This will be our menu of options
        String menu = """
                Available actions (select for or letter):
                (F)orward
                (B)ackward
                (L)ist
                (M)enu
                (Q)uit
                """;
        System.out.println("Welcome to my trip planner app\nTo see the trip we have planned us the following menu.\n");
        System.out.println(menu);
        while(true) {
            String input = scanner.nextLine().toUpperCase();
            Place currentCity = iterator.next();
            switch (input) {
                case "F", "FORWARD":
            }
        }



    }

    public static LinkedList<Place> cities() {
        // Set up a linked list of cities to visit departing from San Francisco
        LinkedList<Place> placesToVisit = new LinkedList<>();
        placesToVisit.add(new Place("San Francisco", 0));
        placesToVisit.add(new Place("Las Angeles", 383));
        placesToVisit.add(new Place("Las Vegas", 568));
        placesToVisit.add(new Place("Portland", 635));
        placesToVisit.add(new Place("Seattle", 808));
        placesToVisit.add(new Place("Austin", 1758));
        placesToVisit.add(new Place("Houston", 1928));
        placesToVisit.add(new Place("Chicago", 2132));
        placesToVisit.add(new Place("Detroit", 2397));
        placesToVisit.add(new Place("Washington", 2855));
        placesToVisit.add(new Place("New York", 2906));

        return placesToVisit;
    }

    public static void printItinerary(LinkedList<Place> itinerary) {
        // Start an iterator at the first city after SF and print the whole list
        ListIterator<Place> iterator = itinerary.listIterator(1);
        while(iterator.hasNext()) {
            Place city = iterator.next();
            System.out.println("Destination: " + city.getCityName() + " Distance from SF: " + city.getDistance() + " miles");
        }
    }

}

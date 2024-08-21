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
                (Q)uit""";
        System.out.println("Welcome to my trip planner app\nTo see the trip we have planned us the following menu.\n");
        // initial print of menu
        System.out.println(menu);
        // We'll use a bool to keep the while look going until a quit or end of the list
        boolean keepLoop = true;
        // we need a forward flag to help us know if the curser/iterator is changing directions
        boolean forward = true;
        while(keepLoop) {
            if(!iterator.hasPrevious()) {
                Place city = iterator.next();
                System.out.println("Originating : " + city.getCityName());
            }
            if(!iterator.hasNext()) {
                Place city = iterator.previous();
                System.out.println("Final : " + city.getCityName());
                forward = false;
            }
            String input = scanner.nextLine().toUpperCase().substring(0,1);
            switch (input) {
                case "F":
                    System.out.println("User wants to move forward");
                    if(!forward) { //Reversing direction
                        forward = true;
                        if(iterator.hasNext()) {
                            iterator.next(); // adjust the position forward
                        }
                    }
                    if(iterator.hasNext()) {
                        Place city = iterator.next();
                        System.out.println("City : " + city.getCityName() + " distance from SF : " + city.getDistance());
                    }
                    break;
                case "B":
                    System.out.println("User wants to move backward");
                    if(forward) { //Reversing direction
                        forward = false;
                        if(iterator.hasPrevious()) {
                            iterator.previous(); // adjust the position backward
                        }
                    }
                    if(iterator.hasPrevious()) {
                        Place city = iterator.previous();
                        System.out.println("City : " + city.getCityName() + " distance from SF : " + city.getDistance());
                    }
                    break;
                case "L":
                    printItinerary(placesToVisit);
                    break;
                case "M":
                    System.out.println(menu);
                    break;
                case "Q":
                    System.out.println("Thanks for checking out the trip!");
                    keepLoop = false;
                    break;
                default:
                    System.out.println("Please select an item from the menu...");
                    break;
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
        ListIterator<Place> listIter = itinerary.listIterator(0);
        int i = 0;
        while(listIter.hasNext()) {
            Place city = listIter.next();
            System.out.println("Destination " + i +": " + city.getCityName() + " Distance from SF: " + city.getDistance() + " miles");
            i++;
        }
    }

}

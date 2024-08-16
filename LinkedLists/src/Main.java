import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        // A linked list is like a line or a queue, it is a FIFO method, and a doubly linked list can be accessed
        // from the Head or the Tail.

        // One way to declare a new linked list with type
        LinkedList<String> placesToVisit = new LinkedList<>();
        // Another way, this time with var
        var placesToVisitAgain = new LinkedList<String>();

        placesToVisit.add("London");
        placesToVisit.add("Lisbon");
        //Overloaded method to insert at head
        placesToVisit.add(0, "Tokyo");
        System.out.println(placesToVisit);
        addMoreElements(placesToVisit);
        System.out.println(placesToVisit);
        // Commenting out the remove for now, uncomment to test
//        removeElements(placesToVisit);
//        System.out.println(placesToVisit);

        // Retrieving elements
//        gettingElements(placesToVisit);

        //Transversing and manipulating a list
//        printItinerary(placesToVisit);
//        printItinerary2(placesToVisit);
        printItinerary3(placesToVisit);

    }

    private static void addMoreElements(LinkedList<String> list) {
        //These methods are on the linked list class but not on an ArrayList class
        list.addFirst("Berlin");
        list.addLast("Paris");
        //queue methods
        list.offer("Sydney"); // adds to the end of the list (tail)
        list.offerFirst("Dublin");
        list.offerLast("Istanbul");
        //stack method
        list.push("Edinburgh"); // This adds to the front of the list (top of stack)
    }

    private static void removeElements(LinkedList<String> list) {
        list.remove(4); // remove element in position 4 (remember indexed from 0)
        list.remove("Istanbul");

        System.out.println(list);
        String s1 = list.remove(); // removed first element
        System.out.println(s1 + " was removed.");
        String s2 = list.removeFirst(); // removes first element
        System.out.println(s2 + " was removed.");
        String s3 = list.removeLast(); // removes last element
        System.out.println(s3 + " was removed.");
        System.out.println(list);

        //queue / dequeue methods
        String p1 = list.poll(); // Removes first element
        System.out.println(p1 + " was removed.");
        String p2 = list.pollFirst(); // Removes first element
        System.out.println(p2 + " was removed.");
        String p3 = list.pollLast(); // Removes last element
        System.out.println(p3 + " was removed.");

        // stack method
        // push to the stack, each push means a new head on the linked list
        list.push(p1);
        list.push(p2);
        list.push(p3);
        System.out.println(list);
        String p4 = list.pop(); //removed top of stack ie first element in linked list
        System.out.println(p4 + " was removed.");
    }

    public static void gettingElements(LinkedList<String> list) {
        // gets element at index 4 (fifth element)
        System.out.println("Retrieved Element = " + list.get(4));
        // Get by index in array is O(1) worst but O(N) for singly linked list, dor double java picks head or tail
        // based on what is closer so technically the worst is O(N/2)
        System.out.println("First Element = " + list.getFirst());
        System.out.println("Last Element = " + list.getLast());

        // Worst case is O(N) and best case is O(1) if its the first element
        System.out.println("Tokyo is at index: " + list.indexOf("Tokyo"));
        System.out.println("Lisbon is at: " + list.lastIndexOf("Lisbon"));

        //Queue retrieval method
        System.out.println("Element from element() = " + list.element()); // Queue is FIFO so first element if no param

        // Stack retrieval methods
        System.out.println("Element from peek() = " + list.peek());
        System.out.println("Element from peekLast() = " + list.peekLast());
        System.out.println("Element from peekFirst() = " + list.peekFirst());
    }

    public static void printItinerary(LinkedList<String> list) {
        // Working on transversing and manipulating a linked list
        System.out.println("First stop = " + list.getFirst());

        for(int i = 1; i < list.size(); i++) {
            System.out.println("--> From: " + list.get(i-1) + " to " + list.get(i));
        }
        System.out.println("Last stop = " + list.getLast());

    }

    public static void printItinerary2(LinkedList<String> list) {
        // Working on transversing and manipulating a linked list
        System.out.println("First stop = " + list.getFirst());
        String previousTown = list.getFirst();
        for(String town : list) {
            System.out.println("--> From: " + previousTown + " to " + town);
            previousTown = town;
        }
        System.out.println("Last stop = " + list.getLast());

    }

    public static void printItinerary3(LinkedList<String> list) {
        // Working on transversing and manipulating a linked list
        System.out.println("First stop = " + list.getFirst());
        String previousTown = list.getFirst();
        // Iterator is another way to transverse linked lists, similar to a database cursor
        // Specifically it is an object that allows traversal over records in a collection
        ListIterator<String> iterator = list.listIterator(1);
        // hasNext allows for checking if there is a next element and of course returns a bool
        while(iterator.hasNext()) {
            // Calling next can advance the iterator in the list/collection
            // Here we print each element in a list but via the iterator object
            var town = iterator.next();
            System.out.println("--> From: " + previousTown + " to " + town);
            previousTown = town;
        }
        System.out.println("Last stop = " + list.getLast());

        // A few notes, the iterator can only move forward through the list and the old mutation option is
        // iterator.remove(), you can not add or use list.remove() when using iterator
        // ListIterator is the enhanced iterator and has these and more functionality

    }
}

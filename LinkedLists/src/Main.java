import java.util.LinkedList;

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
        removeElements(placesToVisit);
        System.out.println(placesToVisit);


        placesToVisitAgain.add("Portland");
        placesToVisitAgain.add("Seattle");
        placesToVisitAgain.add(0, "New York");
        System.out.println(placesToVisitAgain);

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
}

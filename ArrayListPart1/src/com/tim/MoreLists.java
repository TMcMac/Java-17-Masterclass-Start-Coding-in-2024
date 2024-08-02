package com.tim;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MoreLists {
    public static void main(String[] args) {
        // An array of strings
        String[] items = {"salad", "cheese", "milk", "eggs", "tomatoes"};

        // Transformed into a list of strings
        List<String> list = List.of(items);
        System.out.println(list);
        // We can see we get an immutible list from the above, so you can not add to that list
        System.out.println(list.getClass().getName());

        // Now lest transform that into and ArrayList which is mutible
        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("yogurt");
        System.out.println(groceries);

        // A more compact way to do list -> arraylist is:
        ArrayList<String> nextList = new ArrayList<>(List.of("chips", "soda", "bread"));
        System.out.println(nextList);

        // We can also add a whole list to an existing ArrayList
        groceries.addAll(nextList);
        System.out.println(groceries);

        //When it comes to an arrayList we use the get method rather than square brackets ie [3]
        System.out.println("Third item on list = " + groceries.get(2));

        //Searching a list we have several options
        // .contains returns a boolean
        if(groceries.contains("milk")) {
            System.out.println("Milk is on the list");
        }
        // indexOf and lastIndexOf return the index (or last index) of the search term or -1 if not found
        // last index is good for list that may have multiple of the same thing if you are looking for last one
        groceries.add("yogurt");
        System.out.println("Yogurt is on the list first at: " + groceries.indexOf("yogurt"));
        System.out.println("Yogurt is also on the list at: " + groceries.lastIndexOf("yogurt"));

        //If we wanted to remove yogurt from our list .remove would only remove the first instance so we use removeAll
        // which requires a list as parameter
        groceries.removeAll(List.of("yogurt"));
        System.out.println(groceries);

        //If we want to remove all but a subset of items we can use retainAll
        groceries.retainAll(List.of("salad", "milk","eggs"));
        System.out.println(groceries);

        //To totally clear out a list we can use clear()
        groceries.clear();
        System.out.println(groceries);
        System.out.println("Is empty? = " + groceries.isEmpty());

        //Lets repopulate out list
        groceries.addAll(List.of("salad", "milk","eggs", "cheese", "tomatoes"));
        groceries.addAll(Arrays.asList("chips", "soda", "bread"));

        //Lest check out a bit of sorting
        System.out.println(groceries);
        groceries.sort(Comparator.naturalOrder());
        System.out.println(groceries);
        groceries.sort(Comparator.reverseOrder());
        System.out.println(groceries);

        //Convert to an array
        var groceryArray = groceries.toArray(new String[groceries.size()]);
        System.out.println(Arrays.toString(groceryArray));









    }
}

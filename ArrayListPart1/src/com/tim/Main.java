package com.tim;

import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String type, int count) {
    public GroceryItem(String name) {
            this(name,"DAIRY",1);
    }
    @Override
    public String toString() {
        return String.format("%d %s in %s", count, name, type);
    }

}
public class Main {
    public static void main(String[] args) {

        // Using the base class like object is not best practice because you can use any object including a plain string
        Object[] groceryList1 = new Object[3];
        groceryList1[0] = new GroceryItem("Milk");
        groceryList1[1] = new GroceryItem("Apples", "PRODUCE", 6);
        groceryList1[2] = "5 oranges";

        // Much better to make a GroceryItem type object list
        GroceryItem[] groceryArray = new GroceryItem[3];
        groceryArray[0] = new GroceryItem("Milk");
        groceryArray[1] = new GroceryItem("Apples", "PRODUCE", 6);
        groceryArray[2] = new GroceryItem("Oranges", "PRODUCE", 5);

        System.out.println(Arrays.toString(groceryArray));

        // Similarly with ArrayList, using the base class raw could mean needing more validation later if
        // unexpected things can be put in the list, for example another string with GroceryItem obj is expected
        // In older code this may exist as it used to be the only type but in modern code use example 2
        ArrayList objectList = new ArrayList();
        objectList.add(new GroceryItem("Butter"));
        objectList.add("Yogurt");

        // The better way where entries much be of type GroceryItem:
        ArrayList<GroceryItem> groceryList = new ArrayList<GroceryItem>();
        groceryList.add(new GroceryItem("Butter"));
        groceryList.add(new GroceryItem("Yogurt"));
        groceryList.add(new GroceryItem("Cheese"));
        groceryList.add(new GroceryItem("Salad", "PRODUCE", 1));
        // Add can also take an index for position, add ice cream at 0
        groceryList.add(0, new GroceryItem("Ice Cream", "DAIRY", 1));
        // The set method can update an entry, change butter to margarine
        groceryList.set(1,new GroceryItem("Margarine"));
        // And a remove method, delete yogurt from list
        groceryList.remove(2);
        System.out.println(groceryList);
        // You can also use ArrayList<GroceryItem> groceryList = new ArrayList<>() for compile time type checking
        // but be sure to not forget the  <> or any type can be added to the ArrayList
    }
}

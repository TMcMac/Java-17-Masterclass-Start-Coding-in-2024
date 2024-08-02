package com.tim;

import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String type, int count) {
    public GroceryItem(String name) {
            this(name,"DAIRY",1);
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
        ArrayList objectList = new ArrayList();
        objectList.add(new GroceryItem("Butter"));
        objectList.add("Yogurt");

        // The better way where entries much be of type GroceryItem:
        ArrayList<GroceryItem> groceryList = new ArrayList<GroceryItem>();
        groceryList.add(new GroceryItem("Butter"));
        groceryList.add(new GroceryItem("Yogurt"));
    }
}

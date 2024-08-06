package com.tmcmac;
// The challenge is to create an interactive program with a menu of options
// 0 - to quit
// 1 - add to shopping list, enter a comma delimited list
// 2 - to remove from shopping list, enter a comma delimited list
// any other entries =  reprompt
// print the existing list in alphabetical order after each entry

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int entry;
        Scanner myScan = new Scanner(System.in);
        ArrayList<String> shoppingList = new ArrayList<>();

        while(true) {
            System.out.println("Please enter 0, 1, or 2:\n" +
                    "0 - Quit\n" +
                    "1-Add to shopping list.\n" +
                    "2-Remove from shopping list.\n");
            entry = myScan.nextInt();

            if(entry == 0) {
                System.out.println("Quitting, thanks!");
                break;
            } else if (entry == 1) {
                shoppingList.addAll(Arrays.asList(addToList()));
            } else if (entry == 2) {
                shoppingList.removeAll(Arrays.asList(removeFromList()));
            }
            shoppingList.sort(Comparator.naturalOrder());

            System.out.println("\n Current Shopping List:\n" + shoppingList);
        }
    }
    public static String[] addToList() {
        Scanner addList = new Scanner(System.in);
        String[] newItems;
        String enteredItems;
        int confirm = 2;

        while(true) {
            System.out.println("Please enter a comma deliminated list of grocery items you would like to add:");
            enteredItems = addList.nextLine();
            System.out.println("You entered: " + enteredItems + "\nIs this correct? 1=Yes 2=No");
            confirm = addList.nextInt();
            addList.nextLine();  // Consume the leftover newline character


            if (confirm == 1) {
                enteredItems = enteredItems.toUpperCase();
                newItems = enteredItems.split(",");
                for(int i = 0; i < newItems.length; i++) {
                    newItems[i] = newItems[i].trim();
                }
                break;
            }
        }
        return newItems;
    }

    public static String[] removeFromList() {
        Scanner remvList = new Scanner(System.in);
        String[] remvItems;
        String enteredItems;
        int confirm;

        while(true) {
            System.out.println("Please enter a comma deliminated list of grocery items you would like to remove:\n");
            enteredItems = remvList.nextLine();
            System.out.println("You entered: " + enteredItems + "\nIs this correct? 1=Yes 2=No\n");
            confirm = remvList.nextInt();
            remvList.nextLine();  // Consume the leftover newline character

            if (confirm == 1) {
                enteredItems = enteredItems.toUpperCase();
                remvItems = enteredItems.split(",");
                for(int i = 0; i < remvItems.length; i++){
                    remvItems[i] = remvItems[i].trim();
                }
                break;
            }
        }
        return remvItems;
    }
}

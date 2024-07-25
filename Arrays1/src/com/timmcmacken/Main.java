package com.timmcmacken;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Array is an object class so we declare it in this way with new
        //Arrays in Java are not resizable, we declare size once and its fixed
        int[] myIntArray = new int[10];
        // Arrays are 0 indexed so this is going in slot 6
        myIntArray[5] = 6;

        // Arrays are typed so I cant put a double in the above or an int in the below
        double[] myDoubleArray = new double[10];
        myDoubleArray[5] = 6.0;

        // YOu can initialize the array if you know the length and content
        String[] names = {"Tim", "Laura", "Andy", "Sarah", "Imogen", "Mordecai"};
        int arrayLength = names.length;
        System.out.println(names[5]);

        // Loop through an array
        for(int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        // An initialized array without assigned values defualts to the basic/defualt value for that type, 0, " ", false, null
        int[] newArray = new int[5];
        for(int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }
        System.out.println();
        for(int i = 0; i < newArray.length; i++) {
            newArray[i] = newArray.length - i;
        }
        // Enhanced for loop for(declaration:collection)
        // declaration contains type and variable name
        // Collection is the array of elements
        for(int i:newArray){
            System.out.printf("%d, ", i);
        }
        System.out.println();
        // The built in array is pretty basic and only get length but the helper class java.util.Arrays has more functionality
        System.out.println(Arrays.toString(newArray));

        // Lets get our random ints array and work on it with some helper functions from util.Arrays
        int[] randoArray = getRandomArray(10);
        System.out.println(Arrays.toString(randoArray));
        // Sort the array
        Arrays.sort(randoArray);
        System.out.println(Arrays.toString(randoArray));
        // Fill an array
        int[] newNewArray = new int[10];
        System.out.println(Arrays.toString(newNewArray));
        Arrays.fill(newNewArray, 5);
        System.out.println(Arrays.toString(newNewArray));

        // Make a copy of all our part of an array
        int[] copyRando = Arrays.copyOf(randoArray, randoArray.length);
        int[] copySomeRando = Arrays.copyOf(randoArray, 5);
        System.out.println(Arrays.toString(copyRando));
        System.out.println(Arrays.toString(copySomeRando));

    }
    private static int[] getRandomArray(int len) {
        // Function to create an integer array of random numbers
        Random random = new Random();
        int[] newInt = new int[len];
        for(int i = 0; i < newInt.length; i++) {
            newInt[i] = random.nextInt(100);
        }
        return newInt;
    }
}

package com.timmcmacken;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

import static java.util.Arrays.*;

public class Main {
    public static void main(String[] args) {
        int[] randoArray = getRandomArray(100);
        System.out.println(Arrays.toString(randoArray));
        Arrays.sort(randoArray);
        System.out.println(Arrays.toString(randoArray));
        int[] reversedArray = reverseArray(randoArray);
        System.out.println(Arrays.toString(reversedArray));
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

    private static  int[] reverseArray(int[] a1) {
        int[] revA1 = new int[a1.length];
        for(int i = 0; i < a1.length; i++) {
            revA1[i] = a1[a1.length - (i + 1)];
        }
        return revA1;
    }

}

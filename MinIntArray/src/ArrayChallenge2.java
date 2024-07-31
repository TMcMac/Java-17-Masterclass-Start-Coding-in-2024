import java.util.Scanner;
import java.util.*;

public class ArrayChallenge2 {

        private static int readInteger() {
            Scanner myScan = new Scanner(System.in);
            int size;
            size = myScan.nextInt();
            if (size > 0) {
                return size;
            }
            return -1;
        }

        private static int[] readElements(int size) {
            int[] myArray = new int[size];
            Scanner myScan = new Scanner(System.in);
            for (int i = 0; i < size; i++) {
                myArray[i] = myScan.nextInt();
            }
            return myArray;
        }

        private static int findMin(int[] myArray) {
            int min = myArray[0];

            for (int i = 0; i < myArray.length; i++) {
                if (myArray[i] < min) {
                    min = myArray[i];
                }
            }
            return min;
        }
    }


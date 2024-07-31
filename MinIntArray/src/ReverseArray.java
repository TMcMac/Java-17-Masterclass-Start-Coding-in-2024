import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] myArray = {0,1,2,3,4,5,6,7,8,9,10,11};
        System.out.println(Arrays.toString(myArray));
        reverseArray(myArray);
        System.out.println(Arrays.toString(myArray));

    }

    public static void reverseArray(int[] theArray) {
        int size = theArray.length;
        int[] newArray = new int[size];

        for(int i = 0; i < size/2; i++) {
            int head = theArray[i];
            int tail = theArray[(size - (i + 1))];
            theArray[i] = tail;
            theArray[(size - (i + 1))] = head;
        }

        System.out.println("Finished reverse");
    }
}

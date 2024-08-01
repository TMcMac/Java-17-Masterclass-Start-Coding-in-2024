import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // You can declare any of these way but int[][] is more obvious
        int[][] doubleArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] doubleArrayTwo = new int[5][5];
        int[] doubleArrayThree[] = new int[4][4];

        // We have an array of arrays now so this will print object addresses
        System.out.println(Arrays.toString(doubleArray) + "\n");

        // printing each internal array as a string will show our three inner arrays
        for(int[] inner : doubleArray) {
            System.out.println(Arrays.toString(inner));
        }
        System.out.println();
        // Same thing but we see our other arrays are initialized with zeros
        for(int[] inner : doubleArrayTwo) {
            System.out.println(Arrays.toString(inner));
        }
        System.out.println();
        // What about traversing the whole 2d array
        for(int i = 0; i < doubleArrayThree.length; i++) {
            var innerArray = doubleArrayThree[i];
            for(int j = 0; j < innerArray.length; j++) {
                System.out.print(doubleArrayThree[i][j] + " ");
            }
            System.out.println();

        }
        System.out.println();

        // Now let's do the previous step but with cleaner code
        for(var inner : doubleArray) {
            for(var element : inner) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        // Finnaly we can print a whole array in one go with deepToString
        System.out.println(Arrays.deepToString(doubleArray));
    }

}

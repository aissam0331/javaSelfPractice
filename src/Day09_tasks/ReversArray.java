package Day09_tasks;

import java.util.Arrays;

public class ReversArray {
    public static void main(String[] args) {
       int [] array = {1,2,3,4,5};
       int [] reversArray = new int[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--,j++) {
            reversArray[j] = array[i];

        }
        System.out.println (Arrays.toString (reversArray));

    }
}

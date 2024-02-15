package Day09_tasks;

import java.util.Arrays;

public class movetheZero {
    public static void main(String[] args) {
        int[]array = {10, 0, 5, 0, 1, 0};
        int [] Move0 = new int[array.length];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (!(array[i]==0)){
                Move0[count] = array[i];
                count++;

            }
        }
        System.out.println (Arrays.toString (Move0) );




    }
}

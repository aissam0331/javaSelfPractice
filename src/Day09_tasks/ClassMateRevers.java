package Day09_tasks;

import javax.sound.sampled.ReverbType;
import java.util.Arrays;

public class ClassMateRevers {
    public static void main(String[] args) {
        String[] classmate = {"ali bou", "aiss bal", "ahmed siko", "janet mita", "sima oko"};
        String[] result = reversArray (classmate);
        System.out.println(Arrays.toString (result ) );
        for (String each : result) {
            System.out.println (each );

        }
    }
    public static String[] reversArray(String[] array) {
        String[] reversarray = new String[array.length];
        for (int i = reversarray.length - 1, j = 0; i >= 0; i--, j++) {
            reversarray[j] = array[i];
        }
        return reversarray;
    }
}
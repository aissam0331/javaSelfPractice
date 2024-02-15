package day10_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Replace0 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<> (  );
        list.addAll (Arrays.asList (1,0,2,0,3,0,4));
        int cout0 = Collections.frequency (list,0);
        list.removeAll (Arrays.asList (0));
        System.out.println (list );
        for (int i = 0; i <cout0 ; i++) {
            list.add (0);


        }
        System.out.println (list );



    }
}

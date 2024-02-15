package day10_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RemoveL {
    public static void main(String[] args) {

        ArrayList<Character> list = new ArrayList<> ( );
        list.addAll (Arrays.asList ('$','A','B','1','2','c','d','@','!','3','4'));
        list.removeIf (p-> Character.isLetter (p));
        System.out.println (list );
    }
}

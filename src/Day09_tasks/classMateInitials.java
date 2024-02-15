package Day09_tasks;

import java.util.Arrays;

public class classMateInitials {
    public static void main(String[] args) {
        String[] names = {"Ali Bou", "Aiss Elk", "Sami ZA", "Abid YAt"};
        String[] initials = new String[names.length];


        for (int i = 0; i < names.length; i++) {
            String eachName = names[i];
            initials[i]  = eachName.charAt (0)+" "+eachName.charAt (eachName.indexOf (" ")+1);





        }
        System.out.println (Arrays.toString (initials) );
    }
}

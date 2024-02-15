package day10_tasks;

public class Letter_Digit_num {
    public static void main(String[] args) {
        String str = "Wooden Spoon123!";
        String digits ="";
        String letters ="";
        String SpecialChar = "";
        for (char each : str.toCharArray ()){
            if (Character.isDigit (each)){
                digits+=each;
            } else if (Character.isLetter (each)) {
                letters+=each;

            }else{
                SpecialChar+=each;
            }


        }
        System.out.println ("dig = " + digits );
        System.out.println ("letr = " + letters );
        System.out.println ("SC = " + SpecialChar );




    }
}

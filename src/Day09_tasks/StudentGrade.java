package Day09_tasks;

import java.util.Arrays;

public class StudentGrade {
    public static void main(String[] args) {

        String[] names = {"Anna", "Nancy", "Sarah"};
        int[] score = {90, 75, 80};
        char[] grade = {'A','B','C'};

        for (int i = 0; i < score.length; i++) {
            if (score[i] >= 90){
                grade[i]='A';
            } else if (score[i]>=80) {
                grade[i]='B';

            } else if (score[i]>=75) {
                grade[i]='C';

            }else ;

        }
        System.out.println (Arrays.toString (grade));

        for (int i = 0; i < names.length; i++) {
            System.out.println (names[i]+"'s "+ " Score is "+score[i]+ "," + " and Grade is "+ grade[i] );

        }


            }

        }




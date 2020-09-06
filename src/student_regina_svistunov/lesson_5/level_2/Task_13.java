package student_regina_svistunov.lesson_5.level_2;

import java.util.Arrays;

public class Task_13 {

    public static void main(String[] args) {

        int arraySum[] = {6,12,2};
        int sum=0;

        for(int i = 0; i < arraySum.length; i++) {
            sum+=+arraySum[i];
        }

        System.out.println(" Sum of array numbers: " + sum);
    }
}

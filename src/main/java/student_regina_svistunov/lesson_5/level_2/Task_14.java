package student_regina_svistunov.lesson_5.level_2;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Task_14 {

    public static void main(String[] args) {

        int arrayNumbers[] = {7,10,4};
        double sum = 0;
        for (int x: arrayNumbers) {
            sum += x;
    }
        System.out.println("Average of array numbers is: " + sum/arrayNumbers.length);
}
}

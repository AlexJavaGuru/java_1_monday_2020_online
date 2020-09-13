package student_dmitry_vasiliev.lesson_5.level_4;

import teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
class Task_25Demo {

    public static void main(String[] args) {

        Task_25 array = new Task_25();

        int[] arrayLengthFromUser = array.arrayLengthFromUser();
        array.fillNewArray(arrayLengthFromUser);
        String str = array.convertArrayToString(arrayLengthFromUser);

        System.out.println(str);
    }
}

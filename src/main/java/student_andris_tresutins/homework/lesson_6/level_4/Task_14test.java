package student_andris_tresutins.homework.lesson_6.level_4;

import student_renars_ranka.homework.lesson_2.level_1.Task_1;
import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

import java.util.Arrays;

@CodeReview(approved = true)
public class Task_14test {

    public static void main(String[] args) {
        Task_14test test = new Task_14test();
        test.sortArrayTest();
    }

    public void sortArrayTest(){
        Task_14 victim = new Task_14();

        int[] array = {3, 7, 12, 54, 458};
        int[] arraycompare = victim.sortArray(victim.arrayOne());


        boolean actualresult = Arrays.equals(array, arraycompare);
        boolean expectedresult = true;


        check(expectedresult, actualresult, "Sort Array test");


    }

    public void check(boolean expectedRes, boolean result, String testName) {

        if (expectedRes == result) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " failed!");
            System.out.println("Expected result was : " + expectedRes + " but actual result was : " + result);
        }
    }
}

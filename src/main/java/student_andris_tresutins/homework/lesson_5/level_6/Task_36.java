package student_andris_tresutins.homework.lesson_5.level_6;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Same issue here," +
        "Wrong method signature. If I want to create a method, to find the max number in array," +
        "I must pass an array as argument. Utility class, is the class (AKA Helper) to assist you " +
        "with some things. In this case, ArrayUtils is the class which must help you work with arrays" +
        "" +
        "Still false. your method findMaxNumber is not working with argument you pass to it...it creates a new array instead? Read my comment carefully" +
        "The method MUST work with any arrays...not only with created inside")
public class Task_36 {

    public static void main(String[] args) {
        Task_36 victim = new Task_36();
        System.out.println(victim.findMaxNumber(victim.staticArray()));
    }

    public int[] staticArray() {

        int[] array = {15, 24, 17, 99, 15};
        return array;
    }

    public int findMaxNumber(int[] array) {


        int max = array[1];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }

        }
        return max;

    }
}

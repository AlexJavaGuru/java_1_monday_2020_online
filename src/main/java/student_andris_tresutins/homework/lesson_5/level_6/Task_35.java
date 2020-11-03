package student_andris_tresutins.homework.lesson_5.level_6;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

import java.util.Arrays;

@CodeReview(approved = false)
@CodeReviewComment(comment = "It would be much better if you put the peace of code here..." +
        "It might be ArrayUtilsTask35 for example and contain only one method" +
        "The problem with the code: the code is wrong =)" +
        "You must create a method for printing array to the console." +
        "Your method is taking a length, creating array and then print." +
        "I don't want it. If method is called printArrayToConsole -> this method should" +
        "simply take an array and print it." +
        "P.S. you can see method signatures in the task. " +
        "" +
        "Still false. Why method printArrayToConsole does some strange actions? creating victim object? or save array into print? why to use this?")

class Task_35 {
    public static void main(String[] args) {
        Task_35 victim = new Task_35();
        victim.printArrayToConsole(victim.staticArray());
    }

    public int[] staticArray() {

        int[] array = {15, 24, 17, 99, 15};
        return array;
    }

    public void printArrayToConsole(int[] array) {

        System.out.println(Arrays.toString(array));

    }
}

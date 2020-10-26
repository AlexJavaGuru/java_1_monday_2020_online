package student_andris_tresutins.homework.lesson_6.level_4;
import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

import java.util.Arrays;

@CodeReview(approved = false)
@CodeReviewComment(comment = "It is unclear where is this method. Please move them into appropriate classes so I could find them." +
        "" +
        "why you create victim? and why arrayOne is here? ")
public class Task_14 {

    public int[] arrayOne (){
        int[] array = {12, 54, 3, 7, 458};
        return array;
    }

    public int[] sortArray(int[] array) {

        Task_14 victim = new Task_14();

        Arrays.sort(array);
        return array;

    }


}

package student_andris_tresutins.homework.lesson_6.level_4;
import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

import java.util.Arrays;

@CodeReview(approved = false)
@CodeReviewComment(comment = "It is unclear where is this method. Please move them into appropriate classes so I could find them." +
        "" +
        "why you create victim? and why arrayOne is here? ")
public class Task_14 {


    public int[] sortArray(int[] array) {

        Arrays.sort(array);
        return array;

    }


}

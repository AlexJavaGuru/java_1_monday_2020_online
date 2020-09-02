package student_artur_martinenko.homework.lesson_5.level_4;

import student_artur_martinenko.homework.lesson_5.level_5.ArrayUtil;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

import java.util.ArrayList;
import java.util.Arrays;

@CodeReview(approved = true)
@CodeReviewComment(comment = "ArrayList это не совсем массив =) Почему решили использовать?")
class Task_29 {

    public static void main(String[] args) {

        int[] myArray = new int[14];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (Math.random() * 117);
        }
        System.out.println(Arrays.toString(myArray));

//        ArrayList<Integer> evenNumberArray = new ArrayList<>();
//        for (int i = 0; i < myArray.length; i++) {
//            if (myArray[i] % 2 == 0 && myArray[i] != 0) {
//                evenNumberArray.add(myArray[i]);
//            }
//        }

        ArrayUtil arrayUtil = new ArrayUtil();
        ArrayList<Integer> evenNumberArray = arrayUtil.findEvenNumber(myArray);

        System.out.println("\nEven number ArrayList = " + evenNumberArray);

    }

}

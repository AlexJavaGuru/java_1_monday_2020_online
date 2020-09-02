package student_artur_martinenko.homework.lesson_5.level_1;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Task_8 {
}

class ArrayLength2 {

    public static void main(String[] args) {
        int[] numbers = new int[2];
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
//        System.out.println(numbers[2]);   //will not work since the index will be out of bounds.
    }

}

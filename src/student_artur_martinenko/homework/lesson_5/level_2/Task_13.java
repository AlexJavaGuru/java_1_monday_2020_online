package student_artur_martinenko.homework.lesson_5.level_2;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Task_13 {

    public static void main(String[] args) {
        int[] regularArray = new int[3];

        for (int i = 0; i < regularArray.length; i++) {
            regularArray[i] = (int) (Math.random() * 10);
        }

        int sum = 0;
        for (int i : regularArray) {
            sum += i;
        }
        System.out.println(sum);
        System.out.println(sum / regularArray.length);
    }
}

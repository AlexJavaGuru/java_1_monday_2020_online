package student_elizabete_ket.homework.lesson_5.level_2;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Task_10 {

    public static void main(String[] args) {

        int[] numbers = new int[3];

        numbers[0] = 15;
        numbers[1] = 69;
        numbers[2] = 5;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("[" + i + "] = " + numbers[i]);
        }


//        for (int number : numbers) {
//            System.out.println(number);
//        }
    }
}

package student_arturs_arusanovs.lesson_5.level_2;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Task_10 {

    public static void main(String[] args) {

        int[] numbers = new int[3];
            numbers[0] = 2;
            numbers[1] = 4;
            numbers[2] = 6;

        for(int i=0; i<numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}

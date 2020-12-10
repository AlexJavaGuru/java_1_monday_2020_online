package student_alexander_shl.homework.lesson_5.level_2;
/*
Task_10: Написать программу, в которой:
 - создать массив целых чисел длиной 3,
 - заполнить каждую ячейку массива любым числом,
 - вывести значение каждой ячейки на консоль.
 */

class Task_10 {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        for (int i = 0; i < 3; i++) {
            System.out.println("number[" + i + "] = " + numbers[i]);
        }
    }
}

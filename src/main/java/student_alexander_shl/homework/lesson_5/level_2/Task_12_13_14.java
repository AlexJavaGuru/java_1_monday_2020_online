package student_alexander_shl.homework.lesson_5.level_2;

/* Task_12: Написать программу, в которой:
 - создать массив целых чисел длиной 3,
 - заполнить каждую ячейку массива случайным числом,
 - вывести значение каждой ячейки на консоль.

 Task_13: Написать программу, в которой:
 - создать массив целых чисел длиной 3,
 - заполнить каждую ячейку массива случайным числом,
 - посчитать сумму всех ячеек и вывести ее на консоль.

 Task_14: Написать программу, в которой:
 - создать массив целых чисел длиной 3,
 - заполнить каждую ячейку массива случайным числом,
 - посчитать среднее значение и вывести его на консоль.

 */

class Task_12_13_14 {

    public static void main(String[] args) {

        int[] numbers = new int[3];
        int sumResult = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100);
            sumResult = sumResult + numbers[i];
        }

        System.out.println("\nRandom array: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("number[" + i + "] = " + numbers[i]);
        }
        System.out.println("\nSum of arrays is : " + sumResult);
        System.out.println("\nArithmetic mean of arrays is : " + sumResult/numbers.length);
    }
}

package student_alexander_shl.homework.lesson_5.level_2;

/* Написать программу, в которой:
 - создать массив целых чисел длиной 3,
 - заполнить каждую ячейку массива случайным числом,
 - вывести значение каждой ячейки на консоль,
 - увеличить значение каждой ячейки на 2,
 - вывести значение каждой ячейки на консоль.
 */

class Task_15 {

    public static void main(String[] args) {

        int[] numbers = new int[3];
        int[] result = new int[3];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100);
            result[i] = numbers[i] + 2;
        }

        System.out.println("\nRandom array: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("number[" + i + "] = " + numbers[i]);
        }
        System.out.println("\nResult array: ");
        for (int i = 0; i < result.length; i++) {
            System.out.println("result[" + i + "] = " + result[i]);
        }
    }
}

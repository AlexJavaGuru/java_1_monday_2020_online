package student_arturs_arusanovs.lesson_5.level_2;

class Task_13 {

    public static void main (String[] args) {

        int[] numbers = {3, 6, 9};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }

        System.out.println("Sum = " + sum);
    }
}

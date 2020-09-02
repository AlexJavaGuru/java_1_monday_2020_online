package student_arturs_arusanovs.lesson_5.level_4;

class Task_29 {

    public static void main(String[] args) {

        int[] numbers = {2, 9, 35, 7, 98, 45, 74, 16};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("[" + i + "] = " + numbers[i]);
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]%2 == 0) {
                System.out.println("Even numbers in arrays : " + numbers[i]);
            }
        }
    }
}

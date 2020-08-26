package student_artur_martinenko.homework.lesson_5.level_2;

class Task_15 {

    public static void main(String[] args) {
        int[] regularArray = new int[3];

        for (int i = 0; i < regularArray.length; i++) {
            regularArray[i] = (int) (Math.random() * 10);
        }

        for (int i : regularArray) {
            System.out.println(i);
        }

        for (int i = 0; i < regularArray.length; i++) {
            regularArray[i] += 2;
        }

        System.out.print("\n");
        for (int i : regularArray) {
            System.out.println(i);
        }


    }
}

package student_aleksejs_ivanovs.homework.lesson_6.level_4;

class Task_17 {

    public static void main(String[] args) {
        int j = 0;
        while (j > -1) {
            for (int i = 0; i > -1; i++) {
                System.out.println(i);
                if (i == 10) {
                    break;
                }
            }
            if (j == 5) {
                break;
            }
            j++;
        }
    }

}

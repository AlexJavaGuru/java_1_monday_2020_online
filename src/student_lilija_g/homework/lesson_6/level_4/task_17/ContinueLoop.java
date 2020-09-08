package student_lilija_g.homework.lesson_6.level_4.task_17;

class ContinueLoop {

    public static void main(String[] args) {

        // while :
        int j = 0;
        while (j < 10) {
            System.out.print(j + " ");
            if (j % 2 == 0) {       // если число четное, не переходим на новую строку.
                continue;
            }
            System.out.println(""); // переход на новую строку. Происходит при нечетных числах.
        }

        // for:
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
            if (i % 2 == 0) {       // если число четное, не переходим на новую строку.
                continue;
            }
            System.out.println(""); // переход на новую строку. Происходит при нечетных числах.
        }
    }
}

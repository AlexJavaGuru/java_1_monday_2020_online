package student_lilija_g.homework.lesson_6.level_4.task_17;

class BreakLoop {
    public static void main(String[] args) {

        // while :
        int i = 0;
        while (i != 4) {
            System.out.println("i: " + i);
            i++;
        }
        System.out.println("While: Process completed.");

        // for :
        for (int j = 0; ; j++) {
            if (j == 4) {
                break;
            }
            System.out.println("j: " + j);
        }
        System.out.println("For: Process completed.");
    }
}



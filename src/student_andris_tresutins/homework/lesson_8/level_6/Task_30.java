package student_andris_tresutins.homework.lesson_8.level_6;

public class Task_30 {

    public static void main(String[] args) {
        varargs(99);
        varargs(1, 2, 3, 4);
        varargs();
    }

    static void varargs(int ...arguments)
    {
        System.out.println("Number of arguments: " + arguments.length);

        for (int i: arguments)
            System.out.print(i + " ");
        System.out.println();
    }
}

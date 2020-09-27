package student_artur_martinenko.homework.lesson_8.level_6_middle;

class Task_30 {

    public static void main(String[] args) {
        Task_30 victim = new Task_30();
        victim.varargs("The numbers from Variable Argument: ", 1, 2, 3, 4, 5, 6);
    }

    public void varargs(String text, int ...numbers){
        System.out.println(text);
        for(int i : numbers){
            System.out.println(i);
        }
    }
}

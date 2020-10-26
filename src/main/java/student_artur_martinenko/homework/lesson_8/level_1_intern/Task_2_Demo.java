package student_artur_martinenko.homework.lesson_8.level_1_intern;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Task_2_Demo {
    public static void main(String[] args) {
        Task_2 victimOne = new Task_2();    //default constructor is NOT created by java compiler automatically
        Task_2 victimTwo = new Task_2("Artur", 35);
    }

}

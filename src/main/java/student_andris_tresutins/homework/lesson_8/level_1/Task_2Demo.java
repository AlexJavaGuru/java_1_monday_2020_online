package student_andris_tresutins.homework.lesson_8.level_1;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Task_2Demo {
    public static void main(String[] args) {

        Task_2 victim = new Task_2();

        victim.setText("test");
        System.out.println(victim.getText());
    }
}

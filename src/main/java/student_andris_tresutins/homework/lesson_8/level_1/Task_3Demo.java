package student_andris_tresutins.homework.lesson_8.level_1;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Task_3Demo {

    public static void main(String[] args) {
        Task_3 victim = new Task_3("Jeff Duningham", 65,"Jumpstreet 22");
        System.out.println(victim.getInfo());

    }

}

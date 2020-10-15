package student_andris_tresutins.homework.lesson_9.level_3;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class SuperClassConstructorInvoker {
    public SuperClassConstructorInvoker() {
        super();
        System.out.println(1);
        System.out.println(2);
    }
}

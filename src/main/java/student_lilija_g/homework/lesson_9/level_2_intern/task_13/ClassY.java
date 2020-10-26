package student_lilija_g.homework.lesson_9.level_2_intern.task_13;
/*
В коде ниже допущена ошибка. Исправьте её.
Вносить изменения можно только в класс ClassY.

class ClassX {
    public ClassX(int i) {
        System.out.println(1);
    }
}

class ClassY extends ClassX {
    public ClassY() {
        System.out.println(2);
    }
}
 */

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class ClassY extends ClassX {
    public ClassY(int i) {
        super(i);
        System.out.println(2);
    }
}

package student_aleksejs_ivanovs.homework.lesson_9.level_2.task_13;

import teacher.annotations.CodeReview;

/*В коде ниже допущена ошибка. Исправьте её.
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
}*/
@CodeReview(approved = true)
class ClassY extends ClassX{

    public ClassY(int i) {
        super(i);
        System.out.println(2);
    }

}

package student_artur_martinenko.homework.lesson_9.level_2_intern;

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
class Task_13 {
}

class ClassX {
    public ClassX(int i) {
        System.out.println(1);
    }
}

class ClassY extends ClassX {
    public ClassY(int i) {
        super(i);
        System.out.println(2);
    }
}

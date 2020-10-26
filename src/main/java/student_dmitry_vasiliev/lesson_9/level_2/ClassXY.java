package student_dmitry_vasiliev.lesson_9.level_2;

// - Task_13
// В коде ниже допущена ошибка. Исправьте её.
// Вносить изменения можно только в класс ClassY.

class ClassX {
    public ClassX(int i) {
        System.out.println(1);
    }
}

class ClassY extends ClassX {
    public ClassY() {
        super(3);
        System.out.println(2);
    }
}

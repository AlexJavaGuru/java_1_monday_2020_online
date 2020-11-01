package student_dmitry_vasiliev.lesson_9.level_2;

// - Task_10
// Дан класс ConstructorChaining.
//    Создайте в этом классе публичный конструктор с двумя параметрами.
//        Внутри этого конструктора первой строкой вызовите приватный конструктор
//        с одним параметром.
//
//        Более подробно про этот подход можно прочитать: constructor chaining in Java.

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class ConstructorChaining {

    private String constructorName;
    private int parameterCount;

    private ConstructorChaining(String constructorName) {
        this.constructorName = constructorName;
    }

    // допишите решение тут

    public ConstructorChaining() {
        this("Chain");
            System.out.println(constructorName);
    }


}

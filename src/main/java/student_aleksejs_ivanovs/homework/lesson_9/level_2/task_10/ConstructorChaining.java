package student_aleksejs_ivanovs.homework.lesson_9.level_2.task_10;

/*Дан класс ConstructorChaining.

class ConstructorChaining {

    private String constructorName;
    private int parameterCount;

    private ConstructorChaining(String constructorName) {
        this.constructorName = constructorName;
    }

    // допишите решение тут

}

Создайте в этом классе публичный конструктор с двумя параметрами.
Внутри этого конструктора первой строкой вызовите приватный конструктор с одним параметром.

Более подробно про этот подход можно прочитать: constructor chaining in Java.*/

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Вам надо было вызвать конструктор передав туда параметр приходящий в первый конструктор, а не просто стринг")
class ConstructorChaining {

    private String constructorName;
    private int parameterCount;

    private ConstructorChaining(String constructorName) {
        this.constructorName = constructorName;
    }

    public ConstructorChaining(String constructorName, int parameterCount) {
        new ConstructorChaining("constructorName");
        this.parameterCount = parameterCount;
    }

}

package student_dmitry_vasiliev.lesson_9.level_2;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

// - Task_9
/*Создайте класс PrivateConstructor.
        Создайте класс PrivateConstructorDemo и в его main() методе создайте инстанцию класса PrivateConstructor.
        После этого сделайте так, что бы инстанцию класса PrivateConstructor нельзя было создать
        в демо классе. Подсказка кроется в названии класса!
        PS: не забудьте закоментировать не компилирующийся код в демо классе.*/
@CodeReview(approved = false)
@CodeReviewComment(comment = "Вам надо сделать такой конструктор, который нельзя " +
        "будет вызвать в demo классе. Однако, я могу это сделать =)")
class PrivateConstructor {


    private PrivateConstructor() {

    }

}


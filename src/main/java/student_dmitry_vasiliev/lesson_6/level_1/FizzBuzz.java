package student_dmitry_vasiliev.lesson_6.level_1;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

/*Разберитесь, что делает класс указанный ниже.
        Это реализация одного из супер тасков предыдущего урока.
        Создайте класс FizzBuzzTest и напишите автоматические тесты
        на все сценарии. Упростите FizzBuzz класс!
        Убедитесь, что после упрощения автоматические тесты все проходят.

        PS: а нужно ли свойство класса initialNumber?
        Или метод detect можно реализовать без него?

 */
@CodeReview(approved = false)
@CodeReviewComment(comment = "Дмитрий, я не вижу исправления класса. Он все так же не красиво выглядит. Надо ним надо поработать...не просто закомментить переменную =D")
class FizzBuzz {

        //private int initialNumber;

        public String detect(int number) {
        boolean firstExpression = (number % 3 == 0);
        boolean secondExpression = (number % 5 == 0);
            if (firstExpression && secondExpression) return "FizzBuzz";
            else if (firstExpression) return "Fizz";
            else if (secondExpression) return "Buzz";
            else return "" + number; // Integer.toString(initialNumber);

        }

}

